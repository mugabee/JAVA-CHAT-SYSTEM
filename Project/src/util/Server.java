/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.ILibraryImpl;

/**
 *
 * @author Kaneza
 */
public class Server {
    public static void main(String[] args) { 
        try {
            Registry registry = LocateRegistry.createRegistry(6000);
            registry.rebind("LibraryService",  new ILibraryImpl());
            System.out.println("Server Started...");
        } catch (RemoteException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);

          //  ex.printStackTrace();
        }
            
    }
    
}
