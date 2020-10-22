import java.lang.Math;
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		while(sc.hasNextInt()){
			num = sc.nextInt();
			if(num == 0){
				System.out.println();
				continue;
			}
			int count=0,flag,revFlag;
			int[] arr = new int[num];
			for(int i=2; i<=2147483646; i++){
				flag = 0;
				revFlag = 0;
				for(int j=2; j<=Math.sqrt(i); j++){
					if(i%j==0){
						flag = 1;
						break;
					}
				}
				if(flag==0){
					String str = String.valueOf(i);
					StringBuffer sb = new StringBuffer(str);
					sb.reverse();
					for(int k=0; k<str.length(); k++){
						if(sb.charAt(k)!=str.charAt(k)){
							revFlag = 1;
						}
					}
					if(revFlag==0){
						arr[count] = i;
						count++;
					}
				}
				if(count == num)
					break;
			}
			for(int i=0 ; i<count; i++){
				if(((i+1)%10==0) || (i==count-1))
					System.out.println(arr[i]);
				else 
					System.out.print(arr[i] + " ");
			}
		}	
	}
}