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
public class AudioGuide extends TourExtra {
    
   private final String Description="An audio guide by curators and hosts.";
   private final int Cost=10;
   private final int MinTime=0;

   public AudioGuide(Tour tourExtra) {
      super(tourExtra);		
   }

   @Override
   public String getDescription(){       
      return Description;
    }  
   
   @Override
    public int getCost() {
        return Cost;
    }

    @Override
    public int getMinTimeinMinutes() {
        return MinTime;
    }    
    
    @Override
    public String toString() {       
        return tourExtra.toString()+"\n"+"Audio Guide:"+getDescription()+" Min Time:"+getMinTimeinMinutes()+" minutes. Cost $"+getCost();
    }      
   
}
    

