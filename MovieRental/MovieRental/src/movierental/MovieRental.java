/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;

import carrental.CustomerFrameGUI;
import movierental.Movie;
import carrental.Size;
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
    public static void main(String[] args) {
        ArrayList<Customer> clients = new ArrayList();
        ArrayList<MovieSpec> cars = new ArrayList();
        ArrayList<Movie> inventory = new ArrayList();
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DATE, 10);
        
        cal2.set(Calendar.YEAR, 2016);
        cal2.set(Calendar.MONTH, 3);
        cal2.set(Calendar.DATE, 13);
        
        clients.add(new Customer("Bob","816-555-555","123 Main St"));
        clients.add(new Customer("Joe","913-555-555","321 Oak St"));
        clients.add(new Customer("Steve","321-555-5555","258 Cherry St"));
        
        movies.add(new MovieSpec("Honda","Civic",2010,Status.AVAILABLE));
        movies.add(new MovieSpec("Ford","Explorer",2012,Status.RETURNED));
        movies.add(new MovieSpec("Chevy","Silverado",2016,Status.RENTED));
        
        inventory.add(new Movie("1001",cars.get(0)));
        inventory.add(new Movie("1002",cars.get(0)));
        inventory.add(new Movie("1003",cars.get(1)));
        inventory.add(new Movie("1004",cars.get(1)));
        inventory.add(new Movie("1005",cars.get(2)));
        inventory.add(new Movie("1006",cars.get(2)));
        
        CustomerFrameGUI w = new CustomerFrameGUI(clients, inventory);
        w.setVisible(true);
       
    }    
}
