package com.sgs.managedBean;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class TransBCostAllocationBean {
    private RichPopup holdDetailPopup;
   private RichPopup otherReceivablePopup;
    public TransBCostAllocationBean() {
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public String deleteTransBCostAllocation() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        OperationBinding deleteOb = bindings.getOperationBinding("Commit");
        deleteOb.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
    public void saveHoldReleaseDetails(ActionEvent actionEvent) {
        getHoldDetailPopup().hide();
    }

    public void closeHoldReleaseDetails(ActionEvent actionEvent) {
        getHoldDetailPopup().hide();
    }

    public void setHoldDetailPopup(RichPopup holdDetailPopup) {
        this.holdDetailPopup = holdDetailPopup;
    }

    public RichPopup getHoldDetailPopup() {
        return holdDetailPopup;
    }

    public void setOtherReceivablePopup(RichPopup otherReceivablePopup) {
        this.otherReceivablePopup = otherReceivablePopup;
    }

    public RichPopup getOtherReceivablePopup() {
        return otherReceivablePopup;
    }
    public void saveOtherReceivableDetails(ActionEvent actionEvent) {
        getOtherReceivablePopup().hide();
    }

    public void closeOtherReceivableDetails(ActionEvent actionEvent) {
        getOtherReceivablePopup().hide();
    }
}
