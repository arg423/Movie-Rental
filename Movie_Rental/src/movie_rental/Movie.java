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
public class Movie {
    
    private int rating;
    private String genre;
    private int year;
    private String name;
    
    public Movie(int rating, String genre, int year, String name){
        
        this.rating = rating;
        this.genre = genre;       
        this.year = year;
        this.name = name;
    }
    
    public int getRating(){
        return rating;
    }
    
    public String getGenre(){
        return genre;
    }
    public int getYear(){
        return year;
    }
    
    public String getName(){
        return name;
    }    
}
