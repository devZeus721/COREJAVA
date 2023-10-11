//Conditionals
//If-else got started
/*
Java uses boolean variables to evaluate conditions.
The boolean values true and false are returned when an expression is compared or evaluated.
 */
public class tu02 {
    public static void main(String[] args) {
        //eg01
        int a = 4, e = 8;
        boolean b = a == 4;
        boolean d = e == 4;

        if (b) {
            System.out.println("It's true! No problem.");
        }
        if (d) {                                            //if-else Working in java
            System.out.println("It's true! No problem.");
        } else
            System.out.println("It's WRONG! Do Again");

        //Boolean operators
        int x = 7;
        int y = 6;
        boolean result;
        result = x < y; // true
        result = x > y; // false
        result = x <= 7; // a smaller or equal to 4 - true
        result = y >= 6; // b bigger or equal to 6 - false
        result = x == y; // a equal to b - false
        result = x != y; // a is not equal to b - true
        result = x > y || x < y; // Logical or - true
        result = 5 < x && x < 8; // Logical and - true
        result = !result; // Logical not - false

    }

    }
