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
// ---    Sun Oct 16 16:17:33 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsTaxRatesAppGstImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TraId,
        CostIdentificationId,
        HsnCode,
        Rate,
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
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsTaxRatesAppGstImpl.class);
    public static final int TRAID = AttributesEnum.TraId.index();
    public static final int COSTIDENTIFICATIONID = AttributesEnum.CostIdentificationId.index();
    public static final int HSNCODE = AttributesEnum.HsnCode.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsTaxRatesAppGstImpl() {
    }

    /**
     * Gets the attribute value for TraId, using the alias name TraId.
     * @return the value of TraId
     */
    public Integer getTraId() {
        return (Integer) getAttributeInternal(TRAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TraId.
     * @param value value to set the TraId
     */
    public void setTraId(Integer value) {
        setAttributeInternal(TRAID, value);
    }

    /**
     * Gets the attribute value for CostIdentificationId, using the alias name CostIdentificationId.
     * @return the value of CostIdentificationId
     */
    public String getCostIdentificationId() {
        return (String) getAttributeInternal(COSTIDENTIFICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CostIdentificationId.
     * @param value value to set the CostIdentificationId
     */
    public void setCostIdentificationId(String value) {
        setAttributeInternal(COSTIDENTIFICATIONID, value);
    }

    /**
     * Gets the attribute value for HsnCode, using the alias name HsnCode.
     * @return the value of HsnCode
     */
    public String getHsnCode() {
        return (String) getAttributeInternal(HSNCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for HsnCode.
     * @param value value to set the HsnCode
     */
    public void setHsnCode(String value) {
        setAttributeInternal(HSNCODE, value);
    }

    /**
     * Gets the attribute value for Rate, using the alias name Rate.
     * @return the value of Rate
     */
    public String getRate() {
        return (String) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rate.
     * @param value value to set the Rate
     */
    public void setRate(String value) {
        setAttributeInternal(RATE, value);
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
     * @param traId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer traId) {
        return new Key(new Object[] { traId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsTaxRatesAppGst");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setTraId(am.getDBSequence("SGS_TAX_RATES_APP_GST_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }
}

