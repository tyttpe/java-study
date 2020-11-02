package week4;

/**
 * @ClassName BaseEmployee
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {

       public void print(){
           System.out.println("this is an abstract class.");
       }

       /*
       * 发工资
       * @return int
       * */
       public abstract int getSalary();
}
