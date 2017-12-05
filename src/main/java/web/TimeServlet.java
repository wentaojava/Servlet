package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ʹ��request������������
		  //1.������
		System.out.println("Э������:"+request.getProtocol());
		System.out.println("����·��:"+request.getServletPath());
		System.out.println("����ʽ:"+request.getMethod());
		  //2.��Ϣͷ:���ռ�ֵ�Է�ʽ�洢
		Enumeration<String> e=request.getHeaderNames();
		while(e.hasMoreElements()) {
			String key=e.nextElement();
			String value=request.getHeader(key);
			System.out.println(key+":"+value);
		}
		  //3.ʵ������
		
                 Date date=new Date();		
                 SimpleDateFormat sdf=new SimpleDateFormat("HH:MM:ss");
                 String now=sdf.format(date);
                 //������������ص���ʲô���͵�����
                 response.setContentType("text/html");
                 //��ȡ�������ָ���Ŀ���������
                 PrintWriter w=response.getWriter();
                 //��̬ƴ��ҳ
                 w.println("<p>"+now+"</p>");
                 w.close();
	}

}
