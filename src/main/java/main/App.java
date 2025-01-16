package main;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        // Create new hedgehog
        Hedgehog hedgehog = new Hedgehog("Pikseli", 5);
        
        while (true) {
            System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
            String choice = scanner.nextLine();
            
            
            if(choice.equals("1")){
                System.out.println("What does hedgehog say?");
                String userInput = scanner.nextLine();
                hedgehog.speak(userInput);
            }else if(choice.equals("2")){
                System.out.println("What is the name of the hedgehog:");
                String name = scanner.nextLine();
                hedgehog.setName(name);
                System.out.println("What is the age of the hedgehog:");
                // error handling
                try {
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    hedgehog.setAge(age);
                } catch (Exception e) {
                    System.out.println("Wrong input value");
                    scanner.nextLine();
                }
                
            }else if(choice.equals("3")){
                System.out.println("How many laps?");
                int laps = scanner.nextInt();
                scanner.nextLine();
                hedgehog.run(laps);

            }else if(choice.equals("0")){
                System.out.println("Thank you for using the program.");
                break;
            }else{
                System.out.println("Wrong input value");
            }
        }
        scanner.close();
        
    }
}
