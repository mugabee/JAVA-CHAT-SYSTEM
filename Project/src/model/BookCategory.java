/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Kaneza
 */
@Entity
public class BookCategory implements java.io.Serializable {
    @Id
    private String code;
    private String Name;
    @OneToMany(mappedBy = "category")
    private List<Book> book;

    public BookCategory(String code) {
        this.code = code;
    }

    public BookCategory() {
    }

    public BookCategory(String code, String Name) {
        this.code = code;
        this.Name = Name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
    
}
