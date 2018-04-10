import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private HashMap<Genre, Book> genreList;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.genreList = new HashMap<>();
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

    public Book removeBook() {
        Book removedBook = null;
        if (bookCount() > 0) {
            removedBook = books.remove(0);
        } else {
        }
        return removedBook;
    }

    public int countGenreList(){
        return genreList.size();
    }

    public void addBookToGenreList(Book bookToAdd){
        genreList.put(bookToAdd.getGenre(), bookToAdd);
    }

    public int countGenreTotals(Genre genreKey){
        int total = 0;
        for (genreKey : genreList.keySet()) {
            if(genreKey == genreList.keySet()){
                total += 1;
            }
        }
        return total;
    }




}
