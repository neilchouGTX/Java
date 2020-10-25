import java.util.Scanner;
public class Main{
    public static double fac(int times){
        if(times == 1)
            return 1;
        else
            return (times*fac(times-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        double total=1;
        num = sc.nextInt();
        for(int i=1; i<=num; i++)
            total = total + (1/fac(i));
        System.out.println(total);

    }
    
}