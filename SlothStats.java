/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author sdyso
 */
public class SlothStats {
    public static void main(String[] args) {
        Sloth firstSloth = new Sloth();
        firstSloth.name = "Danny";
        firstSloth.texture = "Silky";
        firstSloth.color = "Brown and White";
       firstSloth.age = 4;
        firstSloth.speed = 6;
      firstSloth.napsTaken = 3;
        firstSloth.leavesEaten = 325;
        firstSloth.hungerLevel = 2;
        firstSloth.distanceCrawled = 3;
       
        
        
               
        System.out.println("Name of the airline: " + firstSloth.name);
        System.out.println("Sloth Texture: " + firstSloth.texture);
        System.out.println("Sloth Color: " + firstSloth.color);
        System.out.println("Naps taken today: " + firstSloth.napsTaken);
        System.out.println("Sloth Speed: " + firstSloth.speed +"mph");
        System.out.println("Leaves eaten today " + firstSloth.leavesEaten + "leaves");
        System.out.println("Sloth current hunger level:" + firstSloth.hungerLevel);
        System.out.println("Distance crawled today: " + firstSloth.distanceCrawled + "feet");
      
        
    } // close main
    
} // close class