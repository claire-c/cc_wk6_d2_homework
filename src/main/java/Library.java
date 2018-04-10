import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return books.size();
    }
    public boolean checkCapacity(){
        if (bookCount() >= this.capacity){
            return false;
        }   else {return true;}
    }

    public void addBook(Book bookToAdd) {
        if (checkCapacity()) {
            books.add(bookToAdd);
        } else {}
    }




}
