package week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Student
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/12
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String id;
    private String StuentName;
    private String gender;
    private Phone phone;
    private Book[] books;
}
