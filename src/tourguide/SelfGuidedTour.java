/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourguide;

/**
 *
 * @author asus
 */
public class SelfGuidedTour implements Tour{
    
    private final String Description="A 90 minute self-guided tour of the mansion";
    private final int Cost=55;
    private final int MinTime=90;
  
    @Override
    public int getCost() {
        return Cost;
    }

    @Override
    public int getMinTimeinMinutes() {
        return MinTime;
    }

    @Override
    public String getDescription() {
        return Description;
    }
    
    @Override
    public String toString() {       
        return "Self-Guided Tour:"+getDescription()+" Min Time:"+getMinTimeinMinutes()+" minutes. Cost $"+getCost();
    }      
    
}
