package week3;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/19
 **/
public class CircleApp {
    public static void main(String[] args) {
//       Point point  = new Point(10,20);
//       Circle circle = new Circle(10,20,3);
//       point.print();
//       circle.print();

//       Cylinder cylinder = new Cylinder(10,20,3,5);
//       cylinder.print();

        /*Point p1 = new Point(2,5);
        Point p2 = new Point(2,6);
        System.out.println(p1.distance(p1, p2));*/

        Circle c1 = new Circle(0,0,5);
        Point p3 = new Point(1,1);
        Point p4 = new Point(6,1);
        System.out.println(c1.exit(c1, p3));
        System.out.println(c1.exit(c1, p4));
    }
}
