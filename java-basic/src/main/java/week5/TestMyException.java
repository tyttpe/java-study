package week5;

/**
 * @ClassName TestMyException
 * @Description 测试自定义异常
 * @Author TYTTPE
 * @Date 2020/11/2
 **/
public class TestMyException {
    public static void main(String[] args) {
        Book[] books = {new Book("0123456789101","Java从入门到精通",99),
                new Book("1234567892345","js从入门到精通暴力",15),
                new Book("9658745210235","sql从入门到精通",101)};
        BookServiceImpl bs = new BookServiceImpl();

        for (Book book:books){
            try {
                boolean result = bs.BookOnShelf(book);
                if (result){
                    System.out.println("成功上架！");
                }
            } catch (MyException e) {
                System.err.println(e.showMsg());
            }
        }


    }
}
