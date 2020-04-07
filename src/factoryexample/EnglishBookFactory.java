/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryexample;

/**
 *
 * @author Dmitry
 */
public class EnglishBookFactory implements BookFactory{

    @Override
    public Textbook createTextbook() {
        return new EnglishTextbook();
    }

    @Override
    public Fiction createFiction() {
        return new EnglishFiction();
    }
    
}
