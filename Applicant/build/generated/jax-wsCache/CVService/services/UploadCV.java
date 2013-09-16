
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadCV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadCV">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CVXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadCV", propOrder = {
    "cvxml"
})
public class UploadCV {

    @XmlElement(name = "CVXML")
    protected String cvxml;

    /**
     * Gets the value of the cvxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVXML() {
        return cvxml;
    }

    /**
     * Sets the value of the cvxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVXML(String value) {
        this.cvxml = value;
    }

}
