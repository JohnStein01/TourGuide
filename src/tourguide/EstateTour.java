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
public class EstateTour extends TourExtra {
    
   private final String Description="A trolley tour of the estate grounds.";
   private final int Cost=20;
   private final int MinTime=60;

   public EstateTour(Tour tourExtra) {
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
        return tourExtra.toString()+"\n"+"Estate Tour:"+getDescription()+" Min Time:"+getMinTimeinMinutes()+" minutes. Cost $"+getCost();
    }      
   
}
    