// Declare the package name (optional, used for grouping related classes)
package BitwiseOperators;

// Define the class named SquareRoot
public class SquareRoot {

    // Main method - Entry point of the program
    public static void main(String[] args) {
        int num = 40;  // The number whose square root we want to find
        int place = 3; // Number of decimal places for precision

        // Call the sqrt method and print the result formatted to 3 decimal places
        System.out.printf("%.3f", sqrt(num, place));
    }

    // Method to calculate the square root of a number 'num' up to 'place' decimal places
    static double sqrt(int num, int place) {
        int start = 0;       // Start of the binary search range
        int end = num;       // End of the binary search range
        double root = 0.0;   // To store the approximate square root

        // Perform binary search to find the integer part of the square root
        while (start <= end) {
            int mid = start + (end - start) / 2; // Midpoint to avoid overflow

            // If mid * mid is exactly the number, return mid as the square root
            if (mid * mid == num) {
                return mid;
            }
            // If mid squared is greater than num, eliminate right half
            else if (mid * mid > num) {
                end = mid - 1;
                //root = mid;
            }
            // If mid squared is less than num, eliminate left half
            else {
                start = mid + 1;
                //root = mid; // Store the last mid because it is the closest smaller integer root
            }

        }

        double incr = 0.1; // Initial increment for decimal place approximation

        // Loop to find the decimal part up to the specified number of places
        for (int j = 0; j < place; j++) {
            // Increase root until its square becomes greater than num
            while (root * root <= num) {
                root = root + incr;
            }

            // Once it exceeds num, go one step back
            root = root - incr;

            // Reduce the increment to go one more decimal place deeper
            incr = incr / 10;
        }

        return root; // Return the final approximated square root
    }
}
