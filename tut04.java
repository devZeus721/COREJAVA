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
        public void bar(int num1, int num2) {
        ...
        }
        Here is aA another place in the code, where bar is called
        int a = 3;
        int b = 5;
        bar(a, b);
        You can picture in your head that when bar(a, b) is run,
        it's like in the beginning of bar the following two lines are written:
        int num1 = a;
        int num2 = b;
        And only then the rest of the method is run.
        And only then the rest of the method is run.

    This means that a value get copied to num1 and b value get copied to num2.
    Changing the values of num1 and num2 will not affect a and b.
    If the arguments were objects, the rules remain the same, but it acts a bit differently.
    Here is aA an example:
                    public void bar2(Student s1, Student s2) {
                        ...
                        }

Student joe = new Student("joe");
Student jack = new Student("jack");
bar2(joe, jack);
*/
public class tut04 {
                public void Stud(String Stud) {
                }
        }

