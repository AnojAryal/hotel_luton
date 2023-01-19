package BusinessLayer;
import Models.AllModel;
import Models.Corporate;
import Models.NonCorporate;
import DatabaseLayer.DLCorporate;
import DatabaseLayer.DLNonCorporate;
import Helper.InputException;

public class BLNonCorporate {
    NonCorporate noncorporate;

    public BLNonCorporate(){
        this.noncorporate = new NonCorporate();
    }

    public NonCorporate getNonCorporate(){
        return noncorporate;
    }

    public void setNonCorporate(NonCorporate noncorporate) throws InputException{
        try{
            if(this.validateNonCorporate(noncorporate))
                this.noncorporate = noncorporate;
        } catch (InputException ex){
            throw ex;
        }
    }

    public boolean validateNonCorporate(NonCorporate noncorporate) throws InputException{
        if(noncorporate.getFirst_Name() == null || noncorporate.getFirst_Name().length() == 0)
            throw new InputException(" First Name cannot be empty");
        if(noncorporate.getLast_Name() == null || noncorporate.getLast_Name().length() == 0)
            throw new InputException(" Last Name cannot be empty");
        if(noncorporate.getAddress() == null || noncorporate.getAddress().length() == 0)
            throw new InputException(" Address cannot be empty");
        if(noncorporate.getEmail() == null || noncorporate.getEmail().length() == 0)
            throw new InputException(" Email cannot be empty");
        if(noncorporate.getPassword() == null || noncorporate.getPassword().length() == 0)
            throw new InputException(" Password cannot be empty");
        if(noncorporate.getCredit_Card_No() == null || noncorporate.getCredit_Card_No().length() == 0)
            throw new InputException(" credit card no cannot be empty");
    
       if(noncorporate.getConfirm_Password() == null || noncorporate.getConfirm_Password().length() == 0)
           throw new InputException(" Retype the password");
       
        return  true;
    }
    public NonCorporate noncorporateinf(NonCorporate noncorporate) throws Exception {
        //this fuction get the corporateatt detail to log in
        try {
            DLNonCorporate dlnoncorporate = new DLNonCorporate(noncorporate);
            return dlnoncorporate.save();
        } catch (Exception e) {
            throw e;
            
        }
        
    }
    public boolean validateLogin(AllModel model) throws InputException{
        if(model.getEmail() == null || model.getEmail().length() == 0)
            throw new InputException(" Email cannot be empty");
        if(model.getPassword() == null || model.getPassword().length() == 0)
            throw new InputException(" Password cannot be empty");
        return  true;
    }
    
    public 	AllModel logininf(AllModel model) throws Exception {
        //this fuction get the loginatt detail to log in
        try {
            DLNonCorporate dllogin = new DLNonCorporate(model);
            return dllogin.model();
        } catch (Exception e) {
            throw e;
        }
    }

}

