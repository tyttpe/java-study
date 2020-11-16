package week7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description Map测试接口
 * @Author TYTTPE
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(8);
        map.put("中国","北京");
        map.put("日本","东京");
        map.put("印度","新德里");

        // for循环
        for (String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key + "的首都：" + value);
        }

        // 迭代器
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "的首都：" + entry.getValue());
        }

        // 通过遍历Map的entrySet，遍历key和value
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "的首都：" + entry.getValue());
        }

        // 通过遍历Map的values，只能遍历value，不能遍历key
        for (String value : map.values()){
            System.out.println(value);
        }

        // lambda表达式
        map.forEach((key,value) -> System.out.println(key + "的首都：" + value) );
    }
}
