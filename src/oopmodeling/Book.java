package oopmodeling;

/**
 * @author Guillermo
 * @created 16/10/2026
 *
 */
public class Book {
    private long id;

    private String title;

    private String author;

    private String releaseDate;

    private String numOfPages;

    public String category;

    //part 2 constructors

    public Book(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(long id, String title, String author, String releaseDate, String numOfPages, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.numOfPages = numOfPages;
        this.category = category;
    }

    //part 3 methods

}
