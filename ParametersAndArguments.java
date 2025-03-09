public class ParametersAndArguments {
    // Main method
    public static void main(String[] args) {
        // Declare variables for room dimensions
        int roomWidth = 10;
        int roomHeight = 15;

        // Call calculateArea method with arguments and store the result
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate area with width and height as parameters
    public static int calculateArea(int width, int height) {
        int area = width * height; // Compute area
        return area; // Return the result
    }
}
