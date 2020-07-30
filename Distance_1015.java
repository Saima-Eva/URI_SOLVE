
package URI_Online_Judge;

import java.util.Scanner;
public class Distance_1015 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        double x1,y1,x2,y2,dist,p1,p2;
       
        x1=key.nextDouble();
        y1=key.nextDouble();
        x2=key.nextDouble();
        y2=key.nextDouble();
        p1=x2-x1;
        p2=y2-y1;
        dist=Math.sqrt((p1*p1)+(p2*p2));
        System.out.printf("%.4f\n",dist);
    }
    
}
