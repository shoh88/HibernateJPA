/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackag;
import mypackag.facultyDAOImp;

/**
 *
 * @author mehri
 */
public class Factory {
    private static facultyDAO facultyDAO = null;
    private static Factory instance = null;
    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }
    public facultyDAO getfacultyDAO(){
        if (facultyDAO == null){
                facultyDAO = new facultyDAOImp();//facultyDAOImpl();
    }
    return facultyDAO;
    }
    
    
}
