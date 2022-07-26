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
// ---    Mon Oct 17 06:37:26 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsSupportingDocImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        SdId,
        DocumentType,
        Attachment,
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
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsSupportingDocImpl.class);
    public static final int SDID = AttributesEnum.SdId.index();
    public static final int DOCUMENTTYPE = AttributesEnum.DocumentType.index();
    public static final int ATTACHMENT = AttributesEnum.Attachment.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsSupportingDocImpl() {
    }

    /**
     * Gets the attribute value for SdId, using the alias name SdId.
     * @return the value of SdId
     */
    public Integer getSdId() {
        return (Integer) getAttributeInternal(SDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SdId.
     * @param value value to set the SdId
     */
    public void setSdId(Integer value) {
        setAttributeInternal(SDID, value);
    }

    /**
     * Gets the attribute value for DocumentType, using the alias name DocumentType.
     * @return the value of DocumentType
     */
    public String getDocumentType() {
        return (String) getAttributeInternal(DOCUMENTTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocumentType.
     * @param value value to set the DocumentType
     */
    public void setDocumentType(String value) {
        setAttributeInternal(DOCUMENTTYPE, value);
    }

    /**
     * Gets the attribute value for Attachment, using the alias name Attachment.
     * @return the value of Attachment
     */
    public String getAttachment() {
        return (String) getAttributeInternal(ATTACHMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attachment.
     * @param value value to set the Attachment
     */
    public void setAttachment(String value) {
        setAttributeInternal(ATTACHMENT, value);
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
     * @param sdId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer sdId) {
        return new Key(new Object[] { sdId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsSupportingDoc");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setSdId(am.getDBSequence("SGS_MARKUP_RATE_MASTER_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

