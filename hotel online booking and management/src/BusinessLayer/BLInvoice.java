package BusinessLayer;
// This class uses the user model to receive and send data to the database layer
// This class uses the user model to receive data from the frontend layer
import Models.AllModel;
import Models.Corporate;

import java.util.ArrayList;

import DatabaseLayer.DLInvoice;
import DatabaseLayer.DLBookingTable;
import DatabaseLayer.DLCorporate;
import Frontend.Admin;
import Helper.InputException;

public class BLInvoice<billing> {
	static AllModel invoice;
	
	public BLInvoice() {
		this.invoice = new AllModel();
	}
	
	public AllModel getAdmin() {
		return invoice;
	}

	public void setUser(AllModel user) throws InputException {
		try {
			if(this.validateUser(invoice)) {
				this.invoice = invoice;
			}
		}catch(InputException ex) {
			throw ex;
		}
		
	}
	
	public static AllModel getInvoice() {
		return invoice;
	}

	public static void setInvoice(AllModel invoice) {
		BLInvoice.invoice = invoice;
	}

	public boolean validateUser(AllModel invoice) throws InputException {
		if(invoice.getFullName() == null || invoice.getFullName().length() == 0) {
			throw new InputException("FullName name cannot be empty.");
		}
		
		 if(invoice.getInvoice_ID() == null || invoice.getInvoice_ID().length() == 0)
	            throw new InputException(" invoice id cannot be empty");
		 
		 if(invoice.getContact() == null || invoice.getContact().length() == 0) 
				throw new InputException(" contact no cannot be empty.");
		   
		   if(invoice.getCheck_in_date() == null || invoice.getCheck_in_date().length() == 0)
	            throw new InputException(" Check-IN-Date cannot be empty");
		   
	        if(invoice.getCheck_out_date() == null || invoice.getCheck_out_date().length() == 0)
	            throw new InputException(" Check-Out-Date cannot be empty");
		
		if(invoice.getAddress() == null || invoice.getAddress().length() == 0) {
			throw new InputException(" Address cannot be empty.");
		}
		return true;
	}
	
	public AllModel invoiceinf(billing billing) throws Exception {
        //this fuction get the corporateatt detail to log in
        try {
          
	// save the user, update the user, delete the user, getUserList
	
	
		
			DLInvoice dlBillings = new DLInvoice(this.invoice);
			return dlBillings.save();
		} catch (Exception e) {
			throw e;
		}
	}
       
}
	
	