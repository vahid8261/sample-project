/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package applicant;

import services.*;
import helper.XmlTarnsform;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cvXML = XmlTarnsform.xmlFile2String("src/xml/cv.xml");

        CVService service = new CVService();
        CV cv = service.getCVPort();
        String s = cv.uploadCV(cvXML);
        System.out.println(s);
    }

}
