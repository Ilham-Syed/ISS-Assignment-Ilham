package exceptionHandling;

/**
 * A custom exception to indicate invalid age during user registration.
 */
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
        super(message);
    }
}


public class UserService {
	
	// Registers a user after validating their age
    public void registerUser(String name, int age) throws InvalidAgeException {
        validateAge(age); // This method might throw InvalidAgeException
        System.out.println("User " + name + " registered successfully!");
    }

    // Validates if the user is above 18 years
    private void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User must be at least 18 years old. Provided age: " + age);
        }
    }
}


