package com.sgs.managedBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.time.Period;

import java.util.StringTokenizer;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;

import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.UploadedFile;

public class TransBCostAllocationBean {
    private RichPopup holdDetailPopup;
   private RichPopup otherReceivablePopup;
    private RichTable staffTable;
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
        BindingContainer bindings = getBindings();
        OperationBinding saveOB = bindings.getOperationBinding("Commit");
        saveOB.execute();
        getOtherReceivablePopup().hide();
    }

    public void closeOtherReceivableDetails(ActionEvent actionEvent) {
        getOtherReceivablePopup().hide();
    }
    
    public void fileUploaded(ValueChangeEvent valueChangeEvent) {
      // Add event code here...    
      UploadedFile file = (UploadedFile)valueChangeEvent.getNewValue();
      try {
        AdfFacesContext.getCurrentInstance().addPartialTarget(staffTable);
        parseFile(file.getInputStream());
        
      } catch (IOException e) {
        // TODO add more
      }
    }

    
    public void parseFile(java.io.InputStream file) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(file));
      String strLine = "";
      StringTokenizer st = null;
      int lineNumber = 0, tokenNumber = 0;
      Row rw = null;
     
      CollectionModel _tableModel = (CollectionModel)staffTable.getValue();
      //the ADF object that implements the CollectionModel is JUCtrlHierBinding. It
      //is wrapped by the CollectionModel API
      JUCtrlHierBinding _adfTableBinding =
          (JUCtrlHierBinding)_tableModel.getWrappedData();
      //Acess the ADF iterator binding that is used with ADF table binding
      DCIteratorBinding it =
          _adfTableBinding.getDCIteratorBinding();
           
      //read comma separated file line by line
      try 
      {
        while ((strLine = reader.readLine()) != null)
        {
          lineNumber++;
          // create a new row skip the header  (header has linenumber 1)           
          if (lineNumber>1)        {
             rw = it.getNavigatableRowIterator().createRow();
             rw.setNewRowState(Row.STATUS_INITIALIZED);
             it.getNavigatableRowIterator().insertRow(rw);
          }
          
          //break comma separated line using ","
          st = new StringTokenizer(strLine, ",");
          while (st.hasMoreTokens())
          {
            //display csv values
            tokenNumber++;
            
            String theToken = st.nextToken();
            System.out.println("Line # " + lineNumber + ", Token # " +
                tokenNumber +
                ", Token : " + theToken);
            if (lineNumber>1){
           
              switch (tokenNumber) {
             /* case 1: rw.setAttribute("OrId", theToken);
              case 2: rw.setAttribute("Period", theToken);
              case 3: rw.setAttribute("PeoplesoftTransactionId", theToken);
              case 4: rw.setAttribute("ExtractionId", theToken);   
              case 5: rw.setAttribute("SourceBusinessUnit", theToken);
              case 6: rw.setAttribute("SourceOperatingUnit", theToken);
                case 7: rw.setAttribute("SourceDepartmentId", theToken);
                case 8: rw.setAttribute("SourceGlAccount", theToken);
                case 9: rw.setAttribute("SourceJobCode", theToken);
                case 10: rw.setAttribute("ReclassBusinessUnit", theToken);
                case 11: rw.setAttribute("ReclassOperatingUnit", theToken);
                case 12: rw.setAttribute("ReclassDepartmentId", theToken);
                case 13: rw.setAttribute("ReclassGlAccount", theToken);
                case 14: rw.setAttribute("ReclassJobCode", theToken);
                case 15: rw.setAttribute("BaseCurrency", theToken);
                case 16: rw.setAttribute("TransactionCurrency", theToken);
                case 17: rw.setAttribute("Amount", theToken);*/
             
              case 1: rw.setAttribute("Period", theToken);
              case 2: rw.setAttribute("VoucherId", theToken);
              case 3: rw.setAttribute("FromBusinessUnit", theToken);   
              case 4: rw.setAttribute("FromOperatingUnit", theToken);
              case 5: rw.setAttribute("ToBusinessUnit", theToken);
                case 6: rw.setAttribute("ToOperatingUnit", theToken);
                case 7: rw.setAttribute("FromJobCode", theToken);
                case 8: rw.setAttribute("FromDepartmentId", theToken);
                case 9: rw.setAttribute("ToJobCode", theToken);
                case 10: rw.setAttribute("ToDepartmentId", theToken);
                case 11: rw.setAttribute("CrGlAccount", theToken);
                case 12: rw.setAttribute("DrGlAccount", theToken);
                case 13: rw.setAttribute("BaseCurrency", theToken);
                case 14: rw.setAttribute("TransactionCurrency", theToken);
                case 15: rw.setAttribute("Amount", theToken);
                
                
            }
          }
        }
        //reset token number        
        tokenNumber = 0;    
       } 
      }
      catch (IOException e) {
        // TODO add more
        FacesContext fctx = FacesContext.getCurrentInstance();
        fctx.addMessage(staffTable.getClientId(fctx), new FacesMessage(FacesMessage.SEVERITY_ERROR,
           "Content Error in Uploaded file", e.getMessage()));
      }
      catch (Exception e) {
      FacesContext fctx = FacesContext.getCurrentInstance();
      fctx.addMessage( null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
         "Data Error in Uploaded file", e.getMessage()));
        
      }
    }

    public void setStaffTable(RichTable staffTable) {
      this.staffTable = staffTable;
    }

    public RichTable getStaffTable() {
      return staffTable;
    }
}
