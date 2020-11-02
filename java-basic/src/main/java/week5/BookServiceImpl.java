package week5;

/**
 * @ClassName BookServiceImpl
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/2
 **/
public class BookServiceImpl implements BookService{

    @Override
    public boolean BookOnShelf(Book book) throws MyException {
        String name = book.getBookName();
        int price = book.getPrice();
        String num = book.getISBN();
        boolean result = false;
        if (!num.matches("\\d+") || num.length() != 13){
            throw new MyException(name + "ISBN不为13位数字");
        }else if (name.contains("暴力")  || name.contains("恐怖")){
            throw new MyException(name + "书名中不能含有暴力、恐怖元素");
        }else if (price > 100){
            throw new MyException(name + "价格超过了100元");
        }else {
            result = true;
        }
        return result;
    }
}
