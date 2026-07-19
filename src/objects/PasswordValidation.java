package objects;

public class PasswordValidation {

    public static void main(String[] args) {

        String newPassword = "P@ssw0rd";
        boolean result = PasswordValidation.validatePassword(newPassword);
        System.out.println(result);

    }


    static String username = "jane_doe";
    static String currentPassword = "passw0rd";

    static boolean validatePassword(String newPassword) {

        boolean valid = true;

        // Minimum length
        if (newPassword.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            valid = false;
        }

        // Contains username
        if (newPassword.contains(username)) {
            System.out.println("Password cannot contain the username.");
            valid = false;
        }

        // Same as old password
        if (newPassword.equals(currentPassword)) {
            System.out.println("Password cannot be the same as the old password.");
            valid = false;
        }

        // Uppercase letter
        boolean hasUppercase = false;
        for (int i = 0; i < newPassword.length(); i++) {
            if (Character.isUpperCase(newPassword.charAt(i))) {
                hasUppercase = true;
                break;
            }
        }

        if (!hasUppercase) {
            System.out.println("Password must contain an uppercase letter.");
            valid = false;
        }

        // Special character
        boolean hasSpecial = false;
        for (int i = 0; i < newPassword.length(); i++) {
            char ch = newPassword.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
                break;
            }
        }

        if (!hasSpecial) {
            System.out.println("Password must contain a special character.");
            valid = false;
        }

        return valid;
    }
}
