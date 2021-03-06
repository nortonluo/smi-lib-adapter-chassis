//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:07:00 PM CDT 
//


package com.dell.esg.icee.common.protocol.command.racadm.entity.chassis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cMCNetworkInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cMCNetworkInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NIC_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAC_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Register_DNS_CMC_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNS_CMC_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Current_DNS_Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLAN_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLAN_Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VLAN_Enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cMCNetworkInfo", propOrder = {
    "nicEnabled",
    "macAddress",
    "registerDNSCMCName",
    "dnscmcName",
    "currentDNSDomain",
    "vlanid",
    "vlanPriority",
    "vlanEnabled"
})
public class CMCNetworkInfo {

    @XmlElement(name = "NIC_Enabled")
    protected String nicEnabled;
    @XmlElement(name = "MAC_Address")
    protected String macAddress;
    @XmlElement(name = "Register_DNS_CMC_Name")
    protected String registerDNSCMCName;
    @XmlElement(name = "DNS_CMC_Name")
    protected String dnscmcName;
    @XmlElement(name = "Current_DNS_Domain")
    protected String currentDNSDomain;
    @XmlElement(name = "VLAN_ID")
    protected String vlanid;
    @XmlElement(name = "VLAN_Priority")
    protected String vlanPriority;
    @XmlElement(name = "VLAN_Enabled")
    protected String vlanEnabled;

    /**
     * Gets the value of the nicEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICEnabled() {
        return nicEnabled;
    }

    /**
     * Sets the value of the nicEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICEnabled(String value) {
        this.nicEnabled = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the registerDNSCMCName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDNSCMCName() {
        return registerDNSCMCName;
    }

    /**
     * Sets the value of the registerDNSCMCName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDNSCMCName(String value) {
        this.registerDNSCMCName = value;
    }

    /**
     * Gets the value of the dnscmcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNSCMCName() {
        return dnscmcName;
    }

    /**
     * Sets the value of the dnscmcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNSCMCName(String value) {
        this.dnscmcName = value;
    }

    /**
     * Gets the value of the currentDNSDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentDNSDomain() {
        return currentDNSDomain;
    }

    /**
     * Sets the value of the currentDNSDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentDNSDomain(String value) {
        this.currentDNSDomain = value;
    }

    /**
     * Gets the value of the vlanid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLANID() {
        return vlanid;
    }

    /**
     * Sets the value of the vlanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLANID(String value) {
        this.vlanid = value;
    }

    /**
     * Gets the value of the vlanPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLANPriority() {
        return vlanPriority;
    }

    /**
     * Sets the value of the vlanPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLANPriority(String value) {
        this.vlanPriority = value;
    }

    /**
     * Gets the value of the vlanEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVLANEnabled() {
        return vlanEnabled;
    }

    /**
     * Sets the value of the vlanEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVLANEnabled(String value) {
        this.vlanEnabled = value;
    }

}
