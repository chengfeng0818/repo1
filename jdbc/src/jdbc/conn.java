  package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class conn {
	

	public static void main(String[] args) {
		//1.导入驱动包
		//2.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//3.创建连接
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			//4.编写sql
			String sql="INSERT INTO student(sex,age,gid)\r\n" + 
					"VALUES(1,3,2)";
			//5.执行sql并返回相应数据
			Statement st=con.createStatement();
			int a=st.executeUpdate(sql);
			//6.关闭连接
			st.close();
			con.close();
			if(a>0) {
				System.out.println("成功");
			}
			else{
				System.out.println("失败");
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
