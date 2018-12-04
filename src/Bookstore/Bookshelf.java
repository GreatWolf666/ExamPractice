package Bookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Bookshelf {
  ArrayList<Book> books = new ArrayList<Book>();

  public Bookshelf(ArrayList<Book> books) {
    this.books = books;

  }

  public String lightestBook() {
    Book lightest = null;

    for (Book book : books) {
      if (lightest == null) {
        lightest = book;
      } else {
        if (lightest.calculateWeight() > book.calculateWeight()) {
          lightest = book;
        }
      }

    }
    return lightest.getAuthor();
  }
  public String mostPagesByAuthor(){
    HashMap<String, Integer> authors = new HashMap();
//    fills hashmap with calculated page numbers, with comparing (in collections)
    for (Book book : books){
      if (authors.containsKey(book.getAuthor())){
        authors.replace(book.getAuthor(),authors.get(book.getAuthor())+ book.getPageNumber());
      }else{
        authors.put(book.getAuthor(), book.getPageNumber());
      }
    }// Map has comparing by value, compares Map entries (by key or value)
  String author = Collections.max(authors.entrySet(), Map.Entry.comparingByValue()).getKey();
    return author;
  }
}
