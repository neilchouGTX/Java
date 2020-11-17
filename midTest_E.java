import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[][] A = new int[10000][10000];
       int[][] B = new int[10000][10000];
       int[][] ans = new int[10000][10000];
       int N, Am, An, Bm, Bn;
       N = sc.nextInt();
       for(int i=0; i<N; i++){
            Am = sc.nextInt();
            An = sc.nextInt();
            for(int j=0; j<Am; j++){
                for(int k=0; k<An; k++){
                    A[j][k] = sc.nextInt();
                }
            }
            Bm = sc.nextInt();
            Bn = sc.nextInt();
            for(int j=0; j<Bm; j++){
                for(int k=0; k<Bn; k++){
                    B[j][k] = sc.nextInt();
                }
            }
            for(int j=0; j<10000; j++){
                for(int k=0; k<10000; k++){
                    ans[j][k] = 0;
                }
            }
            for(int j=0; j<Am; j++){
                for(int t=0; t<Bn; t++){
                    for(int k=0; k<An; k++){
                        ans[j][t] += A[j][k]*B[k][t];
                    }
                }
            }
            for(int j=0; j<Am; j++){
                for(int k=0; k<Bn; k++){
                    if(k==0)
                        System.out.print(ans[j][k]);
                    else
                        System.out.print(" " + ans[j][k]);
                }
                if(j!=Am-1)
                    System.out.println();
            }
            if(i!=N-1){
                System.out.println();
                System.out.println();
            }
       }
    }
}