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
public class TourTester {
    
    void Package1(){
    Tour package1=new AudioGuide(new SelfGuidedTour());        
    System.out.println(package1.toString()+"\n");
    }
    
    void Package2(){
    Tour package2=new RooftopTour(new GuidedTour());  
    TourExtra package2extended=new EstateTour(new GuidedTour());  
    System.out.println(package2.toString()+"\n"+"Estate Tour:"+package2extended.getDescription()+" Min Time:"+package2extended.getMinTimeinMinutes()+" minutes. Cost:"+" $"+package2extended.getCost()+"\n");
    }
    
    void Package3(){
    Tour package3=new PremiumTour(new GuidedTour()); 
    TourExtra package3Glamour=new GlamourTour(new GuidedTour()); 
    TourExtra package3Estate=new EstateTour(new GuidedTour());    
    System.out.println(package3.toString()+"\n"+
            "Glamour Tour:"+ package3Glamour.getDescription()+" Min Time:"+ package3Glamour.getMinTimeinMinutes()+" minutes. Cost: $"+ package3Glamour.getCost()+"\n"
    +"Estate Tour:"+package3Estate.getDescription()+" Min Time:"+package3Estate.getMinTimeinMinutes()+" minutes. Cost: $"+package3Estate.getCost()
    );
    }
    
}
