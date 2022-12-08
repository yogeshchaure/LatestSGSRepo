package com.sgs.view;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;

public class ValueChangeListener {
    public ValueChangeListener() {
    }

    public void onChangeOfMonthVL(ValueChangeEvent valueChangeEvent) {
        String monthVal= (String)valueChangeEvent.getNewValue();
        if(null != monthVal && !(monthVal.isEmpty()) &&   !(" ".equalsIgnoreCase(monthVal))){
            System.out.println("monthVal :: "+monthVal);
            ViewObjectImpl wnsDashBoardVo =
                (ViewObjectImpl) getDCIteratorBindings("WnsTPDashBoardVO1Iterator").getViewObject();
            wnsDashBoardVo.setWhereClause("MONTH = '"+monthVal+"'");
            wnsDashBoardVo.executeQuery();
        }
    }
    
    private DCIteratorBinding getDCIteratorBindings(String iterName) {
        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        return bindings.findIteratorBinding(iterName);

    }
}
