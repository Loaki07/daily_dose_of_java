public class UnaryOperators {
    public static void main(String args[]) {
        int a = 10; 
        int b = ++a; // pre increment
        System.out.println(a); // 11
        System.out.println(b); // 11

        int c = 10; 
        int d = c++; // post increment
        System.out.println(c); // 11
        System.out.println(d); // 10
    }
}
