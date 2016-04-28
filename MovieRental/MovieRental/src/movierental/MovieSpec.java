package movierental;

public class MovieSpec {
    private int ID;
    private String title;
    private Enum genre;
    private int year;
    private Enum status;
    private Enum rating;
    
    
    public MovieSpec(String title, Enum genre, int year, Enum status, Enum rating){
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.status = status;
        this.rating = rating;
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
