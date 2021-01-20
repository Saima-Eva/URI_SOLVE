
package URI_Online_Judge;
import java.util.Scanner;
import java.io.IOException;


public class SalaryWithBonus_1009 {
    public static void main(String[] args)throws IOException {
        
      double salary,value,TOTAL;
	  String name;
	  Scanner sc = new Scanner(System.in);
	  name = sc.next();
	  salary = sc.nextDouble();
	  value = sc.nextDouble();
	  

	  TOTAL = salary + value * 0.15;
	  System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
		  
	}
    
}
