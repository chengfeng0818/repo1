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
		System.out.println("1.���");
		System.out.println("2.ɾ��");
		System.out.println("3.�޸�");
		System.out.println("4.������ѯ");
		System.out.println("5.��ѯȫ��");
		System.out.println("6��ѡ��");
		int m=input.nextInt();
		switch(m) {
		case 1: 
			int a=ss.addstu();
			if(a>0) {
				System.out.println("��ӳɹ�");
			}
			else {
				System.out.println("���ʧ��");
			}
			menu();
			break;
		case 2: 
			int b=ss.deletestu();
			if(b>0) {
				System.out.println("ɾ���ɹ�");
			}
			else {
				System.out.println("ɾ��ʧ��");
			}
			menu();
			break;
		case 3:
			int c=ss.updatestu();
			if(c>0) {
				System.out.println("�޸ĳɹ�");
			}
			else {
				System.out.println("�޸�ʧ��");
			}
			menu();
			break;
		case 4:
			menu();
			break;
		case 5:
			List<student> list=ss.selectstuall();
			System.out.println("���\t�Ա�\t����\t�꼶");
			for(int i=0;i<list.size();i++) {
			student s=new student(list.get(i).getId(), list.get(i).getSex(), list.get(i).getAge(), list.get(i).getGid());
			System.out.println(s.getId()+"\t"+s.getSex()+"\t"+s.getAge()+"\t"+s.getGid());		
			}
			menu();
			break;
		
		}
	}
	

}
