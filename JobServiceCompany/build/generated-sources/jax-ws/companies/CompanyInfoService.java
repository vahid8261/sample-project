
package companies;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CompanyInfoService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8084/CompaniesDatabase/CompanyInfo?wsdl")
public class CompanyInfoService
    extends Service
{

    private final static URL COMPANYINFOSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMPANYINFOSERVICE_EXCEPTION;
    private final static QName COMPANYINFOSERVICE_QNAME = new QName("http://services/", "CompanyInfoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/CompaniesDatabase/CompanyInfo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPANYINFOSERVICE_WSDL_LOCATION = url;
        COMPANYINFOSERVICE_EXCEPTION = e;
    }

    public CompanyInfoService() {
        super(__getWsdlLocation(), COMPANYINFOSERVICE_QNAME);
    }

    public CompanyInfoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPANYINFOSERVICE_QNAME, features);
    }

    public CompanyInfoService(URL wsdlLocation) {
        super(wsdlLocation, COMPANYINFOSERVICE_QNAME);
    }

    public CompanyInfoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPANYINFOSERVICE_QNAME, features);
    }

    public CompanyInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompanyInfoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CompanyInfo
     */
    @WebEndpoint(name = "CompanyInfoPort")
    public CompanyInfo getCompanyInfoPort() {
        return super.getPort(new QName("http://services/", "CompanyInfoPort"), CompanyInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompanyInfo
     */
    @WebEndpoint(name = "CompanyInfoPort")
    public CompanyInfo getCompanyInfoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "CompanyInfoPort"), CompanyInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPANYINFOSERVICE_EXCEPTION!= null) {
            throw COMPANYINFOSERVICE_EXCEPTION;
        }
        return COMPANYINFOSERVICE_WSDL_LOCATION;
    }

}
