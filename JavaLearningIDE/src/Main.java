import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Hello World
        System.out.printf("Hello and welcome!");


        // Primitive Data Types
        System.out.println("Primitive Data Types");
        int age = 12;
        double percentage = 50.80;
        char firstInitial = 'S';
        boolean isActive = true;

        System.out.println(age);
        System.out.println(percentage);
        System.out.println(firstInitial);
        System.out.println(isActive);


        // Reference Data Types
        System.out.println("Reference Data Types");
        String firstName = "Shadman";
        String lastName = "Jamil";

        System.out.println(firstName);
        System.out.println(lastName);


        // Indexes with String
        System.out.println("Indexes with String");
        char firstNameFirstLetter = firstName.charAt(0);
        System.out.println(firstNameFirstLetter);


        // Concatenation
        System.out.println("First Name:" + firstName + ", Last Name:" + lastName );


        // Input Double Number
        System.out.println("What is your GPA?");
        Scanner input = new Scanner(System.in);
        double GPA = input.nextDouble();
        System.out.println("Your full name is:" + GPA);


        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

    }
}