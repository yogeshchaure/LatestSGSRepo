package com.sgs.model.view;

import com.sgs.model.entity.SgsCreateCreditMemosFImpl;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 17 23:56:24 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsCreateCreditMemosFVORowImpl extends ViewRowImpl {

    public static final int ENTITY_SGSCREATECREDITMEMOSF = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CreditMemosId,
        CreditDate,
        PeoplesoftVoucherNum,
        PeoplesoftInvoiceNum,
        ReversalAmount,
        ReversalPercenatge,
        ReversalReasons,
        CompleteReversal,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        InvoiceAmount;
        private static AttributesEnum[] vals = null;
        ;
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

    public static final int CREDITMEMOSID = AttributesEnum.CreditMemosId.index();
    public static final int CREDITDATE = AttributesEnum.CreditDate.index();
    public static final int PEOPLESOFTVOUCHERNUM = AttributesEnum.PeoplesoftVoucherNum.index();
    public static final int PEOPLESOFTINVOICENUM = AttributesEnum.PeoplesoftInvoiceNum.index();
    public static final int REVERSALAMOUNT = AttributesEnum.ReversalAmount.index();
    public static final int REVERSALPERCENATGE = AttributesEnum.ReversalPercenatge.index();
    public static final int REVERSALREASONS = AttributesEnum.ReversalReasons.index();
    public static final int COMPLETEREVERSAL = AttributesEnum.CompleteReversal.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int INVOICEAMOUNT = AttributesEnum.InvoiceAmount.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsCreateCreditMemosFVORowImpl() {
    }

    /**
     * Gets SgsCreateCreditMemosF entity object.
     * @return the SgsCreateCreditMemosF
     */
    public SgsCreateCreditMemosFImpl getSgsCreateCreditMemosF() {
        return (SgsCreateCreditMemosFImpl) getEntity(ENTITY_SGSCREATECREDITMEMOSF);
    }

    /**
     * Gets the attribute value for CREDIT_MEMOS_ID using the alias name CreditMemosId.
     * @return the CREDIT_MEMOS_ID
     */
    public Integer getCreditMemosId() {
        return (Integer) getAttributeInternal(CREDITMEMOSID);
    }

    /**
     * Sets <code>value</code> as attribute value for CREDIT_MEMOS_ID using the alias name CreditMemosId.
     * @param value value to set the CREDIT_MEMOS_ID
     */
    public void setCreditMemosId(Integer value) {
        setAttributeInternal(CREDITMEMOSID, value);
    }

    /**
     * Gets the attribute value for CREDIT_DATE using the alias name CreditDate.
     * @return the CREDIT_DATE
     */
    public Date getCreditDate() {
        return (Date) getAttributeInternal(CREDITDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREDIT_DATE using the alias name CreditDate.
     * @param value value to set the CREDIT_DATE
     */
    public void setCreditDate(Date value) {
        setAttributeInternal(CREDITDATE, value);
    }

    /**
     * Gets the attribute value for PEOPLESOFT_VOUCHER_NUM using the alias name PeoplesoftVoucherNum.
     * @return the PEOPLESOFT_VOUCHER_NUM
     */
    public String getPeoplesoftVoucherNum() {
        return (String) getAttributeInternal(PEOPLESOFTVOUCHERNUM);
    }

    /**
     * Sets <code>value</code> as attribute value for PEOPLESOFT_VOUCHER_NUM using the alias name PeoplesoftVoucherNum.
     * @param value value to set the PEOPLESOFT_VOUCHER_NUM
     */
    public void setPeoplesoftVoucherNum(String value) {
        setAttributeInternal(PEOPLESOFTVOUCHERNUM, value);
    }

    /**
     * Gets the attribute value for PEOPLESOFT_INVOICE_NUM using the alias name PeoplesoftInvoiceNum.
     * @return the PEOPLESOFT_INVOICE_NUM
     */
    public String getPeoplesoftInvoiceNum() {
        return (String) getAttributeInternal(PEOPLESOFTINVOICENUM);
    }

    /**
     * Sets <code>value</code> as attribute value for PEOPLESOFT_INVOICE_NUM using the alias name PeoplesoftInvoiceNum.
     * @param value value to set the PEOPLESOFT_INVOICE_NUM
     */
    public void setPeoplesoftInvoiceNum(String value) {
        setAttributeInternal(PEOPLESOFTINVOICENUM, value);
    }

    /**
     * Gets the attribute value for REVERSAL_AMOUNT using the alias name ReversalAmount.
     * @return the REVERSAL_AMOUNT
     */
    public BigDecimal getReversalAmount() {
        return (BigDecimal) getAttributeInternal(REVERSALAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for REVERSAL_AMOUNT using the alias name ReversalAmount.
     * @param value value to set the REVERSAL_AMOUNT
     */
    public void setReversalAmount(BigDecimal value) {
        setAttributeInternal(REVERSALAMOUNT, value);
    }

    /**
     * Gets the attribute value for REVERSAL_PERCENATGE using the alias name ReversalPercenatge.
     * @return the REVERSAL_PERCENATGE
     */
    public String getReversalPercenatge() {
        return (String) getAttributeInternal(REVERSALPERCENATGE);
    }

    /**
     * Sets <code>value</code> as attribute value for REVERSAL_PERCENATGE using the alias name ReversalPercenatge.
     * @param value value to set the REVERSAL_PERCENATGE
     */
    public void setReversalPercenatge(String value) {
        setAttributeInternal(REVERSALPERCENATGE, value);
    }

    /**
     * Gets the attribute value for REVERSAL_REASONS using the alias name ReversalReasons.
     * @return the REVERSAL_REASONS
     */
    public String getReversalReasons() {
        return (String) getAttributeInternal(REVERSALREASONS);
    }

    /**
     * Sets <code>value</code> as attribute value for REVERSAL_REASONS using the alias name ReversalReasons.
     * @param value value to set the REVERSAL_REASONS
     */
    public void setReversalReasons(String value) {
        setAttributeInternal(REVERSALREASONS, value);
    }

    /**
     * Gets the attribute value for COMPLETE_REVERSAL using the alias name CompleteReversal.
     * @return the COMPLETE_REVERSAL
     */
    public String getCompleteReversal() {
        return (String) getAttributeInternal(COMPLETEREVERSAL);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPLETE_REVERSAL using the alias name CompleteReversal.
     * @param value value to set the COMPLETE_REVERSAL
     */
    public void setCompleteReversal(String value) {
        setAttributeInternal(COMPLETEREVERSAL, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UPDATED_DATE using the alias name UpdatedDate.
     * @return the UPDATED_DATE
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for UPDATED_DATE using the alias name UpdatedDate.
     * @param value value to set the UPDATED_DATE
     */
    public void setUpdatedDate(Date value) {
        setAttributeInternal(UPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for UPDATED_BY using the alias name UpdatedBy.
     * @return the UPDATED_BY
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for UPDATED_BY using the alias name UpdatedBy.
     * @param value value to set the UPDATED_BY
     */
    public void setUpdatedBy(String value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for INVOICE_AMOUNT using the alias name INVOICEAMOUNT.
     * @return the INVOICE_AMOUNT
     */
    public BigDecimal getInvoiceAmount() {
        return (BigDecimal) getAttributeInternal(INVOICEAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOICE_AMOUNT using the alias name INVOICEAMOUNT.
     * @param value value to set the INVOICE_AMOUNT
     */
    public void setInvoiceAmount(BigDecimal value) {
        setAttributeInternal(INVOICEAMOUNT, value);
    }
}

