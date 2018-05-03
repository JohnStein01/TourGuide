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
public abstract class TourExtra implements Tour {
    protected Tour tourExtra;
    
    public TourExtra(Tour tourExtra){
      this.tourExtra = tourExtra;
   }

   public String getDescription(){
      return tourExtra.getDescription();      
   }	
   
   public int getCost(){
      return tourExtra.getCost();      
   }
   
   public int getMinTimeinMinutes(){
      return tourExtra.getMinTimeinMinutes();      
   }	
   
   public String toString(){
      return tourExtra.toString();      
   }
    
}
