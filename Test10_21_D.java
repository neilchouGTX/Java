import java.lang.Math;
import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,tmp = 0, first = 0;
		String temp,token;
		int totalOdd,totalEven,total;
		while(sc.hasNextInt()){
			N = sc.nextInt();
			if(N == -1)
				break;
			int[] letter = new int[26];
			for(int i=0; i<=25; i++){
				letter[i] = 0;
			}
			char[][] arr = new char[N][N];
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					temp = sc.next();
					arr[i][j] = temp.charAt(0);
				}
			}
			
			int flag = 0;
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					if(i==0)
						letter[arr[0][j]-'A']++;
					else{
						if(letter[arr[i][j]-'A']== 0)
							flag = 1;
					}
				}
			}
			for(int i=0;i<N;i++){
				for(int j=0; j<(N-1); j++){
					for(int k=j+1; k<N; k++){
						if(arr[i][j] == arr[i][k])
							flag = 1;
					}
				}
			}
			for(int i=0; i<=25; i++){
				letter[i] = 0;
			}				
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					if(i==0)
						letter[arr[j][0]-'A']++;
					else{
						if(letter[arr[j][i]-'A']== 0)
							flag = 1;
					}
				}
			}
			for(int i=0;i<N;i++){
				for(int j=0; j<(N-1); j++){
					for(int k=j+1; k<N; k++){
						if(arr[j][i] == arr[k][i])
							flag = 1;
					}
				}
			}
			if(first==0)
				first = 1;
			else
				System.out.println();
			if(flag == 1)
				System.out.println("The input array is not a Latin square");
			else
				System.out.println("The input array is a Latin square");
					
		}	
	}
}