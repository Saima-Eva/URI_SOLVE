
package URI_Online_Judge;

import java.io.IOException;
 import java.util.Scanner;

public class AreaOfCircle_1002 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
       double area,r;
        r= sc.nextDouble();
      
       area = 3.14159 *r *r;
      System.out.printf("A=%.4f\n", area);
 
    }
    
}
