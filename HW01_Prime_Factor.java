import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,number;
        while(scanner.hasNext()) {
            i=2;
            number = scanner.nextInt();
            while(i<=number){
                if(number/i == 1 && number%i==0){
                    System.out.print(i + "\n");
                    break;
                }
                if(number%i==0) {
                    number /= i;
                    System.out.print(i + " ");
                    i--;
                }
                i++;
            }
        }
    }
}
