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
public class Teacher extends User{
    public String Department;

    @Override
    public String getDivision() {
        return Department;
    }
}
