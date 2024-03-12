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


        // Relational Operators > < == >= <= !=
        System.out.println("Enter your desired number:");
        Scanner inputNumber = new Scanner(System.in);
        int desiredNumber = inputNumber.nextInt();
        if (desiredNumber > 5) {
            System.out.println("Your desired number is greater than 5");

            // scope of x variable
            int x = 10;
            System.out.println("x variable " + x + " scope is here");
            System.out.println("In scope accessible for x variable");
        } else {
            System.out.println("Your desired number is less than or equal to 5");

            System.out.println("Out of scope and not accessible for x variable");
        }


        // While Loop
        boolean repeatSong = true;
        Scanner inputPlay = new Scanner(System.in);
        while (repeatSong) {
            System.out.println("Playing current song...");
            System.out.println("Do you want to continue? if so enter yes ..");
            String wantedToContinue = input.next();

            if ( !wantedToContinue.equals("yes") ) {
                repeatSong = false;
            }
        }
        System.out.println("Playing next song...");


        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Multiple choice questions and answer
        char correctAnswer = 'C';
        int triedTimes = 0;
        boolean canTry = true;

        System.out.println("Please pick a correct answer from choices for a below question:");
        System.out.println("What is the current year?");
        System.out.println("A: 2023");
        System.out.println("B: 2014");
        System.out.println("C: 2024");


        while ( canTry ) {
            Scanner inputAnswer = new Scanner(System.in);
            String userAnswer = inputAnswer.next();

            if (correctAnswer == userAnswer.toUpperCase().charAt(0)) {
                System.out.println("Congrts, your answer is correct!!");
                canTry = false;
            } else {
                System.out.println("Sorry, try again (You have 2 chances only)");

                triedTimes++;
                if ( triedTimes>=2 ){
                    System.out.println("Sor2.ry, You have consumed your maximum tries.");
                    canTry = false;
                }
            }
        }
    }
}