package com.sgs.managedBean;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class NavigationBean implements Serializable {
    private String taskFlowId = "/bTaskFlow/costIdentificationRuleBTF.xml#costIdentificationRuleBTF";

    public NavigationBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String costIdentificationRuleBTF() {
        setDynamicTaskFlowId("/bTaskFlow/costIdentificationRuleBTF.xml#costIdentificationRuleBTF");
        return null;
    }

    public String businessUnitMasterBTF() {
        setDynamicTaskFlowId("/bTaskFlow/businessUnitMasterBTF.xml#businessUnitMasterBTF");
        return null;
    }

    public String tPASetupBTF() {
        setDynamicTaskFlowId("/bTaskFlow/TPASetupBTF.xml#TPASetupBTF");
        return null;
    }

    public String gstInquiryBTF() {
        setDynamicTaskFlowId("/bTaskFlow/gstInquiryBTF.xml#gstInquiryBTF");
        return null;
    }

    public String vatInquiryBTF() {
        setDynamicTaskFlowId("/bTaskFlow/vatInquiryBTF.xml#vatInquiryBTF");
        return null;
    }

    public String withholdingTaxDeductedTaxMainBTF() {
        setDynamicTaskFlowId("/bTaskFlow/withholdingTaxDeductedTaxMainBTF.xml#withholdingTaxDeductedTaxMainBTF");
        return null;
    }

    public String isdBTF() {
        setDynamicTaskFlowId("/bTaskFlow/isdBTF.xml#isdBTF");
        return null;
    }

    public String standardRateSetupBTF() {
        setDynamicTaskFlowId("/bTaskFlow/standardRateSetupBTF.xml#standardRateSetupBTF");
        return null;
    }

    public String statisticalBTF() {
        setDynamicTaskFlowId("/bTaskFlow/StatisticalBTF.xml#StatisticalBTF");
        return null;
    }

    public String statisticalARDataBTF() {
        setDynamicTaskFlowId("/bTaskFlow/statisticalARDataBTF.xml#statisticalARDataBTF");
        return null;
    }

    public String tpSummaryBTF() {
        setDynamicTaskFlowId("/bTaskFlow/tpSummaryBTF.xml#tpSummaryBTF");
        return null;
    }

    public String transBCostAllocationMainBTF() {
        setDynamicTaskFlowId("/bTaskFlow/transBCostAllocationMainBTF.xml#transBCostAllocationMainBTF");
        return null;
    }

    public String approveallocatedICoTransactionBTF() {
        setDynamicTaskFlowId("/bTaskFlow/approveallocatedICoTransactionBTF.xml#approveallocatedICoTransactionBTF");
        return null;
    }

    public String nettingICVInvoicesFormBTF() {
        setDynamicTaskFlowId("/bTaskFlow/nettingICVInvoicesFormBTF.xml#nettingICVInvoicesFormBTF");
        return null;
    }

    public String fixedAssetsBTF() {
        setDynamicTaskFlowId("/bTaskFlow/fixedAssetsBTF.xml#fixedAssetsBTF");
        return null;
    }

    public String settlementVouchersBTF() {
        setDynamicTaskFlowId("/bTaskFlow/settlementVouchersBTF.xml#settlementVouchersBTF");
        return null;
    }

    public String settlementVouchersFormBTF() {
        setDynamicTaskFlowId("/bTaskFlow/settlementVouchersFormBTF.xml#settlementVouchersFormBTF");
        return null;
    }

    public String settlementICoInvoices() {
        setDynamicTaskFlowId("/bTaskFlow/settlementICoInvoices.xml#settlementICoInvoices");
        return null;
    }

    public String runIntercompanyExtractionBTF() {
        setDynamicTaskFlowId("/bTaskFlow/runIntercompanyExtractionBTF.xml#runIntercompanyExtractionBTF");
        return null;
    }

    public String runAllocationEngineBTF() {
        setDynamicTaskFlowId("/bTaskFlow/runAllocationEngineBTF.xml#runAllocationEngineBTF");
        return null;
    }
}
