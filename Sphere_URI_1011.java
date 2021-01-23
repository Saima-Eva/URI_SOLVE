
package URI_Online_Judge;

import java.io.IOException;
import java.util.Scanner;


public class Sphere_URI_1011 {
    
 public static void main(String[] args)throws IOException {
  
  double a;
  Scanner sc = new Scanner(System.in);
  a = sc.nextDouble();
  
  System.out.printf("VOLUME = %.3f\n", (4 * 3.14159 * Math.pow(a, 3.0)) / 3);
  

 }
    
}
