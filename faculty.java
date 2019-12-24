/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackag;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author mehri
 */
 @Entity
 @Table(name="faculty")
public class faculty {
   
   
    int    id;
    @Column(name="namefaculty")
    String name;
   

    public faculty() {name=null;}
    public faculty(faculty s) {name=s.getName();}
    

    public faculty(int id, String name) {
        super();
        this.id = id;
        this.name = name;
        
    }
  @Id
  @GeneratedValue(generator="increment")
  @GenericGenerator(name="increment", strategy = "increment")
  @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
    @Column(name="namefaculty")
    public String getName() {
        return name;
    }

    public void setName(String s) {
        this.name = s;
    }
    
   
    public String toString() {
        return "facukty {id = " + String.valueOf(id) + ", namefaculty = '" + name + "'}";
    }
    
}

    

