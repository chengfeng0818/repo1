package stu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * �������ݿ�Ĺ�����
 * @author ��ɵ���
 *
 */
public class jdbc {
	 static Connection con=null;
	public static Connection getcon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//3.��������
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
