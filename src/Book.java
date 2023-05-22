package src;

public class Book {
    protected String title, author, genre;
    protected Boolean availabilityStatus = true;

    Book(String title,String author ,String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public void changeAvailabilityStatus() {
        this.availabilityStatus = !this.availabilityStatus;
    }

}
