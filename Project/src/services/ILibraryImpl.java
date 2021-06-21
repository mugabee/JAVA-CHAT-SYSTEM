/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Dao.Dao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Book;
import model.BookCategory;
import model.BookTransaction;
import model.Client;

/**
 *
 * @author Kaneza
 */
public class ILibraryImpl extends UnicastRemoteObject implements ILibrary{

    public ILibraryImpl() throws RemoteException {
    }
    
    
    Dao Bookcatdao = new Dao(BookCategory.class);
    Dao Bookdao = new Dao(Book.class);
    Dao Clientdao = new Dao(Client.class);
    Dao BookTransactiondao = new Dao(BookTransaction.class);

    @Override
    public List<BookCategory> findAllBookCategory() throws RemoteException{
      List <BookCategory> list = Bookcatdao.all();
      return list;
    }

    @Override
    public List<Book> findAllBook() throws RemoteException{
        List <Book> list = Bookdao.all();
        return list;
                
    }

    @Override
    public void createBookCategory(BookCategory category) throws RemoteException {
      Bookcatdao.create(category);
    }

    @Override
    public void updateBookCategory(BookCategory category) throws RemoteException{
        Bookcatdao.updat(category);
    }

    @Override
    public void deleteBookCategory(BookCategory category) throws RemoteException {
       Bookcatdao.dele(category);
    }

    @Override
    public void createBook(Book book) throws RemoteException{
        Bookdao.create(book);
    }

    @Override
    public void updateBook(Book book) throws RemoteException{
       Bookdao.updat(book);
    }

    @Override
    public void deleteBook(Book book) throws RemoteException {
        Bookdao.dele(book);
    }

    @Override
    public BookCategory findBookCategory(String id) throws RemoteException {
        BookCategory bookCat =  (BookCategory) Bookcatdao.finds(id);
        return bookCat;
    }

    @Override
    public void createClient(Client client) throws RemoteException {
       Clientdao.create(client);
    }

    @Override
    public void updateClient(Client client) throws RemoteException{
        Clientdao.updat(client);
    }

    @Override
    public void deleteClient(Client client) throws RemoteException {
        Clientdao.dele(client);
    }

    @Override
    public List<Client> findAllClient() throws RemoteException{
       List <Client> list = Clientdao.all();
       return list;
    }

    @Override
    public void createBookTransaction(BookTransaction transaction) throws RemoteException {
       BookTransactiondao.create(transaction);
    }

    @Override
    public void updateBookTransaction(BookTransaction transaction) throws RemoteException {
       BookTransactiondao.updat(transaction);
    }

    @Override
    public void deleteBookTransaction(BookTransaction transaction) throws RemoteException {
        BookTransactiondao.dele(transaction);
    }

    @Override
    public List<BookTransaction> findAllBookTransaction() throws RemoteException {
        List <BookTransaction> list = BookTransactiondao.all();
       return list;
    }

    @Override
    public Book findBookByTitle(String title) throws RemoteException {
        Book book = (Book) Bookdao.findByTitle(title);
        return book;
    }

    @Override
    public Client findClientByName(String name) throws RemoteException {
       Client client = (Client) Clientdao.findByFirstName(name);
       return client;
    }

    @Override
    public List<Book> findBookByCategory(String code) throws RemoteException  {
        List<Book> list =  Bookdao.findByCategory(code);
        return list;
    }

    @Override
    public List<BookCategory> findBookCategoryByName(String name) throws RemoteException {
      List<BookCategory> list = Bookcatdao.findss(name);
      return list;
    }

    @Override
    public List<Book> findAllBookByTitle(String title) throws RemoteException {
        List<Book> list = Bookdao.findByTitles(title);
      return list;
    }

    @Override
    public List<Client> findAllClientByName(String name) throws RemoteException {
        List<Client> list=  Clientdao.findByName(name);
        return list;
    }

    @Override
    public List<BookTransaction> findAllBookTransactionByClientId(String id) throws RemoteException {
       List<BookTransaction> list= Clientdao.findByClientId(id);
       return list;
    }


    
    
}
