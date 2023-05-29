/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fullname;

import java.util.Scanner;

/**
 *
 * @author Ofentse
 */
public class Fullname {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaring variables 
        String StdFName, StdLName;
        String EmaAdres,PhoNumber;
        
        //Getting user input
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter studnet Name: ");
        StdFName = inp.next();
        System.out.println("Please enter student Surname: ");
        StdLName = inp.next();
        System.out.println("Please enter student email address: ");
        EmaAdres = inp.next();
        System.out.println("Please enter student Phone Number: ");
        PhoNumber = inp.next();
        
        //Checking validity of Phone Number
        if(PhoNumber.length() == 10);
       
            else{  
            System.out.println("You have entered the wrong phone number");        
                    }  
        } 
       
}
