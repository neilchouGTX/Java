import java.util.*;
import java.lang.*;
import java.awt.geom.Point2D;
public class Main{
    public static void main(String[] args){
        int N;
        double[] x = new double[3];
        double[] y = new double[3];
        double[] side = new double[3];
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<=2; j++){
                x[j] = sc.nextInt();
                y[j] = sc.nextInt();
            }
            
            Point[] Len = new Point[3];
            Len[0] = new Point(x[0],y[0],x[1],y[1]);
            Len[1] = new Point(x[1],y[1],x[2],y[2]);
            Len[2] = new Point(x[0],y[0],x[2],y[2]);
            Triangle tri = new Triangle(x[0],y[0],x[1],y[1],x[2],y[2]);
            for(int j=0; j<=2 ;j++){
                side[j] = Len[j].dis();
            }
            for(int j=0; j<2; j++){
                for(int k=j+1; k<3; k++){
                    if(side[k]<side[j]){
                        double temp = side[k];
                        side[k] = side[j];
                        side[j] = temp;
                    }
                }
            }
            if(tri.area()!=0)
                System.out.printf("%.3f %.3f %.3f %.3f\n",side[0],side[1],side[2],tri.area());
            else
                System.out.println("Just Line!");
        }

    }
}
class Point{
    double x1,x2,y1,y2;
    Point(){
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }
    Point(double x1,double y1, double x2, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double dis(){
        return Point2D.distance(x1,y1,x2,y2);
    }

}
class Triangle{
    double x1,x2,y1,y2,x3,y3;
    double s,a,b,c;
    Triangle(){
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        x3 = 0;
        y3 = 0;
    }
    Triangle(double x1,double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    double area(){
        Point[] Len = new Point[3];
        Len[0] = new Point(x1,y1,x2,y2);
        Len[1] = new Point(x2,y2,x3,y3);
        Len[2] = new Point(x1,y1,x3,y3);
        a = Len[0].dis();
        b = Len[1].dis();
        c = Len[2].dis();
        s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}