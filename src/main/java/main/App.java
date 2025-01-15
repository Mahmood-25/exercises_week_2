package main;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Hedgehog hedgehog = new Hedgehog("Pikseli", 5);
        
        while (true) {
            System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                hedgehog.speak();
            }else if(choice == 2){
                System.out.println("What is the name of the hedgehog:");
                String name = scanner.nextLine();
                hedgehog.setName(name);
                System.out.println("What is the age of the hedgehog:");
                try {
                    int age = scanner.nextInt();
                    hedgehog.setAge(age);
                } catch (Exception e) {
                    System.out.println("Wrong input value");
                    scanner.nextLine();
                }
                
            }else if(choice == 3){
                System.out.println("How many laps?");
                int laps = scanner.nextInt();
                hedgehog.run(laps);

            }else if(choice == 0){
                System.out.println("Thank you for using the program.");
                break;
            }else{
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
        
    }
}
