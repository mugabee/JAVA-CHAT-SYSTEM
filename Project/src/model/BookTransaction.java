/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Kaneza
 */
@Entity
public class BookTransaction implements Serializable{
    @Id
//    @JoinTable(
//            name = "client",
//            //joinColumns = {@JoinColumn(name = "regId") },
//            //inverseJoinColumns = {@JoinColumn(name = "regId") })
    @ManyToOne
    private Client regId;
    @Id
//    @JoinTable(
//            name = "book",
//            joinColumns = {@JoinColumn(name = "bookId")},
//            inverseJoinColumns = {@JoinColumn(name = "bookId")}
//    )
    @ManyToOne
    private Book bookId;
    private String transactionDate;
    private String returnDate;
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    public BookTransaction() {
    }

    public BookTransaction(Client regId, Book bookId, String transactionDate, String returnDate, TransactionType type) {
        this.regId = regId;
        this.bookId = bookId;
        this.transactionDate = transactionDate;
        this.returnDate = returnDate;
        this.type = type;
    }

    public Client getRegId() {
        return regId;
    }

    public void setRegId(Client regId) {
        this.regId = regId;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    
    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
    
}
