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
// ---    Tue Sep 20 23:19:43 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsOtherReceivablesImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        OrId,
        Period,
        PeoplesoftTransactionId,
        ExtractionId,
        SourceBusinessUnit,
        SourceOperatingUnit,
        SourceDepartmentId,
        SourceGlAccount,
        SourceJobCode,
        ReclassBusinessUnit,
        ReclassOperatingUnit,
        ReclassDepartmentId,
        ReclassGlAccount,
        ReclassJobCode,
        BaseCurrency,
        TransactionCurrency,
        Amount,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy;
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
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsOtherReceivablesImpl.class);

    public static final int ORID = AttributesEnum.OrId.index();
    public static final int PERIOD = AttributesEnum.Period.index();
    public static final int PEOPLESOFTTRANSACTIONID = AttributesEnum.PeoplesoftTransactionId.index();
    public static final int EXTRACTIONID = AttributesEnum.ExtractionId.index();
    public static final int SOURCEBUSINESSUNIT = AttributesEnum.SourceBusinessUnit.index();
    public static final int SOURCEOPERATINGUNIT = AttributesEnum.SourceOperatingUnit.index();
    public static final int SOURCEDEPARTMENTID = AttributesEnum.SourceDepartmentId.index();
    public static final int SOURCEGLACCOUNT = AttributesEnum.SourceGlAccount.index();
    public static final int SOURCEJOBCODE = AttributesEnum.SourceJobCode.index();
    public static final int RECLASSBUSINESSUNIT = AttributesEnum.ReclassBusinessUnit.index();
    public static final int RECLASSOPERATINGUNIT = AttributesEnum.ReclassOperatingUnit.index();
    public static final int RECLASSDEPARTMENTID = AttributesEnum.ReclassDepartmentId.index();
    public static final int RECLASSGLACCOUNT = AttributesEnum.ReclassGlAccount.index();
    public static final int RECLASSJOBCODE = AttributesEnum.ReclassJobCode.index();
    public static final int BASECURRENCY = AttributesEnum.BaseCurrency.index();
    public static final int TRANSACTIONCURRENCY = AttributesEnum.TransactionCurrency.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsOtherReceivablesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsOtherReceivables");
    }

    /**
     * Gets the attribute value for OrId, using the alias name OrId.
     * @return the value of OrId
     */
    public Integer getOrId() {
        return (Integer) getAttributeInternal(ORID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrId.
     * @param value value to set the OrId
     */
    public void setOrId(Integer value) {
        setAttributeInternal(ORID, value);
    }

    /**
     * Gets the attribute value for Period, using the alias name Period.
     * @return the value of Period
     */
    public String getPeriod() {
        return (String) getAttributeInternal(PERIOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Period.
     * @param value value to set the Period
     */
    public void setPeriod(String value) {
        setAttributeInternal(PERIOD, value);
    }

    /**
     * Gets the attribute value for PeoplesoftTransactionId, using the alias name PeoplesoftTransactionId.
     * @return the value of PeoplesoftTransactionId
     */
    public String getPeoplesoftTransactionId() {
        return (String) getAttributeInternal(PEOPLESOFTTRANSACTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PeoplesoftTransactionId.
     * @param value value to set the PeoplesoftTransactionId
     */
    public void setPeoplesoftTransactionId(String value) {
        setAttributeInternal(PEOPLESOFTTRANSACTIONID, value);
    }

    /**
     * Gets the attribute value for ExtractionId, using the alias name ExtractionId.
     * @return the value of ExtractionId
     */
    public String getExtractionId() {
        return (String) getAttributeInternal(EXTRACTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtractionId.
     * @param value value to set the ExtractionId
     */
    public void setExtractionId(String value) {
        setAttributeInternal(EXTRACTIONID, value);
    }

    /**
     * Gets the attribute value for SourceBusinessUnit, using the alias name SourceBusinessUnit.
     * @return the value of SourceBusinessUnit
     */
    public String getSourceBusinessUnit() {
        return (String) getAttributeInternal(SOURCEBUSINESSUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceBusinessUnit.
     * @param value value to set the SourceBusinessUnit
     */
    public void setSourceBusinessUnit(String value) {
        setAttributeInternal(SOURCEBUSINESSUNIT, value);
    }

    /**
     * Gets the attribute value for SourceOperatingUnit, using the alias name SourceOperatingUnit.
     * @return the value of SourceOperatingUnit
     */
    public String getSourceOperatingUnit() {
        return (String) getAttributeInternal(SOURCEOPERATINGUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceOperatingUnit.
     * @param value value to set the SourceOperatingUnit
     */
    public void setSourceOperatingUnit(String value) {
        setAttributeInternal(SOURCEOPERATINGUNIT, value);
    }

    /**
     * Gets the attribute value for SourceDepartmentId, using the alias name SourceDepartmentId.
     * @return the value of SourceDepartmentId
     */
    public String getSourceDepartmentId() {
        return (String) getAttributeInternal(SOURCEDEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceDepartmentId.
     * @param value value to set the SourceDepartmentId
     */
    public void setSourceDepartmentId(String value) {
        setAttributeInternal(SOURCEDEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for SourceGlAccount, using the alias name SourceGlAccount.
     * @return the value of SourceGlAccount
     */
    public String getSourceGlAccount() {
        return (String) getAttributeInternal(SOURCEGLACCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceGlAccount.
     * @param value value to set the SourceGlAccount
     */
    public void setSourceGlAccount(String value) {
        setAttributeInternal(SOURCEGLACCOUNT, value);
    }

    /**
     * Gets the attribute value for SourceJobCode, using the alias name SourceJobCode.
     * @return the value of SourceJobCode
     */
    public String getSourceJobCode() {
        return (String) getAttributeInternal(SOURCEJOBCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceJobCode.
     * @param value value to set the SourceJobCode
     */
    public void setSourceJobCode(String value) {
        setAttributeInternal(SOURCEJOBCODE, value);
    }

    /**
     * Gets the attribute value for ReclassBusinessUnit, using the alias name ReclassBusinessUnit.
     * @return the value of ReclassBusinessUnit
     */
    public String getReclassBusinessUnit() {
        return (String) getAttributeInternal(RECLASSBUSINESSUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReclassBusinessUnit.
     * @param value value to set the ReclassBusinessUnit
     */
    public void setReclassBusinessUnit(String value) {
        setAttributeInternal(RECLASSBUSINESSUNIT, value);
    }

    /**
     * Gets the attribute value for ReclassOperatingUnit, using the alias name ReclassOperatingUnit.
     * @return the value of ReclassOperatingUnit
     */
    public String getReclassOperatingUnit() {
        return (String) getAttributeInternal(RECLASSOPERATINGUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReclassOperatingUnit.
     * @param value value to set the ReclassOperatingUnit
     */
    public void setReclassOperatingUnit(String value) {
        setAttributeInternal(RECLASSOPERATINGUNIT, value);
    }

    /**
     * Gets the attribute value for ReclassDepartmentId, using the alias name ReclassDepartmentId.
     * @return the value of ReclassDepartmentId
     */
    public String getReclassDepartmentId() {
        return (String) getAttributeInternal(RECLASSDEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReclassDepartmentId.
     * @param value value to set the ReclassDepartmentId
     */
    public void setReclassDepartmentId(String value) {
        setAttributeInternal(RECLASSDEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for ReclassGlAccount, using the alias name ReclassGlAccount.
     * @return the value of ReclassGlAccount
     */
    public String getReclassGlAccount() {
        return (String) getAttributeInternal(RECLASSGLACCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReclassGlAccount.
     * @param value value to set the ReclassGlAccount
     */
    public void setReclassGlAccount(String value) {
        setAttributeInternal(RECLASSGLACCOUNT, value);
    }

    /**
     * Gets the attribute value for ReclassJobCode, using the alias name ReclassJobCode.
     * @return the value of ReclassJobCode
     */
    public String getReclassJobCode() {
        return (String) getAttributeInternal(RECLASSJOBCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReclassJobCode.
     * @param value value to set the ReclassJobCode
     */
    public void setReclassJobCode(String value) {
        setAttributeInternal(RECLASSJOBCODE, value);
    }

    /**
     * Gets the attribute value for BaseCurrency, using the alias name BaseCurrency.
     * @return the value of BaseCurrency
     */
    public String getBaseCurrency() {
        return (String) getAttributeInternal(BASECURRENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BaseCurrency.
     * @param value value to set the BaseCurrency
     */
    public void setBaseCurrency(String value) {
        setAttributeInternal(BASECURRENCY, value);
    }

    /**
     * Gets the attribute value for TransactionCurrency, using the alias name TransactionCurrency.
     * @return the value of TransactionCurrency
     */
    public String getTransactionCurrency() {
        return (String) getAttributeInternal(TRANSACTIONCURRENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactionCurrency.
     * @param value value to set the TransactionCurrency
     */
    public void setTransactionCurrency(String value) {
        setAttributeInternal(TRANSACTIONCURRENCY, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }


    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }


    /**
     * @param orId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer orId) {
        return new Key(new Object[] { orId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setOrId(am.getDBSequence("SGS_OTHER_RECEIVABLES_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

