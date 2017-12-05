package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 Date date=new Date();		
                 SimpleDateFormat sdf=new SimpleDateFormat("HH:MM:ss");
                 String now=sdf.format(date);
                 //告诉浏览器返回的是什么类型的内容
                 response.setContentType("text/html");
                 //获取输出流，指向的目标是浏览器
                 PrintWriter w=response.getWriter();
                 //动态拼网页
                 w.println("<p>"+now+"</p>");
                 w.close();
	}

}
