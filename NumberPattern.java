//Numberpatternjava
public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // number of rows in the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // print the number
            }
            System.out.println(); // move to the next row
        }
    }
}
