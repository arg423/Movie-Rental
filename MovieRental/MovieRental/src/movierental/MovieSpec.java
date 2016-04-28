package movierental;

import java.util.ArrayList;

public class MovieSpec {
    private int ID;
    private String title;
    private Enum genre;
    private int year;
    private Enum status;
    private Enum rating;
    private ArrayList<Actor> Actors = new ArrayList();
    
    
    public MovieSpec(String title, Enum genre, int year, Enum status, Enum rating, ArrayList<Actor> Actors){
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.status = status;
        this.rating = rating;
        this.Actors = Actors;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getTitle(){
        return title;
    }
    
    public Enum getGenre(){
        return genre;
    }
    
    public int getYear(){
        return year;
    }
    
    public Enum getStatus(){
        return status;
    }
    
    public Enum getRating(){
        return rating;
    }
    public void f(){
        System.out.println("movieSPEC");
    }
}
