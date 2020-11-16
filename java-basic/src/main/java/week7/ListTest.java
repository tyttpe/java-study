package week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * @ClassName ListTest
 * @Description list接口测试程序
 * @Author TYTTPE
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
        // 创建一个list接口实现类的对象，泛型为String
        ArrayList<String> list = new ArrayList<>();
        // 增加三个元素
        list.add("java");
        list.add("js");
        list.add("java");
        // 随机取出list中的某个元素
        Random random = new Random();
        int rd = random.nextInt(2)+1;
        System.out.println(list.get(rd));

        System.out.println("用for循环遍历list");
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // 用lambda表达式遍历list
        System.out.println("用lambda表达式遍历list");
        list.forEach(s -> System.out.println(s));
        System.out.println("使用Lambda的方法引用来遍历list");
        list.forEach(System.out::print);
    }
}
