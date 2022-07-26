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
// ---    Sun Oct 16 16:01:05 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsTaxIdentificationDocImpl extends EntityImpl {
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
        TidId,
        LegalEntity,
        DocumentType,
        TaxIdentificationNumber,
        ValidFrom,
        ValidTo,
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
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsTaxIdentificationDocImpl.class);

    public static final int TIDID = AttributesEnum.TidId.index();
    public static final int LEGALENTITY = AttributesEnum.LegalEntity.index();
    public static final int DOCUMENTTYPE = AttributesEnum.DocumentType.index();
    public static final int TAXIDENTIFICATIONNUMBER = AttributesEnum.TaxIdentificationNumber.index();
    public static final int VALIDFROM = AttributesEnum.ValidFrom.index();
    public static final int VALIDTO = AttributesEnum.ValidTo.index();
    public static final int ATTACHMENT = AttributesEnum.Attachment.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsTaxIdentificationDocImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsTaxIdentificationDoc");
    }

    /**
     * Gets the attribute value for TidId, using the alias name TidId.
     * @return the value of TidId
     */
    public Integer getTidId() {
        return (Integer) getAttributeInternal(TIDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TidId.
     * @param value value to set the TidId
     */
    public void setTidId(Integer value) {
        setAttributeInternal(TIDID, value);
    }

    /**
     * Gets the attribute value for LegalEntity, using the alias name LegalEntity.
     * @return the value of LegalEntity
     */
    public String getLegalEntity() {
        return (String) getAttributeInternal(LEGALENTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LegalEntity.
     * @param value value to set the LegalEntity
     */
    public void setLegalEntity(String value) {
        setAttributeInternal(LEGALENTITY, value);
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
     * Gets the attribute value for TaxIdentificationNumber, using the alias name TaxIdentificationNumber.
     * @return the value of TaxIdentificationNumber
     */
    public String getTaxIdentificationNumber() {
        return (String) getAttributeInternal(TAXIDENTIFICATIONNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxIdentificationNumber.
     * @param value value to set the TaxIdentificationNumber
     */
    public void setTaxIdentificationNumber(String value) {
        setAttributeInternal(TAXIDENTIFICATIONNUMBER, value);
    }

    /**
     * Gets the attribute value for ValidFrom, using the alias name ValidFrom.
     * @return the value of ValidFrom
     */
    public Date getValidFrom() {
        return (Date) getAttributeInternal(VALIDFROM);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValidFrom.
     * @param value value to set the ValidFrom
     */
    public void setValidFrom(Date value) {
        setAttributeInternal(VALIDFROM, value);
    }

    /**
     * Gets the attribute value for ValidTo, using the alias name ValidTo.
     * @return the value of ValidTo
     */
    public Date getValidTo() {
        return (Date) getAttributeInternal(VALIDTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValidTo.
     * @param value value to set the ValidTo
     */
    public void setValidTo(Date value) {
        setAttributeInternal(VALIDTO, value);
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
     * @param tidId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer tidId) {
        return new Key(new Object[] { tidId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setTidId(am.getDBSequence("SGS_TAX_IDENTIFICATION_DOC_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
   
}

