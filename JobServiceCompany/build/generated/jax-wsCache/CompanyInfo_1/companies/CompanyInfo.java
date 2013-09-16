
package companies;

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
@WebService(name = "CompanyInfo", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CompanyInfo {


    /**
     * 
     * @param personname
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompanyInfo", targetNamespace = "http://services/", className = "companies.GetCompanyInfo")
    @ResponseWrapper(localName = "getCompanyInfoResponse", targetNamespace = "http://services/", className = "companies.GetCompanyInfoResponse")
    @Action(input = "http://services/CompanyInfo/getCompanyInfoRequest", output = "http://services/CompanyInfo/getCompanyInfoResponse")
    public String getCompanyInfo(
        @WebParam(name = "personname", targetNamespace = "")
        String personname);

}