public class Book {

    private String title;
    private String author;



    public Book(String author, String title){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }


}
