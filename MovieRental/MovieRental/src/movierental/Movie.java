/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kyle
 */
public class Movie {
        private String ID;
        private MovieSpec movie;
                
    public Movie(String ID, MovieSpec movie){
        this.ID = ID;
        this.movie = movie;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public String getMake(){
        return this.movie.getMake();
    }
    
    public String getModel(){
        return this.movie.getModel();
    }
    
    public int getYear(){
        return this.movie.getYear();
    }
    
    public Enum getSize(){
        return this.movie.getSize();
    }
        
    public void f(){
        System.out.println("car");
    }
}

