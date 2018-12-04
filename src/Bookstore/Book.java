package Bookstore;

public class Book {
  private String title;
  private String author;
  private String releaseYear;
  private int pageNumber;
  private int coverWeight;
  private int pageWeight = 10;

  public Book(String title, String author, String releaseYear, int pageNumber, int coverWeight) {
    this.title = title;
    this.author = author;
    this.releaseYear = releaseYear;
    this.pageNumber = pageNumber;
    this.coverWeight = coverWeight;
  }

  public int calculateWeight() {
    return (pageNumber * pageWeight) + coverWeight;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getReleaseYear() {
    return releaseYear;
  }

  public int getPageNumber() {
    return pageNumber;
  }
}

