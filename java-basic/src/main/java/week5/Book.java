package week5;

/**
 * @ClassName Book
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/2
 **/
public class Book {
    private String ISBN;
    private String bookName;
    private Integer price;

    public Book(String ISBN, String bookName, Integer price) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }

    public Book() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
