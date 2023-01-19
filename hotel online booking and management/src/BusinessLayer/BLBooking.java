package BusinessLayer;
import Models.AllModel;
import Models.Booking;
import Models.Corporate;

import javax.swing.JOptionPane;

import DatabaseLayer.DLBooking;
import DatabaseLayer.DLCorporate;
import Helper.InputException;

public class BLBooking {
    Booking booking;
    AllModel allmodel;

    public BLBooking(){
        this.booking = new Booking();
    }

    public Booking getBooking(){
        return booking;
    }
    
    

    public void setBooking(Booking booking) throws InputException{
        try{
            if(this.validateBooking(booking))
                this.booking = booking;
        } catch (InputException ex){
            throw ex;
        }
    }

    public boolean validateBooking(Booking booking) throws InputException{
        if(booking.getFullName() == null || booking.getFullName().length() == 0)
            throw new InputException(" FullName cannot be empty");
        if(booking.getAddress() == null || booking.getAddress().length() == 0)
            throw new InputException(" Address cannot be empty");
        if(booking.getCheck_in_date() == null || booking.getCheck_in_date().length() == 0)
            throw new InputException(" Check-IN-Date cannot be empty");
        if(booking.getCheck_out_date() == null || booking.getCheck_out_date().length() == 0)
            throw new InputException(" Check-Out-Date cannot be empty");
        if(booking.getPostal_code() == null || booking.getPostal_code().length() == 0)
            throw new InputException(" Postal Code Cannot be empty");
       
        return  true;
    }
    public Booking bookinginf(Booking booking) throws Exception {
        //this fuction get the corporateatt detail to log in
        try {

            DLBooking dlbooking = new DLBooking(booking);
            return dlbooking.save();
        } catch (Exception e) {
            throw e;
            
        }
    }

public AllModel assignRoom(AllModel allmodel) throws Exception {
    //this fuction get the corporateatt detail to log in
    try {

        DLBooking dlbooking = new DLBooking(allmodel);
        return dlbooking.updateRoom();
    } catch (Exception e) {
        throw e;
        
    }
}
}
