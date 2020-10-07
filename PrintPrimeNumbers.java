import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int flag=0;
        int count = 0;
        num = scanner.nextInt();
        for(int i=2; i<=num; i++){
            count = 0;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    count = 1;
                    break;
                }
            }
            if(count == 0){
                if(flag == 0)
                    System.out.print(i);
                else
                    System.out.print(" " + i);
                flag++;
                if(flag == 10){
                    System.out.println();
                    flag = 0;
                }
            }
        }
        if(flag != 0){
            System.out.println();
        }

    }
}
