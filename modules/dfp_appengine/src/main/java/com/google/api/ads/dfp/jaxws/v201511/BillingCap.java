
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingCap.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillingCap">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_CAP"/>
 *     &lt;enumeration value="CAPPED_CUMULATIVE"/>
 *     &lt;enumeration value="CAPPED_PER_BILLING_CYCLE"/>
 *     &lt;enumeration value="CAPPED_CUMULATIVE_PER_BILLING_CYCLE"/>
 *     &lt;enumeration value="CAPPED_WITH_ROLLOVER_PER_BILLING_CYCLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillingCap")
@XmlEnum
public enum BillingCap {


    /**
     * 
     *                 There is no cap for each billing month.
     *               
     * 
     */
    NO_CAP,

    /**
     * 
     *                 Use a billing source of capped actuals with a billing cap of cumulative to bill your
     *                 advertiser up to a campaign's capped amount, regardless of the number of impressions that
     *                 are served each month.
     *               
     * 
     */
    CAPPED_CUMULATIVE,

    /**
     * 
     *                 Use a billing source of capped actuals with a billing cap of the billing cycle to bill your
     *                 advertiser up to a capped amount for each billing cycle of a campaign, regardless of the
     *                 number of impressions that are served.
     *               
     * 
     */
    CAPPED_PER_BILLING_CYCLE,

    /**
     * 
     *                 Use a billing source of capped actuals with a billing cap of cumulative per billing cycle
     *                 to bill your advertiser up to a capped amount for each billing cycle of a campaign and carry
     *                 forward the balance of over- or under-delivered impressions towards the number of impressions
     *                 delivered in future billing cycles of the campaign.
     *               
     * 
     */
    CAPPED_CUMULATIVE_PER_BILLING_CYCLE,

    /**
     * 
     *                 Use a billing source of capped actuals with a billing cap of cumulative per billing cycle
     *                 to bill your advertiser up to a capped amount for each cycle of a campaign and carry forward
     *                 the balance of over- or under-delivered impressions towards the number of impressions
     *                 delivered in future cycles of the campaign.
     *               
     * 
     */
    CAPPED_WITH_ROLLOVER_PER_BILLING_CYCLE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BillingCap fromValue(String v) {
        return valueOf(v);
    }

}
