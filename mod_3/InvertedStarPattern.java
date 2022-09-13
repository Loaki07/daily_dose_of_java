// **** - line=1, stars=4
// ***  - line=2, stars=4-2+1
// **   - line=3, stars=4-3+1
// *    - line=4, stars=4-4+1
// starts per line = n-line+1

public class InvertedStarPattern {
    public static void main(String[] args) {
        for(int line=1; line<=4; line++) {
            for(int star=1; star<=4-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
