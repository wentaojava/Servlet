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
		//使用request接受请求数据
		  //1.请求行
		System.out.println("协议类型:"+request.getProtocol());
		System.out.println("访问路径:"+request.getServletPath());
		System.out.println("请求方式:"+request.getMethod());
		  //2.消息头:按照键值对方式存储
		Enumeration<String> e=request.getHeaderNames();
		while(e.hasMoreElements()) {
			String key=e.nextElement();
			String value=request.getHeader(key);
			System.out.println(key+":"+value);
		}
		  //3.实体内容
		
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
