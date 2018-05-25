
package hibernate38.manytomany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Hibernate38Manytomany {

    public static void main(String[] args) {
       
     Jobs job1 =  new Jobs("Android oyun uygulaması");
     Jobs job2 = new Jobs("CRM Projesi");
     Jobs job3 = new Jobs("Restoranduragi");
     
     
       Employee emp = new Employee("Semih","Tınaztepe");             
                emp.getJobs().add(job1);
       Employee emp1 = new Employee("Soner","Evcil");
                emp1.getJobs().add(job2);
       Employee emp2 = new Employee("Ramazan","Duman");
                emp2.getJobs().add(job3);
                
                
         SessionFactory fc  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();       
         Session s = fc.openSession();
         
         s.save(job1);
         s.save(job2);
         s.save(job3);
         
         s.save(emp);
         s.save(emp1);
         s.save(emp2);
         
         s.beginTransaction().commit();
         s.close();
    }
    
}
