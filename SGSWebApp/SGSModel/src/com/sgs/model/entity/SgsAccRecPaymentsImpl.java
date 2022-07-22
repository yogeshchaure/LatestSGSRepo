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
// ---    Mon Apr 12 19:35:09 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsAccRecPaymentsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AccRecPaymentsId,
        BuId,
        AccRecInvoicesId,
        TotalAmount,
        AmountPaid,
        RemainingPayments,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        ArInvoiceNum;
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
    public static final int ACCRECPAYMENTSID = AttributesEnum.AccRecPaymentsId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int ACCRECINVOICESID = AttributesEnum.AccRecInvoicesId.index();
    public static final int TOTALAMOUNT = AttributesEnum.TotalAmount.index();
    public static final int AMOUNTPAID = AttributesEnum.AmountPaid.index();
    public static final int REMAININGPAYMENTS = AttributesEnum.RemainingPayments.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int ARINVOICENUM = AttributesEnum.ArInvoiceNum.index();
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsAccRecPaymentsImpl.class);

    /**
     * This is the default constructor (do not remove).
     */
    public SgsAccRecPaymentsImpl() {
    }

    /**
     * Gets the attribute value for AccRecPaymentsId, using the alias name AccRecPaymentsId.
     * @return the value of AccRecPaymentsId
     */
    public Integer getAccRecPaymentsId() {
        return (Integer) getAttributeInternal(ACCRECPAYMENTSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccRecPaymentsId.
     * @param value value to set the AccRecPaymentsId
     */
    public void setAccRecPaymentsId(Integer value) {
        setAttributeInternal(ACCRECPAYMENTSID, value);
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
     * Gets the attribute value for AccRecInvoicesId, using the alias name AccRecInvoicesId.
     * @return the value of AccRecInvoicesId
     */
    public Integer getAccRecInvoicesId() {
        return (Integer) getAttributeInternal(ACCRECINVOICESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccRecInvoicesId.
     * @param value value to set the AccRecInvoicesId
     */
    public void setAccRecInvoicesId(Integer value) {
        setAttributeInternal(ACCRECINVOICESID, value);
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
     * Gets the attribute value for ArInvoiceNum, using the alias name ArInvoiceNum.
     * @return the value of ArInvoiceNum
     */
    public String getArInvoiceNum() {
        return (String) getAttributeInternal(ARINVOICENUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArInvoiceNum.
     * @param value value to set the ArInvoiceNum
     */
    public void setArInvoiceNum(String value) {
        setAttributeInternal(ARINVOICENUM, value);
    }

    /**
     * @param accRecPaymentsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer accRecPaymentsId) {
        return new Key(new Object[] { accRecPaymentsId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsAccRecPayments");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setAccRecPaymentsId(am.getDBSequence("SGS_ACC_PAY_PAYMENTS_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

