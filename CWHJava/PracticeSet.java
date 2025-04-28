package CWHJava;

import java.util.*;

public class PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       //Display chapter options first
       System.out.println("Choose a chapter: ");
        System.out.println("1. Chapter 1 - Practice Set ");
        System.out.println("2. Chapter 2 - Practice Set ");

        int chapterChoice = sc.nextInt();
        sc.nextLine(); //Consume newline

        switch (chapterChoice) {
            case 1:
                //Chapter 1 options
                System.out.println("\nChapter 1 - Practice set ");


        

        System.out.println("Choose an option from the following:");
        System.out.println("1. Sum three numbers");
        System.out.println("2. Calculate CGPA using marks of 3 subjects");
        System.out.println("3. Greet user by name");
        System.out.println("4. Convert Kilometers into miles");
        System.out.println("5. Detect if a number is an integer");

        int choice1 = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice1) {
            case 1:
                // Sum three numbers
                // Ask the user to enter three numbers
                System.out.println("Enter value1: ");
                double a = sc.nextDouble();
                System.out.println("Enter value2: ");
                double b = sc.nextDouble();
                System.out.println("Enter value3: ");
                double c = sc.nextDouble();
                
                // Calculate the sum
                double sum = a + b + c;
                
                // Display the result
                System.out.println("The Sum is: " + sum);
                break;

            case 2:
                // Calculate CGPA using marks of 3 subjects
                // Ask the user to enter marks for three subjects
                System.out.println("Enter marks of sub1: ");
                float sub1 = sc.nextFloat();
                System.out.println("Enter marks of sub2: ");
                float sub2 = sc.nextFloat();
                System.out.println("Enter marks of sub3: ");
                float sub3 = sc.nextFloat();
                
                // Calculate average percentage and CGPA
                float averagePercentage = (sub1 + sub2 + sub3) / 3;
                float cgpa = averagePercentage / 9.5f;
                
                // Display the result
                System.out.printf("Your CGPA is: %.2f", cgpa);
                break;

            case 3:
                // Greet user by name
                // Ask the user to enter their name
                System.out.println("Enter your Name: ");
                String name = sc.nextLine();
                
                // Display greeting
                System.out.println("Hello " + name + ", have a good day.");
                break;

            case 4:
                // Convert Kilometers into miles
                // Ask the user to enter distance in kilometers
                System.out.println("Enter distance in Kilometers: ");
                double kilometers = sc.nextDouble();
                
                // Convert kilometers to miles
                double miles = kilometers * 0.62;
                
                // Display the result
                System.out.printf("%.2f kilometers is equal to %.2f miles", kilometers, miles);
                break;

            case 5:
                // Detect if a number is an integer
                // Ask the user to enter a number
                System.out.println("Enter a Number: ");
                
                // Check if the number is an integer
                if (sc.hasNextInt()) {
                    int num = sc.nextInt();
                    System.out.println("The entered number is an integer!");
                } else {
                    System.out.println("The entered number is not an integer!");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
            
        }

       break; //Chapter 1 break
        
         case 2:
             //Chapter 2 options
        System.out.println("\nChapter 2 - Practice set ");
        System.out.println("Choose option from the following: ");
        System.out.println("1.What will be the result of the following expression Float a = 7/4 * 9/2");

        int choice2 =sc.nextInt();
        sc.nextLine();

        switch (choice2) {
            case 1:
                  //What will be the result of the following expression Float a = 7/4 * 9/2
                   float a =7/4.0f * 9/2.0f;
                   System.out.println("\nResult: a = 7/4  * 9/2 = " +a );
                   System.out.println("Integer division result: " +(7/4 * 9/2));
                break;
            case 2:
                   //wap    

        
            default:
            System.out.println("Invalid choice for Chapter 2. ");
                break;
        }
        break; //Chapter 2 break



        default:
            System.out.println("Invalid Chapter choice. please select a valid chapter. ");
            break;
    }
     
    
    // Close the scanner
       sc.close();
    }
}


