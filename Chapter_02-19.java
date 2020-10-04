import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] pos = new double[6];
        double[] length = new double[3];
        double S = 0, ans;
        for(int i=0; i<= 5; i++){
            pos[i] = scanner.nextDouble();
        }
        length[0] = Math.sqrt(Math.pow((pos[2]-pos[0]) , 2) + Math.pow((pos[3]-pos[1]) , 2));
        length[1] = Math.sqrt(Math.pow((pos[4]-pos[2]) , 2) + Math.pow((pos[5]-pos[3]) , 2));
        length[2] = Math.sqrt(Math.pow((pos[4]-pos[0]) , 2) + Math.pow((pos[5]-pos[1]) , 2));
        for(int i=0; i<=2; i++){
            S += length[i];
        }
        S/=2;
        ans = Math.sqrt(S*(S-length[0])*(S-length[1])*(S-length[2]));
        if(ans == 0)
            System.out.println("Not Triangle");
        else
            System.out.printf("%.3f\n",ans);
    }
}
