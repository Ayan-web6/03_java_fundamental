package sess01_intro2_java;

import java.util.Scanner; // Import Scanner class

/**
 *
 * @author Ayan Ahmed
 */
public class GreetUser {
    // main method begins program execution
    public static void main(String[] args) {
        // variable(s) to be used in the application
        String username;
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Please enter your name:");

        // Read in the user's name
        username = sc.nextLine();

        // Close the input stream
        sc.close();

        // Greet the user
        System.out.println("Hello " + username + " from Java Programming!");
    }
}
