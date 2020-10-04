import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A,B,C,D,E,F,X,Y;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        E = scanner.nextDouble();
        C = scanner.nextDouble();
        D = scanner.nextDouble();
        F = scanner.nextDouble();
        X = cramerX(A, B, C, D, E, F);
        Y = cramerY(A, B, C, D, E, F);
        System.out.println(X + " " + Y);

    }
    public static double cramerX(double a, double b, double c, double d, double e, double f){
        return ((e*d)-(b*f))/((a*d)-(b*c));
    }
    public static double cramerY(double a, double b, double c, double d, double e, double f){
        return ((a*f)-(e*c))/((a*d)-(b*c));
    }

}
