package BusinessLayer;


import Models.AllModel;
import Models.Corporate;

import java.util.ArrayList;

import DatabaseLayer.DLBookingTable;
import DatabaseLayer.DLCorporate;
import DatabaseLayer.DLInvoiceTable;
import DatabaseLayer.RoomDL;
import Helper.InputException;

public class BLInvoiceTable {
    static AllModel model;

    public BLInvoiceTable(){
        this.model = new AllModel();
    }

    public AllModel getAllModel(){
        return model;
    }
    
    
    public static  ArrayList<AllModel> Invoice() throws Exception {
		try {
			DLInvoiceTable dlinvoicetable = new DLInvoiceTable();
			return dlinvoicetable.getInvoice();
		}catch(Exception e) {
			throw e;
		}
	}

	

	
	}

