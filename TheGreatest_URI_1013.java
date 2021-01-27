
package URI_Online_Judge;

import java.util.Scanner;
import java.io.IOException;
public class TheGreatest_URI_1013 {
    public static void main(String[] args) throws IOException {
        	
		int a, b, c, tmp;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		tmp = a;
		if(a < b || a < c){
			if(b < c){
				tmp = c;
			}else{
				tmp = b;
			}
		}

		System.out.printf("%d eh o maior\n", tmp);
        
    }
    
}
