import java.util.Scanner;
import java.lang.Math;
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		double A,B,total;
		A = sc.nextDouble();
		B = sc.nextDouble();
		total = Math.sqrt((A*A)+(B*B));
		if(total>10){
			System.out.printf("(%.1f,%.1f) is not in the circle\n",A,B);
		}
		else
			System.out.printf("(%.1f,%.1f) is in the circle\n",A,B);
	}
}