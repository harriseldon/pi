
package com.ulta.monitoring.pimonitoring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSMessageDataExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMessageDataExt">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:com.sap.aii.mdt.api.data.esiext}MessageDataExt">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMessageDataExt", namespace = "urn:com.sap.aii.mdt.api.data.esiext")
@XmlSeeAlso({
    WSMessageDataExtImpl.class
})
public class WSMessageDataExt
    extends MessageDataExt
{


}
