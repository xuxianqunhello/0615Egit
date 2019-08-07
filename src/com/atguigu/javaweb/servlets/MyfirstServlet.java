package com.atguigu.javaweb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyfirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyfirstServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		response.setContentType("text/html;charset=utf-8");
		if("张三".equals(username)&&"123456".equals(password)) {
			response.getWriter().print("上海滩");
			response.getWriter().print("上海滩");
			response.getWriter().print("老徐");
			response.getWriter().print("老徐");
			response.getWriter().print("老徐");
		}else {
			response.getWriter().print("用户名或密码错误,hahahaha");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
