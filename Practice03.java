import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,count;
        number = scanner.nextInt();
        for(int i=2; i<number; i++){

            count = 0;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    count = 1;
                    break;
                }
            }
            if(count == 0){
                if(i!=2){
                    System.out.print(" ");
                }
                System.out.printf("%d",i);
            }
        }
        System.out.println();
    }
}
