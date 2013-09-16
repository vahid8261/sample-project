
package university;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the university package. 
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

    private final static QName _GetTranscriptResponse_QNAME = new QName("http://services/", "getTranscriptResponse");
    private final static QName _GetTranscript_QNAME = new QName("http://services/", "getTranscript");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: university
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTranscriptResponse }
     * 
     */
    public GetTranscriptResponse createGetTranscriptResponse() {
        return new GetTranscriptResponse();
    }

    /**
     * Create an instance of {@link GetTranscript }
     * 
     */
    public GetTranscript createGetTranscript() {
        return new GetTranscript();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscriptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getTranscriptResponse")
    public JAXBElement<GetTranscriptResponse> createGetTranscriptResponse(GetTranscriptResponse value) {
        return new JAXBElement<GetTranscriptResponse>(_GetTranscriptResponse_QNAME, GetTranscriptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTranscript }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getTranscript")
    public JAXBElement<GetTranscript> createGetTranscript(GetTranscript value) {
        return new JAXBElement<GetTranscript>(_GetTranscript_QNAME, GetTranscript.class, null, value);
    }

}
