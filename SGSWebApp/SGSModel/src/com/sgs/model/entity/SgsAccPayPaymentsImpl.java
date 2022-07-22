package com.sgs.model.entity;

import com.sgs.model.service.SGSAppModuleImpl;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 12 19:34:52 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsAccPayPaymentsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AccPayPaymentsId,
        BuId,
        AccPayInvoicesId,
        TotalAmount,
        AmountPaid,
        RemainingPayments,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        ApInvoiceNum;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ACCPAYPAYMENTSID = AttributesEnum.AccPayPaymentsId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int ACCPAYINVOICESID = AttributesEnum.AccPayInvoicesId.index();
    public static final int TOTALAMOUNT = AttributesEnum.TotalAmount.index();
    public static final int AMOUNTPAID = AttributesEnum.AmountPaid.index();
    public static final int REMAININGPAYMENTS = AttributesEnum.RemainingPayments.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int APINVOICENUM = AttributesEnum.ApInvoiceNum.index();
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsAccPayPaymentsImpl.class);

    /**
     * This is the default constructor (do not remove).
     */
    public SgsAccPayPaymentsImpl() {
    }

    /**
     * Gets the attribute value for AccPayPaymentsId, using the alias name AccPayPaymentsId.
     * @return the value of AccPayPaymentsId
     */
    public Integer getAccPayPaymentsId() {
        return (Integer) getAttributeInternal(ACCPAYPAYMENTSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccPayPaymentsId.
     * @param value value to set the AccPayPaymentsId
     */
    public void setAccPayPaymentsId(Integer value) {
        setAttributeInternal(ACCPAYPAYMENTSID, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the value of BuId
     */
    public Integer getBuId() {
        return (Integer) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(Integer value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for AccPayInvoicesId, using the alias name AccPayInvoicesId.
     * @return the value of AccPayInvoicesId
     */
    public Integer getAccPayInvoicesId() {
        return (Integer) getAttributeInternal(ACCPAYINVOICESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccPayInvoicesId.
     * @param value value to set the AccPayInvoicesId
     */
    public void setAccPayInvoicesId(Integer value) {
        setAttributeInternal(ACCPAYINVOICESID, value);
    }

    /**
     * Gets the attribute value for TotalAmount, using the alias name TotalAmount.
     * @return the value of TotalAmount
     */
    public BigDecimal getTotalAmount() {
        return (BigDecimal) getAttributeInternal(TOTALAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalAmount.
     * @param value value to set the TotalAmount
     */
    public void setTotalAmount(BigDecimal value) {
        setAttributeInternal(TOTALAMOUNT, value);
    }

    /**
     * Gets the attribute value for AmountPaid, using the alias name AmountPaid.
     * @return the value of AmountPaid
     */
    public BigDecimal getAmountPaid() {
        return (BigDecimal) getAttributeInternal(AMOUNTPAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AmountPaid.
     * @param value value to set the AmountPaid
     */
    public void setAmountPaid(BigDecimal value) {
        setAttributeInternal(AMOUNTPAID, value);
    }

    /**
     * Gets the attribute value for RemainingPayments, using the alias name RemainingPayments.
     * @return the value of RemainingPayments
     */
    public BigDecimal getRemainingPayments() {
        return (BigDecimal) getAttributeInternal(REMAININGPAYMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for RemainingPayments.
     * @param value value to set the RemainingPayments
     */
    public void setRemainingPayments(BigDecimal value) {
        setAttributeInternal(REMAININGPAYMENTS, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedDate.
     * @param value value to set the UpdatedDate
     */
    public void setUpdatedDate(Date value) {
        setAttributeInternal(UPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(String value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for ApInvoiceNum, using the alias name ApInvoiceNum.
     * @return the value of ApInvoiceNum
     */
    public String getApInvoiceNum() {
        return (String) getAttributeInternal(APINVOICENUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApInvoiceNum.
     * @param value value to set the ApInvoiceNum
     */
    public void setApInvoiceNum(String value) {
        setAttributeInternal(APINVOICENUM, value);
    }

    /**
     * @param accPayPaymentsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer accPayPaymentsId) {
        return new Key(new Object[] { accPayPaymentsId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsAccPayPayments");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setAccPayPaymentsId(am.getDBSequence("SGS_ACC_PAY_PAYMENTS_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

