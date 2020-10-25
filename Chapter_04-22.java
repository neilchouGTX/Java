import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String original,sub;
        original = sc.next();
        sub = sc.next();
        if(original.contains(sub))
            System.out.println(sub + " is a substring of " + original);
        else
            System.out.println(sub + " is not a substring of " + original);
    }
}