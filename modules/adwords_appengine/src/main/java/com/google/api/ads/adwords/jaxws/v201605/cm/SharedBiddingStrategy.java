
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Bidding strategies store shared bidding configuration data and are account-level objects.
 *           
 * 
 * <p>Java class for SharedBiddingStrategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedBiddingStrategy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biddingScheme" type="{https://adwords.google.com/api/adwords/cm/v201605}BiddingScheme" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201605}SharedBiddingStrategy.BiddingStrategyStatus" minOccurs="0"/>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/cm/v201605}BiddingStrategyType" minOccurs="0"/>
 *         &lt;element name="systemStatus" type="{https://adwords.google.com/api/adwords/cm/v201605}BiddingStrategySystemStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedBiddingStrategy", propOrder = {
    "biddingScheme",
    "id",
    "name",
    "status",
    "type",
    "systemStatus"
})
public class SharedBiddingStrategy {

    protected BiddingScheme biddingScheme;
    protected Long id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected SharedBiddingStrategyBiddingStrategyStatus status;
    @XmlSchemaType(name = "string")
    protected BiddingStrategyType type;
    @XmlSchemaType(name = "string")
    protected BiddingStrategySystemStatus systemStatus;

    /**
     * Gets the value of the biddingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingScheme }
     *     
     */
    public BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the value of the biddingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingScheme }
     *     
     */
    public void setBiddingScheme(BiddingScheme value) {
        this.biddingScheme = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SharedBiddingStrategyBiddingStrategyStatus }
     *     
     */
    public SharedBiddingStrategyBiddingStrategyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedBiddingStrategyBiddingStrategyStatus }
     *     
     */
    public void setStatus(SharedBiddingStrategyBiddingStrategyStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategyType }
     *     
     */
    public BiddingStrategyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategyType }
     *     
     */
    public void setType(BiddingStrategyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategySystemStatus }
     *     
     */
    public BiddingStrategySystemStatus getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategySystemStatus }
     *     
     */
    public void setSystemStatus(BiddingStrategySystemStatus value) {
        this.systemStatus = value;
    }

}
