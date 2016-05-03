/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;


import movierental.Movie;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author 12dow_000
 */
public class MovieRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ArrayList<MovieSpec> movies = new ArrayList();
        ArrayList<Movie> inventory = new ArrayList();
        ArrayList<Actor> actors = new ArrayList();
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        // Adding Test Data, Creating Objects
        
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 10);
        
        cal2.set(Calendar.YEAR, 2016);
        cal2.set(Calendar.MONTH, 3);
        cal2.set(Calendar.DATE, 13);
        
        Customer testUser = new Customer("Bob","816-555-555","123 Main St");
                
        actors.add(new Actor("Harrison Ford", Gender.MALE));
        actors.add(new Actor("Shia LaBouf", Gender.MALE));
        movies.add(new MovieSpec("Indiana Jones and the Kingdom of the Crystal Skull",Genre.ACTION,2012,Status.AVAILABLE, Rating.PG13, actors));
        actors.clear();
        
        actors.add(new Actor("Dainel Radcliffe",Gender.MALE));
        actors.add(new Actor("Rupert Grint",Gender.MALE));
        actors.add(new Actor("Emma Watson",Gender.FEMALE));
        movies.add(new MovieSpec("Harry Potter and the Order of the Pheonix", Genre.FANTASY, 2010,Status.AVAILABLE, Rating.PG13, actors));
        actors.clear();
        
        actors.add(new Actor("Tom Hanks",Gender.MALE));
        actors.add(new Actor("Tim Allen",Gender.MALE));
        movies.add(new MovieSpec("Toy Story", Genre.ADVENTURE, 1994, Status.AVAILABLE, Rating.G, actors));
        actors.clear();
        
        inventory.add(new Movie("1001",movies.get(0)));
        inventory.add(new Movie("1002",movies.get(0)));
        inventory.add(new Movie("1003",movies.get(1)));
        inventory.add(new Movie("1004",movies.get(1)));
        inventory.add(new Movie("1005",movies.get(2)));
        inventory.add(new Movie("1006",movies.get(2)));
        
        // Task 1
        ArrayList<Movie> results = new ArrayList();
        results = searchInventory(inventory,"Toy Story"); //search the inventory for toy story
        try{
            testUser.newRental(cal, results.get(0), Boolean.TRUE); //Rent one of the selected movies, pick it up in store; Also sets return date
        }
        catch(Exception e){
            System.out.print(e); // Cannot rent out a non avalible movie
        }
        try{
            testUser.getRented().get(0).pay(testUser.getRented().get(0).getOwed()); // Pay the amount owed
        }
        catch(Exception e){
            System.out.print(e); // The amount owed was not paid
        }
        
    }    
    
    public static ArrayList<Movie> searchInventory(ArrayList<Movie> inventory, String title){
        ArrayList<Movie> results = new ArrayList();
        
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).getSpec().getTitle()==title){
                results.add(inventory.get(i)); //Add to results
                inventory.get(i).getSpec().f(); // Display Data
            }
        }
        
        return results;
    }
    
}
