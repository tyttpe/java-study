package week6.utils;

import week6.dao.User;

import java.sql.*;

/**
 * @ClassName DB
 * @Description
 * @Author TYTTPE
 * @Date 2020/11/9
 **/
public class DB {
    static Connection con;
    static String driver="com.mysql.jdbc.Driver";
    static String url="jdbc:mysql://localhost:3306/db_spring?serverTimezone=GMT%2B8";
    static String user="root";
    static String password="root";

    private static Connection getCon(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            System.out.println("数据库连接失败");
        }
        return con;
    }

    public Integer selectAll() {
        Connection conn = getCon();
        String sql = "select * from t_user";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                    if ((i == 2) && (rs.getString(i).length() < 8)) {
                        System.out.print("\t");
                    }
                }
                System.out.println("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User select(String account , String password1) throws SQLException{
        Connection conn = getCon();
        String sql="select * from t_user where name = '" + account +  "' AND password = '" + password1 + "';";
        User user = new User();
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            String password = resultSet.getString("password");
            user = new User(name,password);
        }
        return user;
    }
}
