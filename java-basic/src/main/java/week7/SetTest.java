package week7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest
 * @Description Set接口测试
 * @Author TYTTPE
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
        Student s1 = Student.builder().name("a").age(18).build();
        Student s2 = Student.builder().name("c").age(17).build();
        Student s3 = Student.builder().name("b").age(22).build();
        Set<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

        /*Set<String> set = new TreeSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        // 使用for循环
        for (String s : set){
            System.out.println(s);
        }

        // 使用迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 使用lambda表达式
        set.forEach(System.out::print);

        System.out.println("HashSet例子");
        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        // 使用for循环
        Object[] array = set1.toArray();
        for (Object o : array){
            System.out.println(o);
        }

        // 使用迭代器
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        // 使用lambda表达式
        set1.forEach(System.out::print);*/
    }
}
