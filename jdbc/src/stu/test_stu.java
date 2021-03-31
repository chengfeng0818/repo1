package stu;

import java.util.List;
import java.util.Scanner;

public class test_stu {
	Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		test_stu st=new test_stu();
		st.menu();
	}
	StudentService ss=new StudentServiceImpl();
	public void menu() {
		System.out.println("1.添加");
		System.out.println("2.删除");
		System.out.println("3.修改");
		System.out.println("4.单个查询");
		System.out.println("5.查询全部");
		System.out.println("6请选择：");
		int m=input.nextInt();
		switch(m) {
		case 1: 
			int a=ss.addstu();
			if(a>0) {
				System.out.println("添加成功");
			}
			else {
				System.out.println("添加失败");
			}
			menu();
			break;
		case 2: 
			int b=ss.deletestu();
			if(b>0) {
				System.out.println("删除成功");
			}
			else {
				System.out.println("删除失败");
			}
			menu();
			break;
		case 3:
			int c=ss.updatestu();
			if(c>0) {
				System.out.println("修改成功");
			}
			else {
				System.out.println("修改失败");
			}
			menu();
			break;
		case 4:
			menu();
			break;
		case 5:
			List<student> list=ss.selectstuall();
			System.out.println("编号\t性别\t年龄\t年级");
			for(int i=0;i<list.size();i++) {
			student s=new student(list.get(i).getId(), list.get(i).getSex(), list.get(i).getAge(), list.get(i).getGid());
			System.out.println(s.getId()+"\t"+s.getSex()+"\t"+s.getAge()+"\t"+s.getGid());		
			}
			menu();
			break;
		
		}
	}
	

}
