/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.Dao1;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Book;
import model.BookCategory;
import model.BookTransaction;
import model.Client;
import model.TransactionType;
import services.ILibrary;
import services.ILibraryImpl;

/**
 *
 * @author Kaneza
 */
public class Operation extends javax.swing.JInternalFrame {

//    Dao dao = new Dao(Client.class);
//    Dao dao1 = new Dao(Book.class);
//    Dao dao2 = new Dao(BookCategory.class);
//    Dao dao3 = new Dao(BookTransaction.class);
    Dao1 dao4 = new Dao1();
    ILibrary library = new ILibraryImpl();

    /**
     * Creates new form Operation
     */
    public Operation() {
        initComponents();
        comb();
        Display1();
    }
    
    public void comb() {
        client.removeAllItems();
        book.removeAllItems();
        trans.removeAllItems();
//        se.removeAllItems();
        List<Client> list = library.findAllClient();
        List<Book> list1 = library.findAllBook();
        for (Client cl : list) {
            client.addItem(cl.getFirstName() + "  " + cl.getLastName());
        }
        for (Book bk : list1) {
            if (bk.isAvailable()) {
                book.addItem(bk.getTitle());
            }
        }
        trans.setModel(new DefaultComboBoxModel(TransactionType.values()));
    }

    public void comb1() {
        book.removeAllItems();
        List<Book> list1 = library.findAllBook();
        for (Book bk : list1) {
            if (bk.isAvailable() == false) {
                book.addItem(bk.getTitle());
            }
        }
    }

    public String separate(String name) {
        String[] words = name.split("\\s");
        for (String w : words) {
            return w;
        }
        return null;
    }
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        client = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        book = new javax.swing.JComboBox();
        trans = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        print = new javax.swing.JButton();
        excel = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tables = new javax.swing.JTable();
        s = new javax.swing.JTextField();
        se = new javax.swing.JComboBox();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("Client Name");

        jLabel2.setText("Book Name");

        jLabel3.setText("Transaction type");

        jLabel4.setText("Transaction date");

