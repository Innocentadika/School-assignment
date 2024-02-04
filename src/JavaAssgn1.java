import java.io.IOException;

import java.util.Scanner;

public class JavaAssgn1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********BSE-01-0003/2024 (INNOCENT MUKOVWA) ASSIGNMENT 1**********");
        
        // Username and password credentials
        String username = "user@gmail.com";
        String password = "name@254";

        // Give the user 3 attempts
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Attempt " + attempt + ":");
            

                // Accept the user credentials
            System.out.print("Enter your username: ");
            String enteredUsername;
            enteredUsername = scanner.nextLine();

            System.out.printf("Enter your password: ");
            String enteredPassword = getPasswordInput();

            // Check if the entered credentials are correct
            if (password.equals(enteredPassword) && username.equals(enteredUsername)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid username or password try again.\n");
            }

  
        }

        System.out.println("You have entered too many attempts!");
    }

    // Function to mask the password input
    private static String getPasswordInput() {
        ConsoleEraser consoleEraser = new ConsoleEraser();
        StringBuilder password = new StringBuilder();

        char c;
        while ((c = consoleEraser.getChar()) != '\n') {
//            password.append('*');
            System.out.print(password.length());
            password.append(c);
        }

        return password.toString();
    }
    

    // Erasing password input by the user
    private static class ConsoleEraser {
        public char getChar() {
            char inputChar = 0;
            
            try {
                inputChar = (char) System.in.read();
                while (System.in.available() > 0) {
                    System.in.read();
                }
            } catch (IOException e) {
                System.err.println("Error reading input: " + e.getMessage());
            }
            return inputChar;
        }
    }
}

