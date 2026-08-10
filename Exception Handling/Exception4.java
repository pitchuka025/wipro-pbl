class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }

    public InvalidCountryException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCountryException(Throwable cause) {
        super(cause);
    }
}

public class Exception4 {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!"India".equalsIgnoreCase(userCountry)) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {
        Exception4 registration = new Exception4();

        try {
            registration.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        try {
            registration.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
