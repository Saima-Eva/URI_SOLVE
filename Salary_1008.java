
package URI_Online_Judge;

import java.io.IOException;
 import java.util.Scanner;
public class Salary_1008 {
    public static void main(String[] args) throws IOException{
        
    Scanner key=new Scanner(System.in);
        int A,B;
        float C;
        A=key.nextInt();
        B=key.nextInt();
        C=key.nextFloat();
        System.out.printf("NUMBER = %d\n", A);
        System.out.printf("SALARY = U$ %.2f\n", B * C);
    
}
}