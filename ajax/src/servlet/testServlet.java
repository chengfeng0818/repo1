package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/testServlet")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("come in");
	String count=request.getParameter("count");
	int counts=Integer.parseInt(count);
	PrintWriter out=response.getWriter(); 
	out.print(counts+1);
	out.flush();
	out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String names="zs";
		String name=request.getParameter("name");
		String msg="";
		if(names.equals(name)) {
			//˵���Ѿ�ע�����
		 	msg="sb";
			
		}else {
			//û��ע���
			msg="cg";
		}
		//�������ݸ�ҳ��
		PrintWriter out=response.getWriter();
		out.print(msg);
		out.flush();
		out.close();
		
	} 

}
