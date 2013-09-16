package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXTranscript extends DefaultHandler {
	public Transcript transcript;
	public String temp;
	public Course course;

	public SAXTranscript() {
		transcript = new Transcript();
		course = null;
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		if (arg2.equalsIgnoreCase("tns:course"))
			course = new Course();
	}

	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		temp = new String(arg0, arg1, arg2);
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {
		if (arg2.equalsIgnoreCase("tns:year"))
			transcript.year = Integer.parseInt(temp);
		else if (arg2.equalsIgnoreCase("tns:degree"))
			transcript.degree = temp;
		else if (arg2.equalsIgnoreCase("tns:university"))
			transcript.university = temp;
		else if (arg2.equalsIgnoreCase("tns:name")) {
			if (course != null)
				course.name = temp;
			else
				transcript.name = temp;
		} else if (arg2.equalsIgnoreCase("tns:grade"))
			course.grade = Integer.parseInt(temp);
		else if (arg2.equalsIgnoreCase("tns:course"))
			transcript.courses.add(course);
	}
}
