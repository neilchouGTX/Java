import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.print(i + " * " + j + " = ");
                System.out.format("%2d",i*j);
                if(j!=9)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
