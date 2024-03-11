//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // Primitive data Types
        System.out.println("Primitive Data Types");
        int age = 12;
        double percentage = 50.80;
        char firstInitial = 'S';
        boolean isActive = true;

        System.out.println(age);
        System.out.println(percentage);
        System.out.println(firstInitial);
        System.out.println(isActive);

        System.out.println("Reference Data Types");
        String firstName = "Shadman";
        String lastName = "Jamil";

        System.out.println(firstName);
        System.out.println(lastName);
    }
}