public class Book {

    private String title;
    private String author;
    private Genre genre;



    public Book(String author, String title, Genre genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public Genre getGenre(){
        return this.genre;
    }

}
