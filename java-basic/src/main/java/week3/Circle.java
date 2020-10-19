package week3;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/19
 **/
public class Circle extends Point{
    private int r;

   public Circle(){
       System.out.println("园被初始化");
   }

   public Circle(int x,int y,int r){
       super(x,y);
       this.r = r;
       System.out.println("带参数的园被初始化");
   }

    @Override
    public void print() {
        super.print();
        System.out.println("圆的面积：" + Math.PI * r * r);
    }

    public double getArea(){
       return Math.PI * r * r;
    }

    public boolean exit(Circle c1,Point p1){
       if (Math.pow(p1.getX()-c1.getX(),2) + Math.pow(p1.getY()-c1.getY(),2) <= c1.r*c1.r){
           return true;
       }else {
           return false;
       }
    }
}
