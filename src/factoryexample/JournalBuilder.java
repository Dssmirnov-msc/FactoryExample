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
abstract class JournalBuilder {
    protected Journal journal;
    protected int VolumeCounter = 1;
    protected int YearCurrent;
    
    public Journal getJournal() {
        return journal;
    }
    
    public void createJournal(){
        this.journal = new Journal();
    };
    
    public abstract void createJName();
    
    protected abstract void tickCounter();
    
    public void createVolume() {
        this.journal.setVolume(VolumeCounter);
        tickCounter();
    }
    public void createYear() {
        this.journal.setYear(YearCurrent);
    }

    boolean isOver() {
        return YearCurrent > 2020;
    }
}
