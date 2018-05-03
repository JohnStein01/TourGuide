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
public class TourGuide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        TourTester test=new TourTester();
        System.out.println("Tour Package 1: ");
        test.Package1();
        System.out.println("Tour Package 2: ");
        test.Package2();
        System.out.println("Tour Package 3: ");
        test.Package3();
    }
    
}
