package com.sgs.model.view;

import java.sql.Date;

import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 23 16:33:06 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsTpaMasterVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public SgsTpaMasterVOImpl() {
    }

    @Override
    public void afterCommit(TransactionEvent transactionEvent) {
        // TODO Implement this method
        executeQuery();
        super.afterCommit(transactionEvent);
    }
}

