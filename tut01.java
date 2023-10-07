//Variables and Types
/*
Here is a list of all primitives in Java:
    byte (number, 1 byte)
    short (number, 2 bytes)
    int (number, 4 bytes)
    long (number, 8 bytes)
    float (float number, 4 bytes)
    double (float number, 8 bytes)
    char (a character, 2 bytes)
    boolean (true or false, 1 byte)
* */
/*Characters and Strings
In Java, a character is it's own type and it's not simply a number, so it's not common to put an ascii value in it, there is a special syntax for chars:
char c = 'g';
String is not a primitive. It's a real type, but Java has special treatment for String.
 */
//Program
public class tut01 {
    public static void main(String[] args) {
        int _myNum = 497;
        System.out.println(_myNum);
        float start = 7.7f;//casting float
        System.out.println(start);
        float start2 = (float)49.77;//casting another way
        System.out.println(start2);
        double dou = 42.7;
        System.out.println(dou);
        char R = 'z';
        System.out.println(R);
    }
}

