/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackag;

import java.sql.SQLException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import mypackag.HibernateUtil;
import mypackag.facultyDAO;
import mypackag.faculty;

/**
 *
 * @author mehri
 */
public class facultyDAOImp implements facultyDAO  {
    
    public void addfaculty(faculty fac) throws SQLException{Session session=null;
   
        try {session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(fac);
            session.getTransaction().commit();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", 
     JOptionPane.OK_OPTION);
        } finally {
        if (session != null && session.isOpen()) {session.close(); } 
       }
    }
}
       /*  public void updatefaculty(faculty fac) throws SQLException{
      //public void updatefaculty(faculty fac) throws SQLException {
          Session session = null;
          try {
              session = HibernateUtil.getSessionFactory().openSession();
              session.beginTransaction();
              session.update(fac);
              session.getTransaction().commit();
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
          } finally {
          if (session != null && session.isOpen()) {    session.close();   }
      }
      }
   /*public faculty getStudentById(Long id) throws SQLException {
     Session session = null;
     faculty fac = null;
      try {
     session = HibernateUtil.getSessionFactory().openSession();
     fac = (faculty) session.load(faculty.class, id);
 } catch (Exception e) {
     JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
 } finally {
     if (session != null && session.isOpen()) {      session.close();     }
 }
 return stud;
 }
*/
    
    

