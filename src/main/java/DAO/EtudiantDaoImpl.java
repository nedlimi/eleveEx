/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Etudiant;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nuguru
 */
@Repository
public class EtudiantDaoImpl implements etudiantDao {

    @Autowired
	private SessionFactory factory;
        Transaction tx=null; 
    //Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
	Session session;
        
	@Override
	public void add(Etudiant student) {
		session = HibernateUtil.getSessionFactory().openSession();
                try{
          tx= session.beginTransaction();
          session.save(student); //// il faut utiliser just Save sinon qd il existe il va essayer de le modifier !
//          sf.save(u);
          tx.commit();
        }
        catch(Exception e)
        {
            tx.rollback();
            e.printStackTrace();
        }finally {
         session.close(); 
      }
	}

	@Override
	public void edit(Etudiant student) {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	@Override
	public void delete(String studentId) {		
                session = HibernateUtil.getSessionFactory().openSession();	}

	@Override
	public Etudiant getStudent(String studentId) {
            session = HibernateUtil.getSessionFactory().openSession();
		return (Etudiant)session.get(Etudiant.class, studentId);
	}

	@Override
	public List<Etudiant> getAllStudent() {
          
                session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Etudiant").list();
      } 
        public void init(){
		System.out.println("hibernate framework !! ");
	}
       
        }

    

