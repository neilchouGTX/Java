import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int newA, A, cou = 2, flag = 0;
        A = sc.nextInt();
        newA = A;
        while(cou <= A){
            if(newA%cou==0 && cou!=A){
                if(newA != cou){
                    System.out.print(cou + " ");
                }
                else
                    System.out.println(cou);
                flag = 1;
                newA/=cou;
            }
            else
                cou++;
        }
        if(flag==0){
            if(A == 0)
                System.out.println();
            else
                System.out.println("1 " + A);
        }

    }
}