        jLabel5.setText("Return date");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        excel.setText("Excell");
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(trans, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(print))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(excel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reset)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(update)
                    .addComponent(print))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excel)
                    .addComponent(reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client", "Book", "Transaction", "Transaction Date", "Return Date"
            }
        ));
        tables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tables);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        s.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sKeyReleased(evt);
            }
        });

        se.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Client Id", "Client Name", "Book", "Book category", "Date" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(se, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(se, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BookTransaction book = send();
        library.createBookTransaction(book);
        Display1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) tables.getModel();
            int select = tables.getSelectedRow();
            String code = (String) model.getValueAt(select, 0);
            //Client c = (Client) dao.find(code);
            //String name =c.getFirstName()+ "  "+c.getLastName();
            client.setSelectedItem(code);
            String id = (String) model.getValueAt(select, 1);
            trans.setSelectedItem(model.getValueAt(select, 2));
            TransactionType t = (TransactionType) model.getValueAt(select, 2);
            java.util.Date date = new SimpleDateFormat("yyy-MM-dd").parse((String) model.getValueAt(select, 3));
            jDateChooser1.setDate(date);
            if (t == TransactionType.RETURN) {
                java.util.Date dat = new SimpleDateFormat("yyy-MM-dd").parse((String) model.getValueAt(select, 4));
                jDateChooser2.setDate(dat);
            } else {
                comb1();
                jDateChooser2.setCalendar(null);
            }
            //Book b = (Book) dao1.find(id);
            //String title = b.getTitle();
            book.setSelectedItem(id);

        } catch (ParseException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablesMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        BookTransaction book = send();
        library.updateBookTransaction(book);
        Display1();
    }//GEN-LAST:event_updateActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("printing in progress");
        MessageFormat footer = new MessageFormat("page(0,number,integer)");
        try {
            tables.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
        DefaultTableModel model = (DefaultTableModel) tables.getModel();
        Excel x = new Excel();
        JFileChooser f = new JFileChooser("C:\\Users\\Kaneza\\Desktop\\java program");
        f.showOpenDialog(null);
        File file = f.getSelectedFile();
        String path = file.getAbsolutePath();
        try {
            x.exportToExcel(tables, path);
            JOptionPane.showMessageDialog(null, "done");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_excelActionPerformed

    private void sKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sKeyReleased
        String Search= s.getText();
       String SearchBy=se.getSelectedItem().toString();
       DefaultTableModel model = (DefaultTableModel) tables.getModel();
       
       //Client Id, Client Name, Book, Book category, Date
       switch(SearchBy){
           case "Client Id":
//               Clientclientdao.findById(Search);
               List<BookTransaction> result= library.findAllBookTransactionByClientId(Search);
               model.setRowCount(0);
               for(BookTransaction bk : result){
                    model.insertRow(model.getRowCount(), new Object[]{
                bk.getRegId().getFirstName() + "  " + bk.getRegId().getLastName(),
                bk.getBookId().getTitle(),
                bk.getType(),
                bk.getTransactionDate(),
                bk.getReturnDate()
                    });
                }
                break;
           case "Client Name":
              String[] clientname= Search.split(" ");
              System.out.println(clientname[0]);
              List<BookTransaction> tra = library.findAllBookTransaction();
              List<Client> client=  library.findAllClientByName(Search);
              model.setRowCount(0);
              for(Client cl : client){
                  //System.out.println("client Id "+cl.getRegId()+" "+cl.getFirtName());
                    for(BookTransaction bk : tra){
                        //System.out.println("Book Id"+trans.getRegId());
                        String cli=cl.getRegNo();
                        Client bok =bk.getRegId();
                        System.out.println( cli+" equals "+bok.getRegNo());
                        if(cli.equals(bok.getRegNo())){
                            //System.out.println( cl.getRegId()+" equals "+trans.getRegId());
                            model.insertRow(model.getRowCount(), new Object[]{
                                bk.getRegId().getFirstName() + "  " + bk.getRegId().getLastName(),
                bk.getBookId().getTitle(),
                bk.getType(),
                bk.getTransactionDate(),
                bk.getReturnDate()
                            });
                        }
                }
                }
                break;
           case "Book":
               List<Book> bo =  library.findAllBookByTitle(Search);
               List<BookTransaction> tra2 = library.findAllBookTransaction();
               model.setRowCount(0);
               if(bo!=null){
                   for(Book b:bo){
                       for(BookTransaction bk : tra2){
                        if(bk.getBookId().getBookId().equals(b.getBookId())){
                             model.insertRow(model.getRowCount(), new Object[]{
                                bk.getRegId().getFirstName() + "  " + bk.getRegId().getLastName(),
                bk.getBookId().getTitle(),
                bk.getType(),
                bk.getTransactionDate(),
                bk.getReturnDate()
                            });
                        }
                    }
                   }
               }
                break;
           case "Book category":
              List<BookCategory> cat = library.findBookCategoryByName(Search);
              List<BookTransaction> tra3 = library.findAllBookTransaction();
              model.setRowCount(0);
              for(BookCategory c:cat){
                  List<Book> boo =  library.findBookByCategory(c.getCode());
                  for(Book b:boo){
                      for(BookTransaction bk : tra3){
                        if(bk.getBookId().getBookId().equals(b.getBookId())){
                             model.insertRow(model.getRowCount(), new Object[]{
                                bk.getRegId().getFirstName() + "  " + bk.getRegId().getLastName(),
                bk.getBookId().getTitle(),
                bk.getType(),
                bk.getTransactionDate(),
                bk.getReturnDate()
                            });
                        }
                    }
                  }
              }
               break;
////           case "Date":
////               List<BookTransaction> trad = transdao.findByDate(Search);
////                model.setRowCount(0);
////                 for(BookTransaction trans : trad){
////                      model.insertRow(model.getRowCount(), new Object[]{
////                          trans.getRegId(),
////                          trans.getBookId(),
////                          trans.getTransactionDate(),
////                          trans.getReturnDate()
////                      });
////                  }
           default:
               break;
       }
    }//GEN-LAST:event_sKeyReleased

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Display1();
    }//GEN-LAST:event_resetActionPerformed
    public BookTransaction send() {
        String name = (String) client.getSelectedItem();
        String se = separate(name);
        Client c = library.findClientByName(se);
        String id = c.getRegNo();
        Client client = new Client(id);
        String ti = (String) book.getSelectedItem();
        Book b = library.findBookByTitle(ti);
        String code = b.getBookId();
        Book book = new Book(code);
        TransactionType t = (TransactionType) trans.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        if (t == TransactionType.BORROW) {
            String bor = sdf.format(jDateChooser1.getDate());
            String ret = null;
            boolean bull = false;
            Book bb = new Book(code, b.getTitle(), b.getPublishingHouse(), b.getDateOfPublication(), b.getAuthor(), b.getPages(), bull, b.getCategory());
            library.updateBook(bb);
            BookTransaction trans = new BookTransaction(client, book, bor, ret, t);
            return trans;
        } else {
            String bor = sdf.format(jDateChooser1.getDate());
            String ret = sdf.format(jDateChooser2.getDate());
            boolean bull = true;
            Book bb = new Book(code, b.getTitle(), b.getPublishingHouse(), b.getDateOfPublication(), b.getAuthor(), b.getPages(), bull, b.getCategory());
            library.updateBook(bb);
            BookTransaction trans = new BookTransaction(client, book, bor, ret, t);
            return trans;
        }
    }

    public void Display1() {
        List<BookTransaction> list = library.findAllBookTransaction();
        DefaultTableModel model = (DefaultTableModel) tables.getModel();
        model.getDataVector().removeAllElements();
        for (BookTransaction bk : list) {
            model.insertRow(model.getRowCount(), new Object[]{
                bk.getRegId().getFirstName() + "  " + bk.getRegId().getLastName(),
                bk.getBookId().getTitle(),
                bk.getType(),
                bk.getTransactionDate(),
                bk.getReturnDate()
            });
        }
        comb();
        clean();
    }

    public void clean() {
        client.setSelectedItem(null);
        book.setSelectedItem(null);
        trans.setSelectedItem(null);
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox book;
    private javax.swing.JComboBox client;
    private javax.swing.JButton excel;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print;
    private javax.swing.JButton reset;
    private javax.swing.JTextField s;
    private javax.swing.JComboBox se;
    private javax.swing.JTable tables;
    private javax.swing.JComboBox trans;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
