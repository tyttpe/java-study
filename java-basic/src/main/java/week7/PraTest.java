package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PraTest
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/16
 **/
public class PraTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("tom", "CoreJava");
        map.put("john", "oracle");
        map.put("susan","oracle");
        map.put("jerry","JDBC");
        map.put("jim","Linux");
        map.put("kevin","jsp");
        map.put("Lucy","jsp");

        System.out.println("1");
        map.put("allen","JDBC");

        System.out.println("2");
        //map.replace("Lucy", "CoreJava");
        map.put("Lucy","CoreJava");

        System.out.println("3.1");
        for (String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key + " teach " + value);
        }

        System.out.println("3.2");
        map.forEach((key,value) -> System.out.println(key + " teach " + value));

        for (String key : map.keySet()){
            String value = map.get(key);
            if ("JDBC".equals(value)){
                System.out.println("这是教JDBC的老师" + key);
            }
        }

        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student("Alen", 20));
        list1.add(new Student("Jack",21));
        list2.add(new Student("Alice", 19));
        list2.add(new Student("Mary", 22));
        Map<String,List<Student>> map1 = new HashMap<>();
        map1.put("男生", list1);
        map1.put("女生", list2);
        System.out.println("***********按性别输出集合的结果***********");
        for (Map.Entry<String,List<Student>> entry : map1.entrySet()){
            System.out.println(entry.getKey());
            List<Student> list = entry.getValue();
            // Lambda遍历内层循环
            list.forEach(student -> {
                System.out.println(student.getName() + "\t" + student.getAge());
                System.out.println();
            });
        }
    }
}
