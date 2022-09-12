import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("Hello World " + counter);
            counter++;
        } while(counter <=10);


        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter number: ");
            int n = sc.nextInt();
            if (n % 10 ==0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
