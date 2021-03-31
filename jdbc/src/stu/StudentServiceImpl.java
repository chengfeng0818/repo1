package stu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{
	Connection con=null;
	ResultSet rs=null;
	
	public int addstu() {
		int a=0;
		try {
			con=jdbc.getcon();
			String sql="INSERT INTO student(sex,age,gid)\r\n" + 
					"VALUES(1,3,2)";
			//5.ִ��sql��������Ӧ����
			Statement st=con.createStatement();
			a=st.executeUpdate(sql);
			//6.�ر�����
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
		
	}

	@Override
	public int deletestu() {
		int a=0;
		try {
			con=jdbc.getcon();
			String sql="DELETE FROM student WHERE id=2";
			//5.ִ��sql��������Ӧ����,���ӣ��޸ģ�ɾ����������executeupdate����ѯ��executequery
			Statement st=con.createStatement();
			a=st.executeUpdate(sql);
			//6.�ر�����
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public int updatestu() {
		int a=0;
		try {
			con=jdbc.getcon();
			String sql="UPDATE student SET sex=2 WHERE id=5";
			//5.ִ��sql��������Ӧ����
			Statement st=con.createStatement();
			a=st.executeUpdate(sql);
			//6.�ر�����
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public student selectstu() {
		student stu=null;
		try {
			con=jdbc.getcon();
			String sql="SELECT*FROM student WHERE id=6";
			//5.ִ��sql��������Ӧ����
			Statement st=con.createStatement();
			//����select�����executequery
			rs=st.executeQuery(sql);
			//6.�ر�����
			st.close();
			con.close();
			if(rs.next()) {
				stu=new student(rs.getInt("id"), rs.getInt("sex"), rs.getInt("age"), rs.getInt("gid"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}

	@Override
	public List<student> selectstuall() {
		List<student> liststu=new ArrayList<student>();
		try {
			con=jdbc.getcon();
			String sql="select * from student";
			//5:ִ��sql �� ������Ӧ������
			Statement st=con.createStatement();
			//����select�����executeQueryȥִ��
			rs=st.executeQuery(sql);
			while(rs.next()){
			student stu=new student(rs.getInt("id"),rs.getInt("sex"), rs.getInt("age"), rs.getInt("gid"));
			liststu.add(stu);
			}
			//6���ر�����
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liststu;
	}
}
