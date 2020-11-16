package week6.service;

import java.sql.*;

/**
 * @ClassName LoginService
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/9
 **/
public interface LoginService{

    boolean login(String account , String password1) throws SQLException;
}
