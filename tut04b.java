//Functions b
/*
Non-static methods
Non-static methods in Java are used more than static methods.
Those methods can only be run on objects and not on the whole class.
Non-static methods can access and alter the field of the object.
public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

* */
public class tut04b {

    private String name;

    public String getName() {
        return name;}
        public void setName(String name){
            this.name = name;}

            tut04b t = new tut04b();
            t.setName("Danielle");
            String name2 = t.getName();

            tut04b.setName("Bob"); // Will not work!
            tut04b.getName(); // Will not work!
        }


