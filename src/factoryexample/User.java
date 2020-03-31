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
public abstract class User {
    
    public int ID;
    public String Name;
    public String Surname;
    public String Patronim;
    
    public static int GLOBAL_ID = 0;
    
    public static ArrayList<String> NameList;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setPatronim(String Patronim) {
        this.Patronim = Patronim;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getPatronim() {
        return Patronim;
    }
    
    public abstract String getDivision();
    
    public static void generateNameList(){
        NameList = new ArrayList<String>();
        NameList.add("Иван");
        NameList.add("Денис");
        NameList.add("Павел");
        NameList.add("Олег");
    }
    
    public static String generateName(){
        
       double rn = Math.random()*NameList.size();
       
       int rni = (int) Math.floor(rn);
       if (rni==4){
           rni = 3;
       }
       return NameList.get(rni);
       
    }
    
    public static int generateID(){
        int newID = GLOBAL_ID;
        GLOBAL_ID++;
        return  newID;
    }
}



