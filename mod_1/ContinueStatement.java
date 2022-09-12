import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        // continue statement
        // is used to skip an iteration
        for (int i=0; i<5; i++) {
            if (i ==3) {
                continue;
            }
            System.out.println(i);
        }


        // Display all numbers entered by user except multiples of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter you number: ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            
            System.out.println("number was: " + n);
        } while(true);
    }
}
