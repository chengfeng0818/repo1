  package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class conn {
	

	public static void main(String[] args) {
		//1.����������
		//2.��������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//3.��������
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			//4.��дsql
			String sql="INSERT INTO student(sex,age,gid)\r\n" + 
					"VALUES(1,3,2)";
			//5.ִ��sql��������Ӧ����
			Statement st=con.createStatement();
			int a=st.executeUpdate(sql);
			//6.�ر�����
			st.close();
			con.close();
			if(a>0) {
				System.out.println("�ɹ�");
			}
			else{
				System.out.println("ʧ��");
				
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
