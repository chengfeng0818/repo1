  package stu;

import java.util.List;
/**
 * ������
 * @author ��ɵ���
 *
 */

public interface StudentService {
	public int addstu();
	public int deletestu();
	public int updatestu();
	public student selectstu();
	public List<student> selectstuall();
}
