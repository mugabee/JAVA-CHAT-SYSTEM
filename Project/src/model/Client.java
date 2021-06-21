/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Kaneza
 */
@Entity
public class Client implements java.io.Serializable {
    @Id
    private String regNo;
    @Column(name = "name")
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    @Column(name = "photo", length = 100000)
    private byte[] photo;
    @Enumerated(EnumType.STRING)
    private ClientCategory category;
    @OneToMany(mappedBy = "regId")
    private List<BookTransaction> book;
    
    public Icon getImage(){
        String y = new String(getPhoto());
        Image im = Toolkit.getDefaultToolkit().createImage(y);
        im =im.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Icon imm = new ImageIcon(im);
        return imm;
        //return new ImageIcon(new ImageIcon(photo).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
    }

    public Client() {
    }

    public Client(String regNo) {
        this.regNo = regNo;
    }

    public Client(String regNo, String firstName, String lastName, String phoneNumber, String emailAddress, byte[] photo, ClientCategory category) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.photo = photo;
        this.category = category;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   

    

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

 

    public ClientCategory getCategory() {
        return category;
    }

    public void setCategory(ClientCategory category) {
        this.category = category;
    }

    public List<BookTransaction> getBook() {
        return book;
    }

    public void setBook(List<BookTransaction> book) {
        this.book = book;
    }
    
}
