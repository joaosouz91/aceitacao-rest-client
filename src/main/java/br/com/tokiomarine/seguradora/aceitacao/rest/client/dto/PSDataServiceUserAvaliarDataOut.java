
package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSDataServiceUser_avaliarData_Out complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSDataServiceUser_avaliarData_Out">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ctipodataOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSDataServiceUser_avaliarData_Out", propOrder = {
    "_return",
    "ctipodataOut"
})
public class PSDataServiceUserAvaliarDataOut {

    @XmlElement(required = true, nillable = true)
    protected String _return;
    @XmlElement(required = true, nillable = true)
    protected String ctipodataOut;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturn(String value) {
        this._return = value;
    }

    /**
     * Gets the value of the ctipodataOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtipodataOut() {
        return ctipodataOut;
    }

    /**
     * Sets the value of the ctipodataOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtipodataOut(String value) {
        this.ctipodataOut = value;
    }

}
