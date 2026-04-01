import java.util.Scanner;

// User-defined exception class
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

// Main class
public class UserAuthentication {

    // Method to authenticate user
    static void authenticate(String username, String password) 
            throws InvalidCredentialsException {

        String validUsername = "admin";
        String validPassword = "1234";

        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        } else {
            System.out.println("Authentication successful!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            authenticate(username, password);
        } catch (InvalidCredentialsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
