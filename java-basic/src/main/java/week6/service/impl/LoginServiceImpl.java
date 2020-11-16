package week6.service.impl;

import week6.dao.User;
import week6.service.LoginService;
import week6.utils.DB;

import java.sql.SQLException;

/**
 * @ClassName LoginServiceImpl
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/16
 **/
public class LoginServiceImpl implements LoginService {
    String name = "";
    String pwd = "";

    @Override
    public boolean login(String account, String password1) throws SQLException {
        DB db = new DB();
        User user = db.select(account,password1);
        name = user.getName();
        pwd = user.getPassword();
        if (account.equals(name) && password1.equals(pwd)){
            return true;
        }else{
            return false;
        }
    }
}
