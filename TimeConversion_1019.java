
package URI_Online_Judge;

import java.util.Scanner;
public class TimeConversion_1019 {
    public static void main(String[] args) {
  int N;

  Scanner sc = new Scanner(System.in);
  N = sc.nextInt();

  int h = N / 3600;
  N = N - (h * 3600);

  int m = N / 60;
  N = N - (m * 60);

  System.out.printf("%d:%d:%d\n", h, m, N);
    
}
}