package week5;

/**
 * @ClassName MyException
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/2
 **/
public class MyException extends Exception{
    private String msg;

    public MyException() {
        super();
    }

    public MyException(String msg) {
        super();
        this.msg = msg;
    }

    public String showMsg(){
        return this.msg = msg;
    }
}
