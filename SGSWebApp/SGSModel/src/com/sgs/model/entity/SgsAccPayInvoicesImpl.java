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
// ---    Mon Apr 12 19:34:42 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsAccPayInvoicesImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AccPayInvoicesId,
        BuId,
        SuppliersId,
        ServicesId,
        ApInvoiceNo,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        STATUS;
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
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsAccPayInvoicesImpl.class);


    public static final int ACCPAYINVOICESID = AttributesEnum.AccPayInvoicesId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int SUPPLIERSID = AttributesEnum.SuppliersId.index();
    public static final int SERVICESID = AttributesEnum.ServicesId.index();
    public static final int APINVOICENO = AttributesEnum.ApInvoiceNo.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int STATUS = AttributesEnum.STATUS.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsAccPayInvoicesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsAccPayInvoices");
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
     * Gets the attribute value for SuppliersId, using the alias name SuppliersId.
     * @return the value of SuppliersId
     */
    public Integer getSuppliersId() {
        return (Integer) getAttributeInternal(SUPPLIERSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SuppliersId.
     * @param value value to set the SuppliersId
     */
    public void setSuppliersId(Integer value) {
        setAttributeInternal(SUPPLIERSID, value);
    }

    /**
     * Gets the attribute value for ServicesId, using the alias name ServicesId.
     * @return the value of ServicesId
     */
    public Integer getServicesId() {
        return (Integer) getAttributeInternal(SERVICESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServicesId.
     * @param value value to set the ServicesId
     */
    public void setServicesId(Integer value) {
        setAttributeInternal(SERVICESID, value);
    }

    /**
     * Gets the attribute value for ApInvoiceNo, using the alias name ApInvoiceNo.
     * @return the value of ApInvoiceNo
     */
    public String getApInvoiceNo() {
        return (String) getAttributeInternal(APINVOICENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApInvoiceNo.
     * @param value value to set the ApInvoiceNo
     */
    public void setApInvoiceNo(String value) {
        setAttributeInternal(APINVOICENO, value);
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
     * Gets the attribute value for STATUS, using the alias name STATUS.
     * @return the value of STATUS
     */
    public String getSTATUS() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for STATUS.
     * @param value value to set the STATUS
     */
    public void setSTATUS(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * @param accPayInvoicesId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer accPayInvoicesId) {
        return new Key(new Object[] { accPayInvoicesId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setAccPayInvoicesId(am.getDBSequence("SGS_ACC_PAY_INVOICES_SEQ"));
            setSTATUS("D");
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

