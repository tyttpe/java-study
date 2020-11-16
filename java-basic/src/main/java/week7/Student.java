package week7;

import lombok.*;

/**
 * @ClassName Student
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/16
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Builder
public class Student implements Comparable<Student>{
    private String name;
    private Integer age;

    @Override
    public int compareTo(Student o) {
        return o.getAge().compareTo(this.getAge());
    }
}
