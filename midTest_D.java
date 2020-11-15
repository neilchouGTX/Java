import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        int N;
        String ori,token,rep;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<N; i++){
            int count = 0;
            ori = sc.nextLine();
            token = sc.nextLine();
            rep = sc.nextLine();
            StringBuffer A = new StringBuffer(ori);
            for(int j=0; j<ori.length(); j++){  
                if(count == token.length()){
                    A = rrreplace(A,rep,j-(token.length()),j);
                    ori = A.toString();
                    count = 0;
                    j = -1;
                }
                else if(ori.charAt(j)==token.charAt(count)){
                    count++;
                }
                else{
                    count = 0;
                }
            } 
            if(count == token.length()){
                    A = rrreplace(A,rep,ori.length()-token.length(),ori.length());
                    ori = A.toString();
            }   
            A = rev(A);
            System.out.println(A.toString());
        }    
    }
    public static StringBuffer rrreplace(StringBuffer X,String r,int start,int end){
        return X.replace(start,end,r);
    }
    public static StringBuffer rev(StringBuffer X){
        return X.reverse();
    }
    
}