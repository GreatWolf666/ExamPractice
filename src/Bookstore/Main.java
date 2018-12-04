package Bookstore;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Book> books = new ArrayList<Book>();
    books.add(new Hardcover("The Fellowship of the Ring", "J.R.R. Tolkien", "1954", 423));
    books.add(new Hardcover("The Two Towers", "J.R.R. Tolkien", "1954", 352));
    books.add(new Hardcover("The Return of King", "J.R.R. Tolkien", "1954", 416));

    books.add(new Paperback("First and Only", "Dan Abnett", "2003", 430));
    books.add(new Paperback("Ghostmaker", "Dan Abnett", "2007", 340));
    books.add(new Paperback("Necropolis", "Dan Abnett", "2012", 610));


    Bookshelf bookshelf = new Bookshelf(books);

    System.out.println(bookshelf.lightestBook());
    System.out.println(bookshelf.mostPagesByAuthor());
  }

}
