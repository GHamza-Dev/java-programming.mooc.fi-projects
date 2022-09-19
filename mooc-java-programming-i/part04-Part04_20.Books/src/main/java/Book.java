public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String title,int numberOfPages,int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title+", "+this.numberOfPages+" pages, "+this.publicationYear;
    }
}
