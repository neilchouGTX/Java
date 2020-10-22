import java.lang.Math;
import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A;
		int totalOdd,totalEven,total;
		while(sc.hasNextLine()){
			totalOdd = 0;
			totalEven = 0;
			A = sc.nextLine();
			if(A.charAt(0) == '0')
				break;
			for(int i=0; i<A.length(); i+=2)
				totalEven+=A.charAt(i)-'0';
			for(int i=1; i<A.length(); i+=2)
				totalOdd+=A.charAt(i)-'0';		
			if(A.length()%2 == 1){
				int temp = totalEven;
				totalEven = totalOdd;
				totalOdd = temp;
			}
			total = Math.abs(totalEven-totalOdd);
			System.out.println(totalOdd + " " + totalEven);
			if(total % 11 == 0)
				System.out.println(A + " is a multiple of 11.");
			else
				System.out.println(A + " is not a multiple of 11.");
		}	
	}
}