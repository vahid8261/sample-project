
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _UploadCVResponse_QNAME = new QName("http://services/", "uploadCVResponse");
    private final static QName _UploadCV_QNAME = new QName("http://services/", "uploadCV");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadCV }
     * 
     */
    public UploadCV createUploadCV() {
        return new UploadCV();
    }

    /**
     * Create an instance of {@link UploadCVResponse }
     * 
     */
    public UploadCVResponse createUploadCVResponse() {
        return new UploadCVResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCVResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "uploadCVResponse")
    public JAXBElement<UploadCVResponse> createUploadCVResponse(UploadCVResponse value) {
        return new JAXBElement<UploadCVResponse>(_UploadCVResponse_QNAME, UploadCVResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadCV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "uploadCV")
    public JAXBElement<UploadCV> createUploadCV(UploadCV value) {
        return new JAXBElement<UploadCV>(_UploadCV_QNAME, UploadCV.class, null, value);
    }

}
