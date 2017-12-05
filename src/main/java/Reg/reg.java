package Reg;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类的描述：
 *
 * @author wentao
 * @time Create in 22:21  2017/12/5 0002
 * @copyright Ltd.copyright 2015-2025
 */
public class reg extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name=req.getParameter("userAccout");
       String pwd=req.getParameter("pwd");
       String sex=req.getParameter("sex");
       String[] checkbox=req.getParameterValues("xingqu");

        resp.setContentType("text/html");
        //获取输出流，指向的目标是浏览器
        PrintWriter w=resp.getWriter();
        //动态拼网页
        w.println("<p>"+name+"</p>");
        w.println("<p>"+pwd+"</p>");
        w.println("<p>"+sex+"</p>");
        for(int i=0;i<checkbox.length;i++){
            w.println("<p>"+checkbox[i]+"</p>");
        }
        w.close();
    }
}
