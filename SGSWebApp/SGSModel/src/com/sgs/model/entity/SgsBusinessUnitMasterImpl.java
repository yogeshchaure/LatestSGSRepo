package com.sgs.model.entity;

import com.sgs.model.service.SGSAppModuleImpl;

import java.sql.Date;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 07 09:19:35 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsBusinessUnitMasterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        BuId,
        BuName,
        LeagalEntity,
        BuGeography,
        BuZone,
        BusinessControllers,
        BuStatus,
        EffectiveStartDate,
        EffectiveEndDate,
        AlternateBu,
        Currency,
        NettingApplicability,
        SubLedgerApplicability,
        ICoSupplierName,
        ICoCustomerName,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        GstRegNum,
        Opration_Unit;
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
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsBusinessUnitMasterImpl.class);


    public static final int BUID = AttributesEnum.BuId.index();
    public static final int BUNAME = AttributesEnum.BuName.index();
    public static final int LEAGALENTITY = AttributesEnum.LeagalEntity.index();
    public static final int BUGEOGRAPHY = AttributesEnum.BuGeography.index();
    public static final int BUZONE = AttributesEnum.BuZone.index();
    public static final int BUSINESSCONTROLLERS = AttributesEnum.BusinessControllers.index();
    public static final int BUSTATUS = AttributesEnum.BuStatus.index();
    public static final int EFFECTIVESTARTDATE = AttributesEnum.EffectiveStartDate.index();
    public static final int EFFECTIVEENDDATE = AttributesEnum.EffectiveEndDate.index();
    public static final int ALTERNATEBU = AttributesEnum.AlternateBu.index();
    public static final int CURRENCY = AttributesEnum.Currency.index();
    public static final int NETTINGAPPLICABILITY = AttributesEnum.NettingApplicability.index();
    public static final int SUBLEDGERAPPLICABILITY = AttributesEnum.SubLedgerApplicability.index();
    public static final int ICOSUPPLIERNAME = AttributesEnum.ICoSupplierName.index();
    public static final int ICOCUSTOMERNAME = AttributesEnum.ICoCustomerName.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int GSTREGNUM = AttributesEnum.GstRegNum.index();
    public static final int OPRATION_UNIT = AttributesEnum.Opration_Unit.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsBusinessUnitMasterImpl() {
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
     * Gets the attribute value for BuName, using the alias name BuName.
     * @return the value of BuName
     */
    public String getBuName() {
        return (String) getAttributeInternal(BUNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuName.
     * @param value value to set the BuName
     */
    public void setBuName(String value) {
        setAttributeInternal(BUNAME, value);
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
     * Gets the attribute value for BuGeography, using the alias name BuGeography.
     * @return the value of BuGeography
     */
    public String getBuGeography() {
        return (String) getAttributeInternal(BUGEOGRAPHY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuGeography.
     * @param value value to set the BuGeography
     */
    public void setBuGeography(String value) {
        setAttributeInternal(BUGEOGRAPHY, value);
    }

    /**
     * Gets the attribute value for BuZone, using the alias name BuZone.
     * @return the value of BuZone
     */
    public String getBuZone() {
        return (String) getAttributeInternal(BUZONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuZone.
     * @param value value to set the BuZone
     */
    public void setBuZone(String value) {
        setAttributeInternal(BUZONE, value);
    }

    /**
     * Gets the attribute value for BusinessControllers, using the alias name BusinessControllers.
     * @return the value of BusinessControllers
     */
    public String getBusinessControllers() {
        return (String) getAttributeInternal(BUSINESSCONTROLLERS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BusinessControllers.
     * @param value value to set the BusinessControllers
     */
    public void setBusinessControllers(String value) {
        setAttributeInternal(BUSINESSCONTROLLERS, value);
    }

    /**
     * Gets the attribute value for BuStatus, using the alias name BuStatus.
     * @return the value of BuStatus
     */
    public String getBuStatus() {
        return (String) getAttributeInternal(BUSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuStatus.
     * @param value value to set the BuStatus
     */
    public void setBuStatus(String value) {
        setAttributeInternal(BUSTATUS, value);
    }

    /**
     * Gets the attribute value for EffectiveStartDate, using the alias name EffectiveStartDate.
     * @return the value of EffectiveStartDate
     */
    public Date getEffectiveStartDate() {
        return (Date) getAttributeInternal(EFFECTIVESTARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveStartDate.
     * @param value value to set the EffectiveStartDate
     */
    public void setEffectiveStartDate(Date value) {
        setAttributeInternal(EFFECTIVESTARTDATE, value);
    }

    /**
     * Gets the attribute value for EffectiveEndDate, using the alias name EffectiveEndDate.
     * @return the value of EffectiveEndDate
     */
    public Date getEffectiveEndDate() {
        return (Date) getAttributeInternal(EFFECTIVEENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveEndDate.
     * @param value value to set the EffectiveEndDate
     */
    public void setEffectiveEndDate(Date value) {
        setAttributeInternal(EFFECTIVEENDDATE, value);
    }

    /**
     * Gets the attribute value for AlternateBu, using the alias name AlternateBu.
     * @return the value of AlternateBu
     */
    public String getAlternateBu() {
        return (String) getAttributeInternal(ALTERNATEBU);
    }

    /**
     * Sets <code>value</code> as the attribute value for AlternateBu.
     * @param value value to set the AlternateBu
     */
    public void setAlternateBu(String value) {
        setAttributeInternal(ALTERNATEBU, value);
    }

    /**
     * Gets the attribute value for Currency, using the alias name Currency.
     * @return the value of Currency
     */
    public String getCurrency() {
        return (String) getAttributeInternal(CURRENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Currency.
     * @param value value to set the Currency
     */
    public void setCurrency(String value) {
        setAttributeInternal(CURRENCY, value);
    }

    /**
     * Gets the attribute value for NettingApplicability, using the alias name NettingApplicability.
     * @return the value of NettingApplicability
     */
    public String getNettingApplicability() {
        return (String) getAttributeInternal(NETTINGAPPLICABILITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for NettingApplicability.
     * @param value value to set the NettingApplicability
     */
    public void setNettingApplicability(String value) {
        setAttributeInternal(NETTINGAPPLICABILITY, value);
    }

    /**
     * Gets the attribute value for SubLedgerApplicability, using the alias name SubLedgerApplicability.
     * @return the value of SubLedgerApplicability
     */
    public String getSubLedgerApplicability() {
        return (String) getAttributeInternal(SUBLEDGERAPPLICABILITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubLedgerApplicability.
     * @param value value to set the SubLedgerApplicability
     */
    public void setSubLedgerApplicability(String value) {
        setAttributeInternal(SUBLEDGERAPPLICABILITY, value);
    }

    /**
     * Gets the attribute value for ICoSupplierName, using the alias name ICoSupplierName.
     * @return the value of ICoSupplierName
     */
    public String getICoSupplierName() {
        return (String) getAttributeInternal(ICOSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ICoSupplierName.
     * @param value value to set the ICoSupplierName
     */
    public void setICoSupplierName(String value) {
        setAttributeInternal(ICOSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for ICoCustomerName, using the alias name ICoCustomerName.
     * @return the value of ICoCustomerName
     */
    public String getICoCustomerName() {
        return (String) getAttributeInternal(ICOCUSTOMERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ICoCustomerName.
     * @param value value to set the ICoCustomerName
     */
    public void setICoCustomerName(String value) {
        setAttributeInternal(ICOCUSTOMERNAME, value);
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
     * Gets the attribute value for GstRegNum, using the alias name GstRegNum.
     * @return the value of GstRegNum
     */
    public String getGstRegNum() {
        return (String) getAttributeInternal(GSTREGNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for GstRegNum.
     * @param value value to set the GstRegNum
     */
    public void setGstRegNum(String value) {
        setAttributeInternal(GSTREGNUM, value);
    }

    /**
     * Gets the attribute value for Opration_Unit, using the alias name Opration_Unit.
     * @return the value of Opration_Unit
     */
    public String getOpration_Unit() {
        return (String) getAttributeInternal(OPRATION_UNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Opration_Unit.
     * @param value value to set the Opration_Unit
     */
    public void setOpration_Unit(String value) {
        setAttributeInternal(OPRATION_UNIT, value);
    }

    /**
     * @param buId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer buId) {
        return new Key(new Object[] { buId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsBusinessUnitMaster");
    }


    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);        
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setBuId(am.getDBSequence("SGS_BUSINESS_UNIT_MASTER_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

