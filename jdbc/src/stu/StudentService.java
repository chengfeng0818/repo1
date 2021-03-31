  package stu;

import java.util.List;
/**
 * 功能类
 * @author 会飞的鱼
 *
 */

public interface StudentService {
	public int addstu();
	public int deletestu();
	public int updatestu();
	public student selectstu();
	public List<student> selectstuall();
}
