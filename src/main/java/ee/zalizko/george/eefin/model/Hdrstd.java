//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.31 at 12:45:23 AM EEST 
//


package ee.zalizko.george.eefin.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hdrstd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hdrstd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asutus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="andmekogu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nimi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toimik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hdrstd", namespace = "http://x-tee.riik.ee/xsd/xtee.xsd", propOrder = {
    "asutus",
    "andmekogu",
    "isikukood",
    "id",
    "nimi",
    "toimik"
})
public class Hdrstd {

    @XmlElement(required = true)
    protected java.lang.String asutus;
    @XmlElement(required = true)
    protected java.lang.String andmekogu;
    @XmlElement(required = true)
    protected java.lang.String isikukood;
    @XmlElement(required = true)
    protected java.lang.String id;
    @XmlElement(required = true)
    protected java.lang.String nimi;
    protected java.lang.String toimik;

    /**
     * Gets the value of the asutus property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAsutus() {
        return asutus;
    }

    /**
     * Sets the value of the asutus property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAsutus(java.lang.String value) {
        this.asutus = value;
    }

    /**
     * Gets the value of the andmekogu property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAndmekogu() {
        return andmekogu;
    }

    /**
     * Sets the value of the andmekogu property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAndmekogu(java.lang.String value) {
        this.andmekogu = value;
    }

    /**
     * Gets the value of the isikukood property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getIsikukood() {
        return isikukood;
    }

    /**
     * Sets the value of the isikukood property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setIsikukood(java.lang.String value) {
        this.isikukood = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nimi property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNimi() {
        return nimi;
    }

    /**
     * Sets the value of the nimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNimi(java.lang.String value) {
        this.nimi = value;
    }

    /**
     * Gets the value of the toimik property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getToimik() {
        return toimik;
    }

    /**
     * Sets the value of the toimik property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setToimik(java.lang.String value) {
        this.toimik = value;
    }

}
