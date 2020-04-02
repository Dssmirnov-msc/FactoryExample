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
public class AstronomicalJournalBuilder extends JournalBuilder{
    private final int YearBegin = 1988;

    public AstronomicalJournalBuilder() {
        YearCurrent = YearBegin;
    }
    
    
    
    @Override
    public void createJName() {
        this.journal.setJName("Сквозь тернии к звездам");
    }

    @Override
    public void createVolume() {
        this.journal.setVolume(VolumeCounter);
        tickCounter();
    }

    @Override
    public void createYear() {
        this.journal.setYear(YearCurrent);
    }

    @Override
    protected void tickCounter() {
         this.VolumeCounter++;
        if (this.VolumeCounter > 4){
            this.VolumeCounter = 1;
            YearCurrent++;
        }
    }
    
}
