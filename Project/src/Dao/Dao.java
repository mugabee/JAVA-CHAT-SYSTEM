/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Kaneza
 */
public class Dao<X> {
    Class <X> type;

    public Dao(Class<X> type) {
        this.type = type;
    }
    public void create(X obj){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(obj);
        ss.getTransaction().commit();
        ss.close();
    }
    public void updat(X obj){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(obj);
        ss.getTransaction().commit();
        ss.close();
    }
    public void dele(X obj){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(obj);
        ss.getTransaction().commit();
        ss.close();
    }
    public List<X> all(){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        List<X> list= ss.createQuery("from " + type.getName()).list();
        ss.close();
        return list;
    }
    public X find(String id){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        X x = (X) ss.get(type, id);
        ss.close();
        return x;
    }
    public X finds(String name){
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Query query= ss.
        createQuery("from "+ type.getName()+" where name=:name");
        query.setParameter("name", name);
        X x = (X) query.uniqueResult();
        ss.close();
        return x;
    }
     public X findByFirstName(String firstName){
         Session ss= HibernateUtil.getSessionFactory().openSession();
        Query query= ss.
        createQuery("from "+ type.getName()+" where firstName=:firstName");
        query.setParameter("firstName", firstName);
        X x = (X) query.uniqueResult();
        ss.close();
        return x;
    }
      public X findByTitle(String name){
          Session ss= HibernateUtil.getSessionFactory().openSession();
        Query query= ss.
        createQuery("from "+ type.getName()+" where title=:name");
        query.setParameter("name", name);
        X x = (X) query.uniqueResult();
        ss.close();
        return x;
    }
      
      
      
      
      
      
    public List<X> findss(String name){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query= ss.createQuery("from "+ type.getName()+" where name LIKE :name");
        query.setParameter("name",'%'+name+'%');
        List<X>  x = query.list();
        ss.close();
        return x;
    }
    public List<X> available(){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query= ss.createQuery("from "+ type.getName()+" where availabe=:avialable");
        query.setParameter("avialable", true);
        List<X> x = query.list();
        ss.close();
        return x;
    }
    public X findByNames(String[] names){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query= ss.createQuery("from "+ type.getName()+" where firstName=:firstname and lastName=:lastname");
        query.setParameter("firstname", names[0]);
        query.setParameter("lastname", names[1]);
        X x = (X) query.uniqueResult();
        ss.close();
        return x;
    }
    
    public List<X> findByName(String name){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query= ss.createQuery("from "+ type.getName()+" where (name LIKE :name and lastName LIKE :name) or (name LIKE :name or lastName LIKE :name)");
        query.setParameter("name",'%'+name+'%');
        List<X> x = query.list();
        ss.close();
        return x;
    }
    public List<X> findByClientId(String id){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query= ss.createQuery("from "+ type.getName()+" where regId_regNo=:id");
        query.setParameter("id", id);
        List<X> x = query.list();
        ss.close();
        return x;
    }
    // this function is still in develpement do not use it before it is done 
    public List<X> findByCategory(String category){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query= ss.createQuery("from "+ type.getName()+" where categoryId=:category");
        query.setParameter("category", category);
        List<X> x = query.list();
        ss.close();
        return x;
    }
    
    
    public X findByTitless(String title){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query= ss.createQuery("from "+ type.getName()+" where title LIKE:title");
        query.setParameter("title",'%'+title+'%');
        X x = (X) query.uniqueResult();
        ss.close();
        return x;
    }
    
    public List<X> findByTitles(String title){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query query= ss.createQuery("from "+ type.getName()+" where title LIKE:title");
        query.setParameter("title",'%'+title+'%');
        List<X> x = query.list();
        ss.close();
        return x;
    }
    
//    public List<X> findByDate(Date date){
//        Session ss = HibernateUtil.getSessionFactory().openSession();
//        Query query= ss.createQuery("from "+ type.getName()+" where transactionDate=:date or returnDate=:date");
//        query.setParameter("date",date);
//        List<X> x = query.list();
//        ss.close();
//        return x;
//    }
}
