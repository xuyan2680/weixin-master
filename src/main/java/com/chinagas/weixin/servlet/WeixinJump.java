package com.chinagas.weixin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinagas.weixin.po.Oa2AccessToken;
import com.chinagas.weixin.util.WeixinUtil;


public class WeixinJump extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String code = req.getParameter("code");
		Oa2AccessToken ot = WeixinUtil.getOa2AccessToken(code);
		resp.sendRedirect("jump.jsp?openid="+ot.getOpenid());
	}
}
