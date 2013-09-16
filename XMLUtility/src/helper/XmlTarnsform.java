package helper;




import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vahid
 */
public class XmlTarnsform {

    public static String xmlFile2String(String fileName) {

        String st = null;

        try {

            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();

            InputSource is = new InputSource(fileName);

            Document document = docBuilderFactory.newDocumentBuilder().parse(is);

            StringWriter sw = new StringWriter();

            Transformer serializer = TransformerFactory.newInstance().newTransformer();

            serializer.transform(new DOMSource(document), new StreamResult(sw));

            st = sw.toString();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return st;

    }
}
