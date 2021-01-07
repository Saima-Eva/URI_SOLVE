
package URI_Online_Judge;

import java.io.IOException;
import java.util.Scanner;
public class Average2_1006 {
    public static void main(String[] args)throws IOException {
        double A,B,C,med;
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        med=(A/10*2)+(B/10*3)+(C/10*5);
         String media = String.format("MEDIA = %,.1f", med);
            System.out.print(media +"\n");
        
        
    }
    
}
