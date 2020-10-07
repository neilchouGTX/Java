import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total;
        number = scanner.nextInt();
        if(number == 1000){
            total = 1;
        }
        if(number>=100){
            total = number/100;
            number%=100;
            total *= (number/10);
            total *= (number%10);
        }
        else if((number <100)&&(number >=10)){
            total = number/10;
            total *= (number%10);
        }
        else{
            total = number;
        }
        System.out.println(total);
    }
}
