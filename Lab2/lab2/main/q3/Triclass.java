package q3;

public class Triclass {

    public static String classify(int x, int y, int z) {
        // Check if inputs are within range
        if (x < 1 || x > 10 || y < 1 || y > 10 || z < 1 || z > 10) {
            return "Invalid";
        }
        
        // Check for a valid triangle
        if (x + y <= z || x + z <= y || y + z <= x) {
            return "Invalid";
        }

        // Check for equilateral
        if (x == y && y == z) {
            return "Equilateral";
        }

        // Check for isosceles
        if (x == y || y == z || x == z) {
            return "Isosceles";
        }

        // If none of the above, it's scalene
        return "Scalene";
    }
}
