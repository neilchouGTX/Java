import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        while(1==1){
            text = scanner.next();
            if(text.charAt(0) == '0')
                break;
            int len = text.length();
            int numA=0,numB=0,total;
            //System.out.print(text.charAt(2));
            for(int i=0; i<len; i+=2){
                numA += (Integer.valueOf(text.charAt(i))-48);
            }
            for(int i=1; i<len; i+=2){
                numB += (Integer.valueOf(text.charAt(i))-48);
            }
            total = Math.abs(numA-numB);
            if(total%11==0){
                System.out.println(text + " is a multiple of 11.");
            }
            else{
                System.out.println(text + " is not a multiple of 11.");
            }
        }

        //System.out.print(A);
    }
}
