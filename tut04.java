//Functions

        /*In Java, all function definitions must be inside classes. We also call functions methods.
        Let's look at an example method
        public class Main {
    public static void foo() {
        // Do something here
    }
}*/
/*foo is a method we defined in class Main. Notice a few things about foo.
    static means this method belongs to the class Main and not to a specific instance of Main.
    Which means we can call the method from a different class like that Main.foo().
    void means this method doesn't return a value. Methods can return a single value in Java&
    it has to be defined in the method declaration. However, you can use return by itself to exit the method.
    This method doesn't get any arguments, but of course Java methods can get arguments as we'll see further on.
        * */
    //Arguments
        /*I always like to say that arguments to Java methods are passed by value, although some might disagree with my choice of words,
         I find it the best way to explain and understand how it works exactly.
         By value means that arguments are copied when the method runs. Let's look at an example.
publi   c void bar(int num1, int num2) {
        ...
        }
        Here is a another place in the code, where bar is called
        int a = 3;
        int b = 5;
        bar(a, b);
        You can picture in your head that when bar(a, b) is run,
        it's like in the beginning of bar the following two lines are written:
        int num1 = a;
        int num2 = b;
        And only then the rest of the method is run.
*/
public class tut04 {
    public static void main(String[] args){

    }
}
