package SAX;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXCV extends DefaultHandler{
    public CV cv;
	public String temp;

	public SAXCV()
    {
    	cv = new CV();
    }

    @Override
    public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
    	temp = new String(arg0, arg1, arg2);
    }

    @Override
    public void endElement(String arg0, String arg1, String arg2) throws SAXException {
    	if(arg2.equalsIgnoreCase("cvns:name"))
    		cv.name = temp;
    	else if(arg2.equalsIgnoreCase("cvns:licenseid"))
    		cv.licenseid = Integer.parseInt(temp);
    	else if(arg2.equalsIgnoreCase("cvns:hobby"))
    		cv.hobbies.add(temp);
    }
}
