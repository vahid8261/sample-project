package SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXEmployment extends DefaultHandler{
	public Employment employment;
	public String temp;
	public Job job;

	public SAXEmployment()
    {
    	employment = new Employment();
    }

	@Override
    public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
    	if(arg2.equalsIgnoreCase("ens:job"))
    		job = new Job();
    }
	
    @Override
    public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
    	temp = new String(arg0, arg1, arg2);
    }

    @Override
    public void endElement(String arg0, String arg1, String arg2) throws SAXException {
    	if(arg2.equalsIgnoreCase("ens:name"))
    		employment.name = temp;
    	else if(arg2.equalsIgnoreCase("ens:company"))
    		job.company = temp;
    	else if(arg2.equalsIgnoreCase("ens:position"))
    		job.position = temp;
    	else if(arg2.equalsIgnoreCase("ens:year"))
    		job.year = Integer.parseInt(temp);
    	else if(arg2.equalsIgnoreCase("ens:job"))
    		employment.jobs.add(job);
    }
}
