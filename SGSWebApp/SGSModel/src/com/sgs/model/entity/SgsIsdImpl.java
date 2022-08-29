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
// ---    Tue Aug 16 14:59:54 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsIsdImpl extends EntityImpl {
    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        IsdId,
        IsdInvoiceNo,
        ServiceProvider,
        ServiceReceiver,
        TypeOfSupply,
        IgStReceivable,
        CgStReceivable,
        SgStReceivable,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        EffectiveFrom,
        EffectiveTo;
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
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsIsdImpl.class);


    public static final int ISDID = AttributesEnum.IsdId.index();
    public static final int ISDINVOICENO = AttributesEnum.IsdInvoiceNo.index();
    public static final int SERVICEPROVIDER = AttributesEnum.ServiceProvider.index();
    public static final int SERVICERECEIVER = AttributesEnum.ServiceReceiver.index();
    public static final int TYPEOFSUPPLY = AttributesEnum.TypeOfSupply.index();
    public static final int IGSTRECEIVABLE = AttributesEnum.IgStReceivable.index();
    public static final int CGSTRECEIVABLE = AttributesEnum.CgStReceivable.index();
    public static final int SGSTRECEIVABLE = AttributesEnum.SgStReceivable.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int EFFECTIVEFROM = AttributesEnum.EffectiveFrom.index();
    public static final int EFFECTIVETO = AttributesEnum.EffectiveTo.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsIsdImpl() {
    }

    /**
     * Gets the attribute value for IsdId, using the alias name IsdId.
     * @return the value of IsdId
     */
    public Integer getIsdId() {
        return (Integer) getAttributeInternal(ISDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsdId.
     * @param value value to set the IsdId
     */
    public void setIsdId(Integer value) {
        setAttributeInternal(ISDID, value);
    }

    /**
     * Gets the attribute value for IsdInvoiceNo, using the alias name IsdInvoiceNo.
     * @return the value of IsdInvoiceNo
     */
    public String getIsdInvoiceNo() {
        return (String) getAttributeInternal(ISDINVOICENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsdInvoiceNo.
     * @param value value to set the IsdInvoiceNo
     */
    public void setIsdInvoiceNo(String value) {
        setAttributeInternal(ISDINVOICENO, value);
    }

    /**
     * Gets the attribute value for ServiceProvider, using the alias name ServiceProvider.
     * @return the value of ServiceProvider
     */
    public String getServiceProvider() {
        return (String) getAttributeInternal(SERVICEPROVIDER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServiceProvider.
     * @param value value to set the ServiceProvider
     */
    public void setServiceProvider(String value) {
        setAttributeInternal(SERVICEPROVIDER, value);
    }

    /**
     * Gets the attribute value for ServiceReceiver, using the alias name ServiceReceiver.
     * @return the value of ServiceReceiver
     */
    public String getServiceReceiver() {
        return (String) getAttributeInternal(SERVICERECEIVER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServiceReceiver.
     * @param value value to set the ServiceReceiver
     */
    public void setServiceReceiver(String value) {
        setAttributeInternal(SERVICERECEIVER, value);
    }

    /**
     * Gets the attribute value for TypeOfSupply, using the alias name TypeOfSupply.
     * @return the value of TypeOfSupply
     */
    public String getTypeOfSupply() {
        return (String) getAttributeInternal(TYPEOFSUPPLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TypeOfSupply.
     * @param value value to set the TypeOfSupply
     */
    public void setTypeOfSupply(String value) {
        setAttributeInternal(TYPEOFSUPPLY, value);
    }

    /**
     * Gets the attribute value for IgStReceivable, using the alias name IgStReceivable.
     * @return the value of IgStReceivable
     */
    public String getIgStReceivable() {
        return (String) getAttributeInternal(IGSTRECEIVABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IgStReceivable.
     * @param value value to set the IgStReceivable
     */
    public void setIgStReceivable(String value) {
        setAttributeInternal(IGSTRECEIVABLE, value);
    }

    /**
     * Gets the attribute value for CgStReceivable, using the alias name CgStReceivable.
     * @return the value of CgStReceivable
     */
    public String getCgStReceivable() {
        return (String) getAttributeInternal(CGSTRECEIVABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CgStReceivable.
     * @param value value to set the CgStReceivable
     */
    public void setCgStReceivable(String value) {
        setAttributeInternal(CGSTRECEIVABLE, value);
    }

    /**
     * Gets the attribute value for SgStReceivable, using the alias name SgStReceivable.
     * @return the value of SgStReceivable
     */
    public String getSgStReceivable() {
        return (String) getAttributeInternal(SGSTRECEIVABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SgStReceivable.
     * @param value value to set the SgStReceivable
     */
    public void setSgStReceivable(String value) {
        setAttributeInternal(SGSTRECEIVABLE, value);
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
     * Gets the attribute value for EffectiveFrom, using the alias name EffectiveFrom.
     * @return the value of EffectiveFrom
     */
    public Date getEffectiveFrom() {
        return (Date) getAttributeInternal(EFFECTIVEFROM);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveFrom.
     * @param value value to set the EffectiveFrom
     */
    public void setEffectiveFrom(Date value) {
        setAttributeInternal(EFFECTIVEFROM, value);
    }

    /**
     * Gets the attribute value for EffectiveTo, using the alias name EffectiveTo.
     * @return the value of EffectiveTo
     */
    public Date getEffectiveTo() {
        return (Date) getAttributeInternal(EFFECTIVETO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveTo.
     * @param value value to set the EffectiveTo
     */
    public void setEffectiveTo(Date value) {
        setAttributeInternal(EFFECTIVETO, value);
    }

    /**
     * @param isdId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer isdId) {
        return new Key(new Object[] { isdId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsIsd");
    }


    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setIsdId(am.getDBSequence("SGS_ISD_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

