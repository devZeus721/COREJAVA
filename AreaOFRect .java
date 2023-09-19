import java.util.Scanner;

class AreaOFRect{

    public static void main(String args[]) {

        // Write code here

        try (Scanner sc = new Scanner(System.in)) {
            int length=sc.nextInt();

            int breadth=sc.nextInt();

            int area= (length*breadth);

            System.out.println(area);
        }   

    }

}