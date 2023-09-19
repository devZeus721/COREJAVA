import java.util.*;
    public class nopattern{
        public static void main(String[] args){
        Scanner s=new Scanner(System.in);
            int N=s.nextInt();
            int i=1;
            //int row=0;
            while(i<=N)
            {
                int j=i;
                //row++;
                while(j<=(2*i-1))
                {
                    System.out.print(j);
                    j=j+1;
                }
                System.out.println();
                i=i+1;
            }
            
            
        }
    }