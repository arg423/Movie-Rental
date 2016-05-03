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
    private boolean paid; //have they paid for the rental yet?
    private double owed; //How much do they owe for their rental
    
    public Rental(Calendar rentDate, Enum status, Movie c, boolean pickupInStore)
    {
        this.rentDate = rentDate;
        rentDate.roll(Calendar.DATE, 7);
        this.returnDate = rentDate; // return date is one week from rent date
        this.status = status;
        this.m = m;
        this.pickupInStore = pickupInStore;
        this.paid = false;
        this.owed = 5.00;
        System.out.println("Your total is " + owed);
    }
    
    public void pay(double amount) throws Exception{
        owed = owed - amount;
        if(owed > 0)
            throw new Exception("You have failed to pay your debt fully, you still owe: " + owed);
        else{
            paid = true;
            System.out.println("You have paid the amount owed.");
        }
    }
    
    public double getOwed(){
        return owed;
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
    
    public Calendar getReturnDateC(){
        return returnDate;
    }
    
    public String getRentDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(rentDate.getTime());
    }
    
    public void setReturnDate(Calendar ReturnDate){
        this.returnDate = ReturnDate;
    }
    
    public double calculateLateFee(Calendar currentDate){
        double fee = 0;
        if(currentDate.after(returnDate)){
            do{
                currentDate.roll(Calendar.DATE,false);
                fee = fee + 0.01;
            }while(currentDate.after(returnDate));
        }
        this.owed += fee;
        return fee;
    }
    
    
}
