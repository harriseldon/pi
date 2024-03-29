
package com.ulta.monitoring.pimonitoring;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatusDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusDetail" type="{urn:com.sap.aii.mdt.server.adapterframework.ws}StatusDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatusDetail", namespace = "urn:com.sap.aii.mdt.server.adapterframework.ws", propOrder = {
    "statusDetail"
})
public class ArrayOfStatusDetail {

    @XmlElement(name = "StatusDetail", nillable = true)
    protected List<StatusDetail> statusDetail;

    /**
     * Gets the value of the statusDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusDetail }
     * 
     * 
     */
    public List<StatusDetail> getStatusDetail() {
        if (statusDetail == null) {
            statusDetail = new ArrayList<StatusDetail>();
        }
        return this.statusDetail;
    }

}
