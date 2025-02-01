/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024347;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Git_2024347 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myKB = new Scanner(System.in); // creates a Scanner
        String name; // creates a variable (name)

       
        while (true) { // loops until the user enters a valid text with no numbers
            System.out.print("Please enter your name: "); // prompts the user for input
            name = myKB.nextLine(); // reads input from user and assigns it to variable (name)

           
            if (name.matches("[0-9]+")) {  // checks if the input contains any numbers
                System.out.println("Your name must contain letters only. Please try again."); // outputs error message incase it does contains numbers
            } else {
                break; // exits loop if the input is vali d
            }
        }

        // the next part of the project transforms the name
     String upperCaseName = name.toUpperCase(); // converts the name to uppercase
     String modifiedName = name.substring(1) + name.charAt(0); // moves the first letter to the end of the name. 

        // outputs the original and transformed names
      System.out.println("Your name is: " + name); // outputs the original name 
      System.out.println("If converted to Uppercase it becomes: " + upperCaseName); // outputs the name in uppercase
      System.out.println("If we move things around a little bit it becomes: " + modifiedName); // outputs the name after its modified
      
            }
    
}
