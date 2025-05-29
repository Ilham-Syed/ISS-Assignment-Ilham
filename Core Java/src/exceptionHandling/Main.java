package exceptionHandling;

public class Main {
	public static void main(String[] args) {
		UserService userService = new UserService();

        // Example 1: Valid registration
        try {
            userService.registerUser("Ilham", 25);
        } catch (InvalidAgeException e) {
            System.err.println("Registration failed: " + e.getMessage());
        }

        // Example 2: Invalid registration (triggers exception)
        try {
            userService.registerUser("Amit", 16);
        } catch (InvalidAgeException e) {
            System.err.println("Registration failed: " + e.getMessage());
        }
	}
}
