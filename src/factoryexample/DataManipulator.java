/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryexample;

import java.util.ArrayList;

/**
 *
 * @author Dmitry
 */
public class DataManipulator {
    
    ArrayList<User> Users;
    ArrayList<Book> Books;
    ArrayList<Record> Records;
    
    public DataManipulator() {
    }
    
    public void initialize(){
        User.generateNameList();
        Student.generateGroupNameList();
    }
    
    public void generateData(){
        
        UserFactory UF = new UserFactory();
        Users = UF.createUsers(20);
        
    }
}
