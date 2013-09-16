package SAX;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.SAXException;

public class SampleSAXParser {

    SAXParserFactory saxpf;
    SAXParser saxp;

    public SampleSAXParser() {
        saxpf = SAXParserFactory.newInstance();
        try {
            saxp = saxpf.newSAXParser();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(SampleSAXParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(SampleSAXParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String GenerateXmlFile(String xmlCompany, String cvXml, String employmentXml, String transcriptXml) {
        try {
            SAXCompany saxcomany = new SAXCompany();
            SAXCV saxcv = new SAXCV();
            SAXEmployment saxemployment = new SAXEmployment();
            SAXTranscript saxtranscript = new SAXTranscript();

            InputStream empIs = new ByteArrayInputStream(employmentXml.getBytes("UTF-8"));
            InputStream comIs = new ByteArrayInputStream(xmlCompany.getBytes("UTF-8"));
            InputStream cvIs = new ByteArrayInputStream(cvXml.getBytes("UTF-8"));
            InputStream transIs = new ByteArrayInputStream(transcriptXml.getBytes("UTF-8"));

            saxp.parse(comIs, saxcomany);
            saxp.parse(cvIs, saxcv);
            saxp.parse(empIs, saxemployment);
            saxp.parse(transIs, saxtranscript);

            Company company = saxcomany.company;
            CV cv = saxcv.cv;
            Employment employment = saxemployment.employment;
            Transcript transcript = saxtranscript.transcript;

            StringBuilder strBldr = new StringBuilder();

            //PrintWriter pw = new PrintWriter("D:\\Profile.xml");

            strBldr.append("<profile>");
            strBldr.append("<personalinfo>");
            strBldr.append("<name>");
            strBldr.append(cv.name);
            strBldr.append("</name>");
            strBldr.append("<licenseid>");
            strBldr.append(String.valueOf(cv.licenseid));
            strBldr.append("</licenseid>");
            strBldr.append("<hobbies>");
            for (String hobby : cv.hobbies) {
                strBldr.append("<hobby>");
                strBldr.append(hobby);
                strBldr.append("</hobby>");
            }
            strBldr.append("</hobbies>");
            strBldr.append("</personalinfo>");
            strBldr.append("<workexperience>");
            for (Job job : employment.jobs) {
                strBldr.append("<job>");
                strBldr.append("<company>");
                strBldr.append("<name>");
                strBldr.append(company.name);
                strBldr.append("</name>");
                strBldr.append("<address>");
                strBldr.append(company.address);
                strBldr.append("</address>");
                strBldr.append("</company>");
                strBldr.append("<position>");
                strBldr.append(job.position);
                strBldr.append("</position>");
                strBldr.append("<year>");
                strBldr.append(String.valueOf(job.year));
                strBldr.append("</year>");
                strBldr.append("</job>");
            }
            strBldr.append("</workexperience>");
            strBldr.append("<education>");

            strBldr.append("<university>");
            strBldr.append(transcript.university);
            strBldr.append("</university>");
            strBldr.append("<degree>");
            strBldr.append(transcript.degree);
            strBldr.append("</degree>");
            strBldr.append("<year>");
            strBldr.append(String.valueOf(transcript.year));
            strBldr.append("</year>");
            int sum = 0;
            for (Course course : transcript.courses) {
                sum += course.grade;
            }
            strBldr.append("<GPA>");
            strBldr.append(String.valueOf((sum / transcript.courses.size())));
            strBldr.append("</GPA>");
            strBldr.append("</education>");
            strBldr.append("</profile>");
            return strBldr.toString();

        } catch (Exception ex) {
            ex.printStackTrace();
            return "";
        }
    }
}


