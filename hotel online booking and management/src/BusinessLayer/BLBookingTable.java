
package BusinessLayer;
import Models.AllModel;
import Models.Corporate;

import java.util.ArrayList;

import DatabaseLayer.DLBookingTable;
import DatabaseLayer.DLCorporate;
import DatabaseLayer.RoomDL;
import Helper.InputException;

public class BLBookingTable {
    static AllModel model;

    public BLBookingTable(){
        this.model = new AllModel();
    }

    public AllModel getAllModel(){
        return model;
    }
    
    public static  ArrayList<AllModel> Booking() throws Exception {
		try {
			DLBookingTable dlbookingtable = new DLBookingTable(model);
			return dlbookingtable.getBooking();
		}catch(Exception e) {
			throw e;
		}
	}

	

	
	}

