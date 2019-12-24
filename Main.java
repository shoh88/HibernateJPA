/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackag;
import java.sql.SQLException;
import java.util.List;
import mypackag.faculty;
import mypackag.Factory;

/**
 *
 * @author mehri
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        //Создадим двух студентов
        faculty s1 = new faculty();
        faculty s2 = new faculty();
            //Проинициализируем их
            s1.setName("АВТФ");
            //s1.setAge(21l);
            s2.setName("РЭФ");
            //s2.setAge(24l);
            //Сохраним их в бд, id будут сгенерированы автоматически
       Factory.getInstance().getfacultyDAO().addfaculty(s1);
       Factory.getInstance().getfacultyDAO().addfaculty(s2);
       //List<faculty> studs = Factory.getInstance().getfacultyDAO();
       //for(int i = 0; i < studs.size(); ++i) 
        //   System.out.println("Имя студента : " + studs.get(i).getName() + ", Возраст : " + studs.get(i).getAge() +",  id : " + studs.get(i).getId());
    }

      
    }  
