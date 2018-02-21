/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemachine;
import java.util.Scanner;
/**
 *Compares user age with celebrity
 * @author sdyso05
 */
public class DateMachine {
    public static final int DEL_TORO_BIRTHYEAR = 1967;
    
    
   public static void main(String[] args){
        int userBirthYear = 0;
        System.out.println("What year were you born in? (Enter Integer)");
        Scanner userInputMachine = new Scanner(System.in);  
        userBirthYear = userInputMachine.nextInt();
        if(userBirthYear < DEL_TORO_BIRTHYEAR){
            System.out.println("You are older than Benicio del Toro");
        } else { 
            System.out.println("You are younger than Benicio del Toro");
  
            // close case
        }
        
       
        
   } // close main
    
} // close class
