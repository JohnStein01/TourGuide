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
public interface Tour {
   String getDescription();
   int getCost();
   int getMinTimeinMinutes();   
   String toString();
}
