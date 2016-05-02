/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;

import movierental.Movie;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author 12dow_000
 */
public class Rental {
    private Calendar rentDate;
    private Calendar returnDate;
    private Enum status;
    private Movie m;
    private boolean pickupInStore; // if false mail to customer address.
    
    public Rental(Calendar rentDate, Enum status, Movie c, boolean pickupInStore)
    {
        this.rentDate = rentDate;
        this.status = status;
        this.m = m;
        this.pickupInStore = pickupInStore;
    }
    
    public boolean getPickupInStore(){
        return pickupInStore;
    }
    
    public Enum getStatus(){
        return status;
    }
    
    public void setStatus(Enum status){
        this.status = status;
    }
    
    public Movie getMovie(){
        return m;
    }
    
    public String getReturnDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(returnDate.getTime());
    }
    
    public String getRentDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(rentDate.getTime());
    }
    
    public void setReturnDate(Calendar ReturnDate){
        this.returnDate = ReturnDate;
    }
    
    
}
