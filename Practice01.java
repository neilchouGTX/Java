import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        for(int i=1; i<=number; i++){
            for(int j=number-(i+1); j>=0; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
