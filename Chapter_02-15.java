import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,y1,x2,y2;
        double ans;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        ans = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        ans = Math.sqrt(ans);
        System.out.println(ans);
    }
}
