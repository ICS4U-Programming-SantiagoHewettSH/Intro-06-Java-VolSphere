import java.util.Scanner;

/**
* This program display different math problems to the user.
*
* @author Santiago Hewett
* @version 1.0
* @since   2025/02/07
*/

import java.util.Scanner;

final class VolSphere {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private VolSphere() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Greet the user and ask for radius of the sphere
        System.out.println("Welcome, this program was made to calculate the volume of a sphere");
        System.out.println("Please enter the radius of your sphere (cm): ");

        // Use the scanner to get user input
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        // converting string to double
        final double radDouble = Double.parseDouble(radString);

        // If radius is less than or equal to 0, tell the user to input a new number
        if (radDouble <= 0) {
            System.out.println("The radius can not be negative or 0");
        } else {
            // Calculate the volume of sphere
            final double volume = (4d / 3d) * (Math.PI) * (Math.pow(radDouble, 3));

            // Display the volume of the sphere to user, rounded to 2 decimal places
            System.out.print("The volume of the sphere with the radius of, ");
            System.out.print(radString + "cm, is ");
            System.out.format("%.2f", volume);
            System.out.println("cm^3");
        }

        //Close Scanner
        scanner.close();
    }
}
