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
 * <p>Java class for emtaFieAndmed_vastus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emtaFieAndmed_vastus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="kokku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lisainfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieJada">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://schemas.xmlsoap.org/soap/encoding/}Array">
 *                 &lt;sequence>
 *                   &lt;element name="item" type="{http://producers.emta.xtee.riik.ee/producer/emta}fieIsikAndmed" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emtaFieAndmed_vastus", namespace = "http://producers.emta.xtee.riik.ee/producer/emta", propOrder = {

})
public class EmtaFieAndmedVastus {

    @XmlElement(required = true, nillable = true)
    protected java.lang.String kokku;
    @XmlElement(required = true, nillable = true)
    protected java.lang.String lisainfo;
    @XmlElement(required = true, nillable = true)
    protected EmtaFieAndmedVastus.FieJada fieJada;

    /**
     * Gets the value of the kokku property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getKokku() {
        return kokku;
    }

    /**
     * Sets the value of the kokku property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setKokku(java.lang.String value) {
        this.kokku = value;
    }

    /**
     * Gets the value of the lisainfo property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLisainfo() {
        return lisainfo;
    }

    /**
     * Sets the value of the lisainfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLisainfo(java.lang.String value) {
        this.lisainfo = value;
    }

    /**
     * Gets the value of the fieJada property.
     * 
     * @return
     *     possible object is
     *     {@link EmtaFieAndmedVastus.FieJada }
     *     
     */
    public EmtaFieAndmedVastus.FieJada getFieJada() {
        return fieJada;
    }

    /**
     * Sets the value of the fieJada property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmtaFieAndmedVastus.FieJada }
     *     
     */
    public void setFieJada(EmtaFieAndmedVastus.FieJada value) {
        this.fieJada = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://schemas.xmlsoap.org/soap/encoding/}Array">
     *       &lt;sequence>
     *         &lt;element name="item" type="{http://producers.emta.xtee.riik.ee/producer/emta}fieIsikAndmed" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FieJada
        extends Array
    {


    }

}
