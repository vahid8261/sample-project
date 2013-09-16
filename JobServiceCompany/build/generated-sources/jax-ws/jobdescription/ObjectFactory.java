
package jobdescription;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jobdescription package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetJobsResponse_QNAME = new QName("http://services/", "getJobsResponse");
    private final static QName _GetJobs_QNAME = new QName("http://services/", "getJobs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jobdescription
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetJobsResponse }
     * 
     */
    public GetJobsResponse createGetJobsResponse() {
        return new GetJobsResponse();
    }

    /**
     * Create an instance of {@link GetJobs }
     * 
     */
    public GetJobs createGetJobs() {
        return new GetJobs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getJobsResponse")
    public JAXBElement<GetJobsResponse> createGetJobsResponse(GetJobsResponse value) {
        return new JAXBElement<GetJobsResponse>(_GetJobsResponse_QNAME, GetJobsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJobs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getJobs")
    public JAXBElement<GetJobs> createGetJobs(GetJobs value) {
        return new JAXBElement<GetJobs>(_GetJobs_QNAME, GetJobs.class, null, value);
    }

}
