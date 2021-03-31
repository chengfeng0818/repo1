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
			//5.执行sql并返回相应数据
			Statement st=con.createStatement();
			a=st.executeUpdate(sql);
			//6.关闭连接
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
			//5.执行sql并返回相应数据,增加，修改，删除都可以用executeupdate，查询用executequery
			Statement st=con.createStatement();
			a=st.executeUpdate(sql);
			//6.关闭连接
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
			//5.执行sql并返回相应数据
			Statement st=con.createStatement();
			a=st.executeUpdate(sql);
			//6.关闭连接
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
			//5.执行sql并返回相应数据
			Statement st=con.createStatement();
			//遇到select语句用executequery
			rs=st.executeQuery(sql);
			//6.关闭连接
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
			//5:执行sql 并 返回相应的数据
			Statement st=con.createStatement();
			//遇到select语句用executeQuery去执行
			rs=st.executeQuery(sql);
			while(rs.next()){
			student stu=new student(rs.getInt("id"),rs.getInt("sex"), rs.getInt("age"), rs.getInt("gid"));
			liststu.add(stu);
			}
			//6：关闭连接
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liststu;
	}
}
