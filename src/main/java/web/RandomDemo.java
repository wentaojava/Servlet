package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RandomDemo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random randomNum=new Random();
		int num=randomNum.nextInt(100);
		
		 response.setContentType("text/html");
         //获取输出流，指向的目标是浏览器
         PrintWriter w=response.getWriter();
         //动态拼网页
         w.println("<p>"+num+"</p>");
         w.close();
		
	}

}
