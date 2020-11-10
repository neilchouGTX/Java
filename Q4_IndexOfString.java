import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A;
        String B;
        int flag = 0;
        int first = 0;
        while(sc.hasNext()){
            Vector vc = new Vector();
            A=sc.next();
            B=sc.next();
            
            first = 0;
            int i=0;
            while(i<A.length()){
                flag = 0;
                for(int j=0; j<B.length(); j++){
                    if(i==(A.length()-B.length())+1){
                        flag = 1;
                        break;
                    }   
                    else if(B.charAt(j)!=A.charAt(j+i)){
                        flag = 1;
                        break;
                    }
                }
                if(flag==0){
                    if(first==0){
                        first = 1;
                        System.out.println(B + " is a substring of " + A);
                        System.out.print(i);
                    }
                    else{
                        System.out.print(" " + i);
                    }
                }
                i++;
            }
            if(first == 0)
                System.out.println(B + " is not a substring of " + A);
            else
                System.out.println();
            
        }
        
        
    }
    
}