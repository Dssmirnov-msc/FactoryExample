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
    ArrayList<Journal> Journals;
    
    public DataManipulator() {
    }
    
    public void initialize(){
        User.generateNameList();
        Student.generateGroupNameList();
    }
    
    public void generateData(){
        
        UserFactory UF = new UserFactory();
        Users = UF.createUsers(20);
        
        JournalDataManipulator JDM = new JournalDataManipulator();
        Journals = JDM.createJournals();
    }

    private static class JournalDataManipulator {

        public JournalDataManipulator() {
            
            
        }
        
         public ArrayList<Journal> createJournals(){
            ArrayList<Journal> journals = new ArrayList<Journal>();
            
            JournalDirector JDirector = new JournalDirector();
            JDirector.setJB(new PhysicJournalBuilder());
            journals.addAll(createThematicalJournals(JDirector));
            
            JDirector.setJB(new AstronomicalJournalBuilder());
            journals.addAll(createThematicalJournals(JDirector));
            return journals;

        }
         
        private ArrayList<Journal> createThematicalJournals(JournalDirector JDirector) {
            ArrayList<Journal> ThematicalJournals = new ArrayList<Journal>(); 
            
            while(! JDirector.isJournalsIsOver() ){
                JDirector.createJournal();
                ThematicalJournals.add(JDirector.getJournal());
            }

            return ThematicalJournals;


        }
        
   
    }
}
