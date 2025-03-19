public class booleanowneg {
    public static void main(String[] args) {
        boolean b = true;
        /*boolean toBe = false;
        b = toBe || !toBe;
        if (b) System.out.println(toBe); */
        boolean d = true;
        boolean c = false;
        boolean a = (d) && (c);            //The following line will give an error
        System.out.println(a);
    }
}
