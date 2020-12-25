import java.util.*;
import java.lang.*;
import java.math.*;
import java.awt.geom.Point2D;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        double answer;
        double[] line = new double[3];
        N = sc.nextInt();
        for(int i=0; i<N; i++){
            Point2D point1 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
            Point2D point2 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
            Point2D point3 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
            Triangle compute = new Triangle(point1, point2, point3);
            compute.setSide();
            for(int j=0; j<3; j++)
                line[j] = compute.getSide(j);
            answer = compute.getArea();
            if(answer == 0){
                System.out.println("Just Line!");
            }
            else{
                Arrays.sort(line);
                System.out.printf("%.3f %.3f %.3f %.3f\n",line[0],line[1],line[2],answer);
            }
        }

    }
}
class Point{
    Point2D p1,p2;
    Point(Point2D p1, Point2D p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public double distance(){
        return p1.distance(p2);
    }
    public void setPoint(Point2D p1, Point2D p2){
        this.p1 = p1;
        this.p2 = p2;
    }
}
class Triangle{
    Point2D p1,p2,p3;
    double sa,sb,sc,s;
    Triangle(Point2D p1, Point2D p2, Point2D p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public void setSide(){
        Point needSide = new Point(p1,p2);
        sa = needSide.distance();
        needSide.setPoint(p2,p3);
        sb = needSide.distance();
        needSide.setPoint(p1,p3);
        sc = needSide.distance();
        s = (sa + sb + sc)/2;
    }
    public double getArea(){
        return Math.sqrt(s*(s-sa)*(s-sb)*(s-sc));
    }
    public double getSide(int x){
        if(x == 0)
            return sa;
        else if(x == 1)
            return sb;
        else
            return sc;
    }

}
