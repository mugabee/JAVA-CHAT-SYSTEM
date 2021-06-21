/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import model.Book;
import model.BookCategory;
import model.Client;
import services.ILibrary;
import services.ILibraryImpl;

/**
 *
 * @author Kaneza
 */
public class RMIClient {
    public static void main(String[] args)  {
        Registry registry;
        try {
            registry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            System.out.println("connected");
            ILibrary library = (ILibrary) registry.lookup("LibraryService");
            System.out.println("ok");
            library.createBookCategory(new BookCategory("10", "RMI"));
            System.out.println("ok2");
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
    
}
