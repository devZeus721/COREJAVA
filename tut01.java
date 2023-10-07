//Variables and Types-imp-basics
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
In Java, a character is its own type and it's not simply a number, so it's not common to put an ascii value in it, there is a special syntax for chars:
char c = 'g';
String is not a primitive. It's a real type, but Java has special treatment for String.
Here are some ways to use a string:
// Create a string with a constructor
String s1 = new String("Who let the dogs out?");        // String object stored in heap memory
// Just using "" creates a string, so no need to write it the previous way.
String s2 = "Who who who who!";                         // String literal stored in String pool
// Java defined the operator + on strings to concatenate:
String s3 = s1 + s2;
There is no operator overloading in Java but there is the exception that proves the rule - string is the only class where operator overloading is supported.
 You can also concat string to primitives:-
int num = 5;
String s = "I have " + num + " cookies"; //Be sure not to use "" with primitives.
*/
/*
Boolean Exp
Every comparison operator in java will return the type boolean.
Unlike other languages, it only accepts two special values: true or false.
* * */
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
        String t1 = "Getting started with CORE_JAVA,";
        System.out.println(t1);
        String t2 = " Bravo!";
        System.out.println(t1 + t2);
        int time = 7;
        String tim = "Now time is " + time + " pm.";
        System.out.println(tim);
        boolean toBe = false;
        boolean b = toBe || !toBe;// || is logical OR
        if (b) System.out.println(toBe);
    }
}

