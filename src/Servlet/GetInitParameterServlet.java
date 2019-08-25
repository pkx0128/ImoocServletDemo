package Servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


public class GetInitParameterServlet extends HttpServlet {
	private String username;
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public void doGet(HttpServletRequest res,HttpServletResponse resp) throws ServletException,IOException{
		
//		处理中文乱码
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.print("这是访问获取初始化参数演示Servlet实例username："+username+" password："+password);
		
		
	}
	
	public void doPost(HttpServletRequest res,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(res, resp);
	}
	
	public void init() {
		this.setUsername(this.getInitParameter("username"));
		this.setPassword(this.getInitParameter("password"));
	}

}
