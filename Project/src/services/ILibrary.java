/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Book;
import model.BookCategory;
import model.BookTransaction;
import model.Client;

/**
 *
 * @author Kaneza
 */
public interface ILibrary extends Remote {
    public List <BookCategory> findAllBookCategory() throws RemoteException;
    public List <Book> findAllBook()throws RemoteException;
    public void createBookCategory(BookCategory category) throws RemoteException;
    public void updateBookCategory(BookCategory category) throws RemoteException;
    public void deleteBookCategory(BookCategory category)throws RemoteException;
    public void createBook(Book book) throws RemoteException;
    public void updateBook(Book book) throws RemoteException;
    public void deleteBook(Book book) throws RemoteException;
    public BookCategory findBookCategory(String id)throws RemoteException;
    
    public void createClient(Client client) throws RemoteException;
    public void updateClient(Client client) throws RemoteException;
    public void deleteClient(Client client) throws RemoteException;
    public List <Client> findAllClient() throws RemoteException;
    
    public void createBookTransaction(BookTransaction transaction) throws RemoteException;
    public void updateBookTransaction(BookTransaction transaction) throws RemoteException;
    public void deleteBookTransaction(BookTransaction transaction) throws RemoteException;
    public List <BookTransaction> findAllBookTransaction() throws RemoteException;
    public Book findBookByTitle(String title) throws RemoteException;
    public Client findClientByName(String name) throws RemoteException;
    public List<Book> findBookByCategory(String code) throws RemoteException;
    public List<BookCategory> findBookCategoryByName(String name) throws RemoteException;
    public List<Book> findAllBookByTitle(String title) throws RemoteException;
    public List<Client> findAllClientByName(String name) throws RemoteException;
    public List <BookTransaction> findAllBookTransactionByClientId(String id) throws RemoteException;
}
