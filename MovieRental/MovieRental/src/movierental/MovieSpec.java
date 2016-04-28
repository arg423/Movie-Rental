package movierental;

public class MovieSpec {
    private int ID;
    private String title;
    private String genre;
    private int year;
    private Enum status;
    private String rating;
    
    
    public MovieSpec(String title, String genre, int year, Enum status, String rating){
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
    
    public String getGenre(){
        return genre;
    }
    
    public int getYear(){
        return year;
    }
    
    public Enum getStatus(){
        return status;
    }
    
    public String getRating(){
        return rating;
    }
    public void f(){
        System.out.println("movieSPEC");
    }
}
