package SAX;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXCompany extends DefaultHandler{
	public Company company;
	public String temp;
	public SAXCompany()
	{
		this.company = new Company();
	}

    @Override
    public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
    	temp = new String(arg0, arg1, arg2);
    }

    @Override
    public void endElement(String arg0, String arg1, String arg2) throws SAXException {
    	if(arg2.equalsIgnoreCase("cns:name"))
    		company.name = temp;
    	else if(arg2.equalsIgnoreCase("cns:address"))
    		company.address = temp;
    	else if(arg2.equalsIgnoreCase("cns:noemploees"))
    		company.noemploees = Integer.parseInt(temp);
    }
}
