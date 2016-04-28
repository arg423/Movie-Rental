/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;

import movierental.Movie;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author 12dow_000
 */
public class Customer {
    private String name;
    private String phone;
    private String address;
    private ArrayList<Rental> rentals = new ArrayList();
    private ArrayList<Rental> returned = new ArrayList();
    
    public Customer(String Name, String Phone, String Address){
        this.name = Name;
        this.phone = Phone;
        this.address = Address;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void newRental(Calendar rentDate, Movie c)
    {
        Enum status = Status.RENTED;
        rentals.add(new Rental(rentDate,status, c));
    }
    
    public void returnedRental(Calendar returnDate, Movie c)
    {
        Enum status = Status.RETURNED;
        returned.add(new Rental(returnDate, status, c));
    }
    
    public ArrayList<Rental> getRented()
    {
        ArrayList<Rental> rented = new ArrayList();
        for(int i=0;i<rentals.size();i++){
            if(rentals.get(i).getStatus() == Status.RENTED)
                rented.add(rentals.get(i));
        }
        return rented;
    }
    
    public ArrayList<Rental> getReturned(){
        ArrayList<Rental> returned = new ArrayList();
        for(int i=0;i<rentals.size();i++){
            if(rentals.get(i).getStatus() == Status.RETURNED)
                returned.add(rentals.get(i));
        }
        return returned;
    }
    
    public void displayData()
    {
        f(name);
        f(phone);
        f(address);
    }
    public void f(String out){
        System.out.println(out);
    }
    
    
}
