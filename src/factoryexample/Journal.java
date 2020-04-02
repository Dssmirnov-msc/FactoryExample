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
public class Journal {
    public String JName;
    public int volume;
    public int year;

    public String getJName() {
        return JName;
    }

    public int getYear() {
        return year;
    }

    public int getVolume() {
        return volume;
    }

    public void setJName(String JName) {
        this.JName = JName;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
