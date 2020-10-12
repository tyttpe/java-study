package week2;

import java.util.Date;

/**
 * @ClassName test
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/12
 **/
public class test {
    public static void main(String[] args) {
        Book book1 = new Book("倚天屠龙记",10,new Date());
        Book book2 = new Book("天龙八部",15,new Date());
        Book book3 = new Book("射雕英雄传",20,new Date());
        Book book4 = new Book("碧血剑",25,new Date());

        Phone phone1 = new Phone("vovo10",2000);
        Phone phoen2 = new Phone("iphone5",5000);
        Phone phoen3 = new Phone("iphone18",500000);

        Student student1 = new Student("10086","张三","male",phoen2,new Book[]{
                book1,book2,book3
        });
        Student student2 = new Student("10087","李四","famale",phone1,new Book[]{
                book1,book4
        });
        Student student3 = new Student("10088","王二","male",phoen3,new Book[]{
                book1,book4
        });

        Group g1 = new Group("DC",new Student[]{
                student1,student2});
        Group g2 = new Group("Marvel",new Student[]{
                student3});

        System.out.println(g1);
        System.out.println("****************************");
        Student[] students = g1.getStudents();
        for (Student student : students) {
            System.out.println(student.getStuentName());
        }

        
    }
}
