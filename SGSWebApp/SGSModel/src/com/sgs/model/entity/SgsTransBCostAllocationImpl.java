package com.sgs.model.entity;

import com.sgs.model.service.SGSAppModuleImpl;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 04 11:46:05 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsTransBCostAllocationImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TbcaId,
        CirId,
        BuId,
        ApprovalRequestType,
        ExtractId,
        RectificationId,
        LeagalEntity,
        JobCode,
        GlAccount,
        OprationalUnit,
        DepartmentId,
        AffilateCode,
        VerticalCode,
        HorizontalCode,
        BookCode,
        SourceSystem,
        SourceModule,
        SourceTable,
        TransactinPeriod,
        GlDate,
        TransactionDate,
        TransactionName,
        TransactionType,
        TransactionCategory,
        TransactionCurrency,
        TransactionAmount,
        FunctionalCurrency,
        ForeignExchangeRate,
        ServiceCategory,
        AccountTreatment,
        ExtractedBy,
        ExtractedDate,
        TrasactionStatus,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        OperationUnit,
        ALLOCATIONBASIS;
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


    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsTransBCostAllocationImpl.class);


    public static final int TBCAID = AttributesEnum.TbcaId.index();
    public static final int CIRID = AttributesEnum.CirId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int APPROVALREQUESTTYPE = AttributesEnum.ApprovalRequestType.index();
    public static final int EXTRACTID = AttributesEnum.ExtractId.index();
    public static final int RECTIFICATIONID = AttributesEnum.RectificationId.index();
    public static final int LEAGALENTITY = AttributesEnum.LeagalEntity.index();
    public static final int JOBCODE = AttributesEnum.JobCode.index();
    public static final int GLACCOUNT = AttributesEnum.GlAccount.index();
    public static final int OPRATIONALUNIT = AttributesEnum.OprationalUnit.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int AFFILATECODE = AttributesEnum.AffilateCode.index();
    public static final int VERTICALCODE = AttributesEnum.VerticalCode.index();
    public static final int HORIZONTALCODE = AttributesEnum.HorizontalCode.index();
    public static final int BOOKCODE = AttributesEnum.BookCode.index();
    public static final int SOURCESYSTEM = AttributesEnum.SourceSystem.index();
    public static final int SOURCEMODULE = AttributesEnum.SourceModule.index();
    public static final int SOURCETABLE = AttributesEnum.SourceTable.index();
    public static final int TRANSACTINPERIOD = AttributesEnum.TransactinPeriod.index();
    public static final int GLDATE = AttributesEnum.GlDate.index();
    public static final int TRANSACTIONDATE = AttributesEnum.TransactionDate.index();
    public static final int TRANSACTIONNAME = AttributesEnum.TransactionName.index();
    public static final int TRANSACTIONTYPE = AttributesEnum.TransactionType.index();
    public static final int TRANSACTIONCATEGORY = AttributesEnum.TransactionCategory.index();
    public static final int TRANSACTIONCURRENCY = AttributesEnum.TransactionCurrency.index();
    public static final int TRANSACTIONAMOUNT = AttributesEnum.TransactionAmount.index();
    public static final int FUNCTIONALCURRENCY = AttributesEnum.FunctionalCurrency.index();
    public static final int FOREIGNEXCHANGERATE = AttributesEnum.ForeignExchangeRate.index();
    public static final int SERVICECATEGORY = AttributesEnum.ServiceCategory.index();
    public static final int ACCOUNTTREATMENT = AttributesEnum.AccountTreatment.index();
    public static final int EXTRACTEDBY = AttributesEnum.ExtractedBy.index();
    public static final int EXTRACTEDDATE = AttributesEnum.ExtractedDate.index();
    public static final int TRASACTIONSTATUS = AttributesEnum.TrasactionStatus.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int OPERATIONUNIT = AttributesEnum.OperationUnit.index();
    public static final int ALLOCATIONBASIS = AttributesEnum.ALLOCATIONBASIS.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsTransBCostAllocationImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsTransBCostAllocation");
    }

    /**
     * Gets the attribute value for TbcaId, using the alias name TbcaId.
     * @return the value of TbcaId
     */
    public Integer getTbcaId() {
        return (Integer) getAttributeInternal(TBCAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TbcaId.
     * @param value value to set the TbcaId
     */
    public void setTbcaId(Integer value) {
        setAttributeInternal(TBCAID, value);
    }

    /**
     * Gets the attribute value for CirId, using the alias name CirId.
     * @return the value of CirId
     */
    public String getCirId() {
        return (String) getAttributeInternal(CIRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CirId.
     * @param value value to set the CirId
     */
    public void setCirId(String value) {
        setAttributeInternal(CIRID, value);
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
     * Gets the attribute value for ApprovalRequestType, using the alias name ApprovalRequestType.
     * @return the value of ApprovalRequestType
     */
    public String getApprovalRequestType() {
        return (String) getAttributeInternal(APPROVALREQUESTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApprovalRequestType.
     * @param value value to set the ApprovalRequestType
     */
    public void setApprovalRequestType(String value) {
        setAttributeInternal(APPROVALREQUESTTYPE, value);
    }

    /**
     * Gets the attribute value for ExtractId, using the alias name ExtractId.
     * @return the value of ExtractId
     */
    public String getExtractId() {
        return (String) getAttributeInternal(EXTRACTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtractId.
     * @param value value to set the ExtractId
     */
    public void setExtractId(String value) {
        setAttributeInternal(EXTRACTID, value);
    }

    /**
     * Gets the attribute value for RectificationId, using the alias name RectificationId.
     * @return the value of RectificationId
     */
    public String getRectificationId() {
        return (String) getAttributeInternal(RECTIFICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RectificationId.
     * @param value value to set the RectificationId
     */
    public void setRectificationId(String value) {
        setAttributeInternal(RECTIFICATIONID, value);
    }

    /**
     * Gets the attribute value for LeagalEntity, using the alias name LeagalEntity.
     * @return the value of LeagalEntity
     */
    public String getLeagalEntity() {
        return (String) getAttributeInternal(LEAGALENTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LeagalEntity.
     * @param value value to set the LeagalEntity
     */
    public void setLeagalEntity(String value) {
        setAttributeInternal(LEAGALENTITY, value);
    }

    /**
     * Gets the attribute value for JobCode, using the alias name JobCode.
     * @return the value of JobCode
     */
    public String getJobCode() {
        return (String) getAttributeInternal(JOBCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobCode.
     * @param value value to set the JobCode
     */
    public void setJobCode(String value) {
        setAttributeInternal(JOBCODE, value);
    }

    /**
     * Gets the attribute value for GlAccount, using the alias name GlAccount.
     * @return the value of GlAccount
     */
    public String getGlAccount() {
        return (String) getAttributeInternal(GLACCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlAccount.
     * @param value value to set the GlAccount
     */
    public void setGlAccount(String value) {
        setAttributeInternal(GLACCOUNT, value);
    }

    /**
     * Gets the attribute value for OprationalUnit, using the alias name OprationalUnit.
     * @return the value of OprationalUnit
     */
    public String getOprationalUnit() {
        return (String) getAttributeInternal(OPRATIONALUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for OprationalUnit.
     * @param value value to set the OprationalUnit
     */
    public void setOprationalUnit(String value) {
        setAttributeInternal(OPRATIONALUNIT, value);
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public String getDepartmentId() {
        return (String) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(String value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for AffilateCode, using the alias name AffilateCode.
     * @return the value of AffilateCode
     */
    public String getAffilateCode() {
        return (String) getAttributeInternal(AFFILATECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AffilateCode.
     * @param value value to set the AffilateCode
     */
    public void setAffilateCode(String value) {
        setAttributeInternal(AFFILATECODE, value);
    }

    /**
     * Gets the attribute value for VerticalCode, using the alias name VerticalCode.
     * @return the value of VerticalCode
     */
    public String getVerticalCode() {
        return (String) getAttributeInternal(VERTICALCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for VerticalCode.
     * @param value value to set the VerticalCode
     */
    public void setVerticalCode(String value) {
        setAttributeInternal(VERTICALCODE, value);
    }

    /**
     * Gets the attribute value for HorizontalCode, using the alias name HorizontalCode.
     * @return the value of HorizontalCode
     */
    public String getHorizontalCode() {
        return (String) getAttributeInternal(HORIZONTALCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for HorizontalCode.
     * @param value value to set the HorizontalCode
     */
    public void setHorizontalCode(String value) {
        setAttributeInternal(HORIZONTALCODE, value);
    }

    /**
     * Gets the attribute value for BookCode, using the alias name BookCode.
     * @return the value of BookCode
     */
    public String getBookCode() {
        return (String) getAttributeInternal(BOOKCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookCode.
     * @param value value to set the BookCode
     */
    public void setBookCode(String value) {
        setAttributeInternal(BOOKCODE, value);
    }

    /**
     * Gets the attribute value for SourceSystem, using the alias name SourceSystem.
     * @return the value of SourceSystem
     */
    public String getSourceSystem() {
        return (String) getAttributeInternal(SOURCESYSTEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceSystem.
     * @param value value to set the SourceSystem
     */
    public void setSourceSystem(String value) {
        setAttributeInternal(SOURCESYSTEM, value);
    }

    /**
     * Gets the attribute value for SourceModule, using the alias name SourceModule.
     * @return the value of SourceModule
     */
    public String getSourceModule() {
        return (String) getAttributeInternal(SOURCEMODULE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceModule.
     * @param value value to set the SourceModule
     */
    public void setSourceModule(String value) {
        setAttributeInternal(SOURCEMODULE, value);
    }

    /**
     * Gets the attribute value for SourceTable, using the alias name SourceTable.
     * @return the value of SourceTable
     */
    public String getSourceTable() {
        return (String) getAttributeInternal(SOURCETABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceTable.
     * @param value value to set the SourceTable
     */
    public void setSourceTable(String value) {
        setAttributeInternal(SOURCETABLE, value);
    }

    /**
     * Gets the attribute value for TransactinPeriod, using the alias name TransactinPeriod.
     * @return the value of TransactinPeriod
     */
    public String getTransactinPeriod() {
        return (String) getAttributeInternal(TRANSACTINPERIOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactinPeriod.
     * @param value value to set the TransactinPeriod
     */
    public void setTransactinPeriod(String value) {
        setAttributeInternal(TRANSACTINPERIOD, value);
    }

    /**
     * Gets the attribute value for GlDate, using the alias name GlDate.
     * @return the value of GlDate
     */
    public Date getGlDate() {
        return (Date) getAttributeInternal(GLDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlDate.
     * @param value value to set the GlDate
     */
    public void setGlDate(Date value) {
        setAttributeInternal(GLDATE, value);
    }

    /**
     * Gets the attribute value for TransactionDate, using the alias name TransactionDate.
     * @return the value of TransactionDate
     */
    public Date getTransactionDate() {
        return (Date) getAttributeInternal(TRANSACTIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactionDate.
     * @param value value to set the TransactionDate
     */
    public void setTransactionDate(Date value) {
        setAttributeInternal(TRANSACTIONDATE, value);
    }

    /**
     * Gets the attribute value for TransactionName, using the alias name TransactionName.
     * @return the value of TransactionName
     */
    public String getTransactionName() {
        return (String) getAttributeInternal(TRANSACTIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactionName.
     * @param value value to set the TransactionName
     */
    public void setTransactionName(String value) {
        setAttributeInternal(TRANSACTIONNAME, value);
    }

    /**
     * Gets the attribute value for TransactionType, using the alias name TransactionType.
     * @return the value of TransactionType
     */
    public String getTransactionType() {
        return (String) getAttributeInternal(TRANSACTIONTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactionType.
     * @param value value to set the TransactionType
     */
    public void setTransactionType(String value) {
        setAttributeInternal(TRANSACTIONTYPE, value);
    }

    /**
     * Gets the attribute value for TransactionCategory, using the alias name TransactionCategory.
     * @return the value of TransactionCategory
     */
    public String getTransactionCategory() {
        return (String) getAttributeInternal(TRANSACTIONCATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactionCategory.
     * @param value value to set the TransactionCategory
     */
    public void setTransactionCategory(String value) {
        setAttributeInternal(TRANSACTIONCATEGORY, value);
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
     * Gets the attribute value for TransactionAmount, using the alias name TransactionAmount.
     * @return the value of TransactionAmount
     */
    public BigDecimal getTransactionAmount() {
        return (BigDecimal) getAttributeInternal(TRANSACTIONAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransactionAmount.
     * @param value value to set the TransactionAmount
     */
    public void setTransactionAmount(BigDecimal value) {
        setAttributeInternal(TRANSACTIONAMOUNT, value);
    }

    /**
     * Gets the attribute value for FunctionalCurrency, using the alias name FunctionalCurrency.
     * @return the value of FunctionalCurrency
     */
    public String getFunctionalCurrency() {
        return (String) getAttributeInternal(FUNCTIONALCURRENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for FunctionalCurrency.
     * @param value value to set the FunctionalCurrency
     */
    public void setFunctionalCurrency(String value) {
        setAttributeInternal(FUNCTIONALCURRENCY, value);
    }

    /**
     * Gets the attribute value for ForeignExchangeRate, using the alias name ForeignExchangeRate.
     * @return the value of ForeignExchangeRate
     */
    public String getForeignExchangeRate() {
        return (String) getAttributeInternal(FOREIGNEXCHANGERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ForeignExchangeRate.
     * @param value value to set the ForeignExchangeRate
     */
    public void setForeignExchangeRate(String value) {
        setAttributeInternal(FOREIGNEXCHANGERATE, value);
    }

    /**
     * Gets the attribute value for ServiceCategory, using the alias name ServiceCategory.
     * @return the value of ServiceCategory
     */
    public String getServiceCategory() {
        return (String) getAttributeInternal(SERVICECATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServiceCategory.
     * @param value value to set the ServiceCategory
     */
    public void setServiceCategory(String value) {
        setAttributeInternal(SERVICECATEGORY, value);
    }

    /**
     * Gets the attribute value for AccountTreatment, using the alias name AccountTreatment.
     * @return the value of AccountTreatment
     */
    public String getAccountTreatment() {
        return (String) getAttributeInternal(ACCOUNTTREATMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccountTreatment.
     * @param value value to set the AccountTreatment
     */
    public void setAccountTreatment(String value) {
        setAttributeInternal(ACCOUNTTREATMENT, value);
    }

    /**
     * Gets the attribute value for ExtractedBy, using the alias name ExtractedBy.
     * @return the value of ExtractedBy
     */
    public String getExtractedBy() {
        return (String) getAttributeInternal(EXTRACTEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtractedBy.
     * @param value value to set the ExtractedBy
     */
    public void setExtractedBy(String value) {
        setAttributeInternal(EXTRACTEDBY, value);
    }

    /**
     * Gets the attribute value for ExtractedDate, using the alias name ExtractedDate.
     * @return the value of ExtractedDate
     */
    public Date getExtractedDate() {
        return (Date) getAttributeInternal(EXTRACTEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExtractedDate.
     * @param value value to set the ExtractedDate
     */
    public void setExtractedDate(Date value) {
        setAttributeInternal(EXTRACTEDDATE, value);
    }

    /**
     * Gets the attribute value for TrasactionStatus, using the alias name TrasactionStatus.
     * @return the value of TrasactionStatus
     */
    public String getTrasactionStatus() {
        return (String) getAttributeInternal(TRASACTIONSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrasactionStatus.
     * @param value value to set the TrasactionStatus
     */
    public void setTrasactionStatus(String value) {
        setAttributeInternal(TRASACTIONSTATUS, value);
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
     * Gets the attribute value for OperationUnit, using the alias name OperationUnit.
     * @return the value of OperationUnit
     */
    public String getOperationUnit() {
        return (String) getAttributeInternal(OPERATIONUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for OperationUnit.
     * @param value value to set the OperationUnit
     */
    public void setOperationUnit(String value) {
        setAttributeInternal(OPERATIONUNIT, value);
    }

    /**
     * Gets the attribute value for ALLOCATIONBASIS, using the alias name ALLOCATIONBASIS.
     * @return the value of ALLOCATIONBASIS
     */
    public String getALLOCATIONBASIS() {
        return (String) getAttributeInternal(ALLOCATIONBASIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ALLOCATIONBASIS.
     * @param value value to set the ALLOCATIONBASIS
     */
    public void setALLOCATIONBASIS(String value) {
        setAttributeInternal(ALLOCATIONBASIS, value);
    }


    /**
     * @param tbcaId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer tbcaId) {
        return new Key(new Object[] { tbcaId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setTbcaId(am.getDBSequence("SGS_TRANS_B_COST_ALLOCATION_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

