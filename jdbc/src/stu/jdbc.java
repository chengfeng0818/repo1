package stu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 连接数据库的工具类
 * @author 会飞的鱼
 *
 */
public class jdbc {
	 static Connection con=null;
	public static Connection getcon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//3.创建连接
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

}
