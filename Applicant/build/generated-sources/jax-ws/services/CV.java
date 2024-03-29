
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CV", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CV {


    /**
     * 
     * @param cvxml
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadCV", targetNamespace = "http://services/", className = "services.UploadCV")
    @ResponseWrapper(localName = "uploadCVResponse", targetNamespace = "http://services/", className = "services.UploadCVResponse")
    @Action(input = "http://services/CV/uploadCVRequest", output = "http://services/CV/uploadCVResponse")
    public String uploadCV(
        @WebParam(name = "CVXML", targetNamespace = "")
        String cvxml);

}
