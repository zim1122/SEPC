package validation;

public class AgeValidation {

    // Custom Exception Class
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Invalid Age! Age must be between 18 and 60.");
        } else {
            System.out.println("✅ Valid Age!");
        }
    }
}
package validation;

public class DeptValidation {

    // Custom Exception Class
    public static class InvalidDeptException extends Exception {
        public InvalidDeptException(String message) {
            super(message);
        }
    }

    // Method to check department
    public static void checkDept(String dept) throws InvalidDeptException {
        String[] validDepts = {"CSE", "EEE", "ME", "CE"};
        boolean found = false;

        for (String d : validDepts) {
            if (d.equalsIgnoreCase(dept)) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new InvalidDeptException("Invalid Department! Must be one of: CSE, EEE, ME, CE.");
        } else {
            System.out.println("✅ Valid Department!");
        }
    }
}
import validation.AgeValidation;
import validation.DeptValidation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Department (CSE/EEE/ME/CE): ");
            String dept = sc.nextLine();

            AgeValidation.checkAge(age);
            DeptValidation.checkDept(dept);

            System.out.println("🎯 All validations passed successfully!");

        } catch (AgeValidation.InvalidAgeException e) {
            System.out.println("❌ Age Error: " + e.getMessage());
        } catch (DeptValidation.InvalidDeptException e) {
            System.out.println("❌ Department Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠️ Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
