package com.sgs.view;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.RichPopup;

public class SettlementVouchersBean {
    private RichPopup voucherPopup;

    public SettlementVouchersBean() {
    }

    public void setVoucherPopup(RichPopup voucherPopup) {
        this.voucherPopup = voucherPopup;
    }

    public RichPopup getVoucherPopup() {
        return voucherPopup;
    }
    
    public void saveDetails(ActionEvent actionEvent) {
      getVoucherPopup().hide();
    }

    public void closeDetails(ActionEvent actionEvent) {
        getVoucherPopup().hide();
    }
}
