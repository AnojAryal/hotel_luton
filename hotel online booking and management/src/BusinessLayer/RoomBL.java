package BusinessLayer;
import Models.AllModel;
import Models.Corporate;

import java.util.ArrayList;

import DatabaseLayer.DLCorporate;
import DatabaseLayer.RoomDL;
import Helper.InputException;

public class RoomBL {
    AllModel model;

    public RoomBL(){
        this.model = new AllModel();
    }

    public AllModel getAllModel(){
        return model;
    }
    
    public ArrayList<AllModel> getRoom() throws Exception {
		try {
			RoomDL dlRoom = new RoomDL(this.model);
			return dlRoom.getRoom();
		}catch(Exception e) {
			throw e;
		}
	}

}