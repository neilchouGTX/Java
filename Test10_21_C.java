import java.lang.Math;
import java.util.Scanner;
import java.math.BigInteger;
public class C{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1,str2;
		while(sc.hasNext()){
			str1 = sc.next();
			str2 = sc.next();
			BigInteger M = new BigInteger(str1);
			BigInteger N = new BigInteger(str2);
			System.out.print(M.gcd(N) + " ");
			String lcmStr = (((M.multiply(N)).divide(M.gcd(N))).toString());
			BigInteger lcm = new BigInteger(lcmStr);
			System.out.println(lcm);
			for(int i=0; i<4; i++){
				System.out.print(lcm.nextProbablePrime() + " ");
				lcm = lcm.nextProbablePrime();
			}
			System.out.println(lcm.nextProbablePrime());

		}	
	}
}