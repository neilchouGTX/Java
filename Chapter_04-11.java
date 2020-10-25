import java.lang.Math;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String original,temp;
		int length,total;
		original = sc.nextLine();
		StringTokenizer st = new StringTokenizer(original," ");
     	while (st.hasMoreTokens()) {
     		temp = st.nextToken();
        	total = 0;
        	length = temp.length();
        	for(int i = 0; i<length; i++){
        		total += (temp.charAt(i)-'0')*Math.pow( 2, (length-1)-i);
        	}
        	System.out.println(total);
    	}
	}
}