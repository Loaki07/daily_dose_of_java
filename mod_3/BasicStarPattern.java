// *
// **
// ***
// ****

public class BasicStarPattern {
    public static void main(String[] args) {
        // Logic:
        // 1. Identify the total number of lines
        // 2. Number of times
        // 3. What to print?

        for(int line=1; line<=4; line++) {
            for(int star=1; star<=line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
