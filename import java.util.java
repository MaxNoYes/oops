//Obejct Oriented 

import java.util.Scanner;

class input_output{
    public static void main(String args[]){
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + " welcome to durham college");
        if (age < 25) {
            System.out.println("your future is bright at " + age + " years old.");
        }
        else if (age < 45 && age > 25) {
            System.out.println("Your age is : " + age + " you still got time.");
        }
        else if (age > 46 && age < 60) {
            System.out.println("You're getting up there might wanna hurry up you're " + age);
        }
        else if (age > 60) {
            System.out.println("Might as well go home and take a nap you're " + age);
        }
        else if (age < 65); {
            int retirement_age = (65 - age);
            System.out.println("Also by the way you have " + retirement_age + " years left till retirement, hang in there!");
        }
        scanner.close();
        
    }
}