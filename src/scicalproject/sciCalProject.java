
package scicalproject;

import java.util.Scanner;


public class sciCalProject {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a username: ");
        
        String name = userInput.nextLine();
        System.out.println("Hello, " + name + ", have a nice day!");
        
        System.out.println("Please select a function: ");
        System.out.println("1 = graphing, 2 = system of linear equations, 3 = matrices");
        
        int functionResponse = userInput.nextInt();
        
        switch(functionResponse)
        {
            case (1):
               System.out.println("Still under maintenance");
               break;
            case 2:
               System.out.println("Still under maintenance");  
               break;
            case 3:
               System.out.println("Still under maintenance");
               break;
            case 4:
				System.out.println("Still under maintenance");
        }   
    }
    
}