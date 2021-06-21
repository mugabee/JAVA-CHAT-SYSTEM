/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import java.util.List;
import model.BookTransaction;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Kaneza
 */
public class Dao1 {
    public List<BookTransaction> all(String id){  
        Session ss= HibernateUtil.getSessionFactory().openSession();
        List<BookTransaction> list= ss.createQuery("select returnDate,transactionDate,type,regId,bookId"+" from BookTransaction"+" where type = id").list();
        //List<BookTransaction> list= ss.createQuery("select b from BookTransaction b where b.type = id").list();
        ss.close();
        return list;
    }
//    public X find(String id){
//        Session ss= HibernateUtil.getSessionFactory().openSession();
//        X x = (X) ss.get(type, id);
//        ss.close();
//        return x;
//    }
//    public X finds(String firstName){
//        Query query= HibernateUtil.getSessionFactory().openSession().
//        createQuery("from "+ type.getName()+" where firstName=:firstName");
//        query.setParameter("firstName", firstName);
//        X x = (X) query.uniqueResult();
//        return x;
//    }
    public List<BookTransaction> findByName(String name){
        List<BookTransaction> list=null;
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction trans=ss.beginTransaction();
        try {
        Criteria cr=ss.createCriteria(BookTransaction.class);
            cr.add(Restrictions.like("type", "%" +name+"%"));
            list=cr.list();
        } catch (Exception e) {
        }
        finally{
            ss.close();
        }
        return list;
    }
}
