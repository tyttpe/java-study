package week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @ClassName Book
 * @Description TODO
 * @Author TYTTPE
 * @Date 2020/10/12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private Integer price;
    private Date pulishDate;

    @Override
    public String toString() {
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String p = simpleFormatter.format(new Date());
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pulishDate=" + p +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book("java",122,new Date());
        System.out.println(book);
    }
}
