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
public class Sloth {
    public String name;
    public String texture;
    public String color;
    public int age;
    public int speed;
    public double napsTaken;
    public double leavesEaten;
    public double hungerLevel;
    public int distanceCrawled;
    
    
    
    public int totalDistanceCrawled = 0;
    
    public void slothTravel(int totalMiles) {
        totalDistanceCrawled = distanceCrawled + totalDistanceCrawled; 
    } // close method
    
    public void displayTotalDistanceCcrawled() {
        System.out.println("Total miles Flown: " + totalDistanceCrawled);
    }
}

