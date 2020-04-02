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
public class PhysicJournalBuilder extends JournalBuilder{
    
    
    private final int YearBegin = 1964;

    public PhysicJournalBuilder() {
        YearCurrent = YearBegin;
    }
    
    @Override
    public void createJName() {
        this.journal.setJName("Юные физики и инженеры");
    }

    

    protected void tickCounter() {
        this.VolumeCounter++;
        if (this.VolumeCounter > 12){
            this.VolumeCounter = 1;
            YearCurrent++;
        }
    }
    
}
