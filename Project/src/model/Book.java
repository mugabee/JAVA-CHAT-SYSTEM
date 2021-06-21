/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import sun.util.locale.provider.AvailableLanguageTags;

/**
 *
 * @author Kaneza
 */
@Entity
public class Book implements java.io.Serializable {
    @Id
    private String bookId;
    private String title;
    private String publishingHouse;
    private String dateOfPublication;
    private String author;
    private int pages;
    private  boolean available;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private BookCategory category;
    @OneToMany(mappedBy = "bookId")
    private List<BookTransaction> books;

    public Book() {
    }

    public Book(String bookId) {
        this.bookId = bookId;
    }

    public Book(String bookId, String title, String publishingHouse, String dateOfPublication, String author, int pages, boolean available, BookCategory category) {
        this.bookId = bookId;
        this.title = title;
        this.publishingHouse = publishingHouse;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
        this.pages = pages;
        this.available = available;
        this.category = category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(String bookId, boolean available) {
        this.bookId = bookId;
        this.available = available;
    }

   

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public List<BookTransaction> getBooks() {
        return books;
    }

    public void setBooks(List<BookTransaction> books) {
        this.books = books;
    }
    
}
