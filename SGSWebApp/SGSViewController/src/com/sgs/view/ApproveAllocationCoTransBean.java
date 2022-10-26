package com.sgs.view;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.nav.RichButton;

public class ApproveAllocationCoTransBean {
    private RichButton creditMemoPopupClose;
    private RichPopup creditMemoPopUp;

    public ApproveAllocationCoTransBean() {
    }

    public void CreateCrediteMemoPopupClose(ActionEvent actionEvent) {
        // Add event code here...
        getCreditMemoPopUp().hide();
        
    }

    public void setCreditMemoPopupClose(RichButton creditMemoPopupClose) {
        this.creditMemoPopupClose = creditMemoPopupClose;
    }

    public RichButton getCreditMemoPopupClose() {
        return creditMemoPopupClose;
    }

    public void setCreditMemoPopUp(RichPopup creditMemoPopUp) {
        this.creditMemoPopUp = creditMemoPopUp;
    }

    public RichPopup getCreditMemoPopUp() {
        return creditMemoPopUp;
    }
}
