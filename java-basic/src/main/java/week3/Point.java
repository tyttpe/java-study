package week3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Target;

/**
 * @ClassName Point
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/19
 **/
@Data
public class Point {
    private Integer x;
    private Integer y;

    public Point(){
        System.out.println("点被初始化");
    }

    public Point(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("带参数的点被初始化");
    }

    public void print(){
        System.out.println("横坐标:" + this.x + ",纵坐标:" + this.y);
    }

    public double distance(Point a,Point b){
        double total = Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
        return total;
    }
}
