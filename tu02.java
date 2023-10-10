//Conditionals
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
        if (d) {
            System.out.println("It's true! No problem.");
        } else
            System.out.println("It's WRONG! Do Again");
    }

    }
