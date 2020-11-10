import java.util.*;
public class Main{
    public static void main(String[] args){
        String A;
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        int total = 1;
        for(int i=0; i<A.length(); i++){
            total*= Integer.parseInt(String.valueOf(A.charAt(i)));
        }
        System.out.println(total);
    }
    
}