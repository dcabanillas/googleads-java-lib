
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the available report fields for a given report type.
 *             When using this method the {@code clientCustomerId} header field is
 *             optional. Callers are discouraged from setting the clientCustomerId
 *             header field in calls to this method as its presence will trigger an
 *             authorization error if the caller does not have access to the customer
 *             with the included ID.
 *             
 *             @param reportType The type of report.
 *             @return The list of available report fields. Each
 *             {@link ReportDefinitionField} encapsulates the field name, the
 *             field data type, and the enum values (if the field's type is
 *             {@code enum}).
 *             @throws ApiException if a problem occurred while fetching the
 *             ReportDefinitionField information.
 *           
 * 
 * <p>Java class for getReportFields element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getReportFields">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reportType" type="{https://adwords.google.com/api/adwords/cm/v201601}ReportDefinition.ReportType" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportType"
})
@XmlRootElement(name = "getReportFields")
public class ReportDefinitionServiceInterfacegetReportFields {

    @XmlSchemaType(name = "string")
    protected ReportDefinitionReportType reportType;

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinitionReportType }
     *     
     */
    public ReportDefinitionReportType getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinitionReportType }
     *     
     */
    public void setReportType(ReportDefinitionReportType value) {
        this.reportType = value;
    }

}
