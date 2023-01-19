package BusinessLayer;
import Models.Corporate;
import DatabaseLayer.DLCorporate;
import Helper.InputException;

public class BLCorporate {
    Corporate corporate;

    public BLCorporate(){
        this.corporate = new Corporate();
    }

    public Corporate getCorporate(){
        return corporate;
    }

    public void setCorporate(Corporate corporate) throws InputException{
        try{
            if(this.validateCorporate(corporate))
                this.corporate = corporate;
        } catch (InputException ex){
            throw ex;
        }
    }

    public boolean validateCorporate(Corporate corporate) throws InputException{
        if(corporate.getCompany_Name() == null || corporate.getCompany_Name().length() == 0)
            throw new InputException(" Company Name cannot be empty");
        if(corporate.getContact() == null || corporate.getContact().length() == 0)
            throw new InputException(" Contact no  cannot be empty");
        if(corporate.getEmail() == null || corporate.getEmail().length() == 0)
            throw new InputException(" Email cannot be empty");
        if(corporate.getPassword() == null || corporate.getPassword().length() == 0)
            throw new InputException(" Password cannot be empty");
        if(corporate.getConfirm_Password() == null || corporate.getConfirm_Password().length() == 0)
            throw new InputException(" Retype the password");
       
        return  true;
    }
    public Corporate corporateinf(Corporate corporate) throws Exception {
        //this fuction get the corporateatt detail to log in
        try {
            DLCorporate dlcorporate = new DLCorporate(corporate);
            return dlcorporate.save();
        } catch (Exception e) {
            throw e;
            
        }
        
    }
    public boolean validateLogin(Corporate corporateLogin) throws InputException{
        if(corporateLogin.getEmail() == null || corporateLogin.getEmail().length() == 0)
            throw new InputException(" Email cannot be empty");
        if(corporateLogin.getPassword() == null || corporateLogin.getPassword().length() == 0)
            throw new InputException(" Password cannot be empty");
        return  true;
    }
    
    public Corporate logininf(Corporate corporateLogin) throws Exception {
        //this fuction get the loginatt detail to log in
        try {
            DLCorporate dlloginatt = new DLCorporate(corporateLogin);
            return dlloginatt.corporate();
        } catch (Exception e) {
            throw e;
        }
    }

}

