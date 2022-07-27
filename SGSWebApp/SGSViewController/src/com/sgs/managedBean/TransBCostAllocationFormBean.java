package com.sgs.managedBean;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

public class TransBCostAllocationFormBean {
    private RichPopup holdDetailPopup;
    private RichPopup revRecDetailPopup;
    private RichPopup otherReceivablePopup;

    public TransBCostAllocationFormBean() {
        super();
    }

    public void setRevRecDetailPopup(RichPopup revRecDetailPopup) {
        this.revRecDetailPopup = revRecDetailPopup;
    }

    public RichPopup getRevRecDetailPopup() {
        return revRecDetailPopup;
    }

    public void saveRectificationDetails(ActionEvent actionEvent) {
        getRevRecDetailPopup().hide();
    }

    public void closeRectificationDetails(ActionEvent actionEvent) {
        getRevRecDetailPopup().hide();
    }

    public void setHoldDetailPopup(RichPopup holdDetailPopup) {
        this.holdDetailPopup = holdDetailPopup;
    }

    public RichPopup getHoldDetailPopup() {
        return holdDetailPopup;
    }
    public void saveHoldReleaseDetails(ActionEvent actionEvent) {
        getHoldDetailPopup().hide();
    }

    public void closeHoldReleaseDetails(ActionEvent actionEvent) {
        getHoldDetailPopup().hide();
    }
    
    public void saveOtherReceivableDetails(ActionEvent actionEvent) {
        getOtherReceivablePopup().hide();
    }

    public void closeOtherReceivableDetails(ActionEvent actionEvent) {
        getOtherReceivablePopup().hide();
    }

    public void setOtherReceivablePopup(RichPopup otherReceivablePopup) {
        this.otherReceivablePopup = otherReceivablePopup;
    }

    public RichPopup getOtherReceivablePopup() {
        return otherReceivablePopup;
    }
}
