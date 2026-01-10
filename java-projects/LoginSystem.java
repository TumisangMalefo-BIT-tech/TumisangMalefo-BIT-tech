import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "password123";

        System.out.println("=== Login System ===");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println();
            System.out.println("Login successful!");
            System.out.println("Welcome, " + username + ".");
        } else {
            System.out.println();
            System.out.println("Login failed!");
            System.out.println("Incorrect username or password.");
        }

        input.close();
    }
}
