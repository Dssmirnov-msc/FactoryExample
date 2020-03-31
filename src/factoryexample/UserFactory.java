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
public class UserFactory {

    public UserFactory() {
        
    }
    
    public User createUser(double rn){
        if (rn < 0.75){
            return new Student();
        } 
        else {
            return new Teacher();
        }
    }
    
    public ArrayList<User> createUsers(int num_of_users){
        
        ArrayList<User> UsersArray = new ArrayList<User>();
        for (int i = 0; i < num_of_users; i++) {
            double rn = Math.random();
            UsersArray.add(createUser(rn));
        }
        
        return UsersArray;
    }
}
