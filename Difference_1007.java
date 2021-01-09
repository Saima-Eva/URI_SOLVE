
package URI_Online_Judge;

import java.io.IOException;
 import java.util.Scanner;
public class Difference_1007 {
     public static void main(String[] args) throws IOException {
 
        Scanner key=new Scanner(System.in);
                        int a, b, c, d, difference;

         a = key.nextInt();
         b = key.nextInt();
         c = key.nextInt();
         d = key.nextInt();
         difference = a * b - c * d;
         System.out.print("DIFERENCA = "+ difference +"\n");
}
}