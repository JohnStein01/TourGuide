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
public class GlamourTour extends TourExtra {
    
   private final String Description="A tour of glamorous period costumes.";
   private final int Cost=45;
   private final int MinTime=90;

   public GlamourTour(Tour tourExtra) {
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
        return tourExtra.toString()+"\n"+"Glamour Tour:"+getDescription()+" Min Time:"+getMinTimeinMinutes()+" minutes. Cost $"+getCost();
    }      
   
}
    
