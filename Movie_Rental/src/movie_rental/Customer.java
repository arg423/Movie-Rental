/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_rental;

/**
 *
 * @author Adam
 */
public class Customer {
    
    private String email;
    private String address;
    private int phone;
    private String password;
    private String name;
    
    public Customer(String email, String address, int phone, String password, String name){
        
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.password = password;
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getPhone(){
        return phone;
    }
    
    public String password(){
        return password;
    }
    
    public String getName(){
        return name;
    }
}
