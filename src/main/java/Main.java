
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        NewPoint point1 = new NewPoint(1,1);
        NewPoint point2 = new NewPoint(-2,-3);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        System.out.println(point2.getX());
        System.out.println(point2.getY());

        int x1 = 1;
        int y1 = 1;
        int x2 = -2;
        int y2 = -3;
        if (x1==y1 || x2==y2) {
            System.out.println("Точки попадают в область один");
        }
        else {
            System.out.println("Точки не попадают в область один");
        }
        if (y1<x1*x1 || y2<x2*x2){
            System.out.println("Точки попадают в область два");
        }
        else {
            System.out.println("Точки не попадают в область два");
        }
        if (y1<x1*x1*x1 || y2<x2*x2*x2){
            System.out.println("Точки попадают в область три");
        }
        else{
            System.out.println("Точки не попадают в область три");
        }
    }
}
