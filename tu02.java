//Conditionals
//If-else got started
/*
The if - else statements doesn't have to be in several lines with {}, if can be used in one line, or without the {},
        for a single line stat-ment.
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
        for(int i=0;i<9;i++) { //for loop also initialised
            boolean resulti;
            resulti = x < y;
            System.out.println(resulti);// true
            resulti = x > y; // false
            System.out.println(resulti);
            resulti = x <= 7; // a smaller or equal to 7 - true
            System.out.println(resulti);
            resulti = y >= 6; // b bigger or equal to 6 - false
            System.out.println(resulti);
            resulti = x == y; // a equal to b - false
            System.out.println(resulti);
            resulti = x != y; // x is not equal to y - true
            System.out.println(resulti);
            resulti = x > y || x < y; // Logical or - true
            System.out.println(resulti);
            resulti = 5 < x && x < 8; // Logical and - true
            System.out.println(resulti);
            resulti = !resulti; // Logical not - false
            System.out.println(resulti);
        }
        int l = 49,m = 42,s = 56,t = 56;
        if (l == m && s == t)
            System.out.println("Another line Wow!");
        else
            System.out.println("Double Rainbow!");

        //The ugly side of if
        //
        //There is A another way to write a one line if - else statement by using the operator ?
        int aa = 4;
        int result = aa == 4 ? 1 : 8;

        // result will be 1
        // This is equivalent to
        int res21;
        if (aa == 4) {
            res21 = 1;
        } else {
            res21 = 8;
        }
        System.out.println(res21);
    }

    }
