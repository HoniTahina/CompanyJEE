package com.groupeisi.companies.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupeisi.companies.dto.AccountUserDto;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet(name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<AccountUserDto> users = new ArrayList<AccountUserDto>();
		users.add(new AccountUserDto(1L, "seck@gmail.com", true));
		users.add(new AccountUserDto(2L, "ngor@gmail.com", false));
		users.add(new AccountUserDto(3L, "cherif@gmail.com", true));
		users.add(new AccountUserDto(4L, "seydou@gmail.com", false));
		request.setAttribute("userList", users);

		request.getRequestDispatcher("WEB-INF/jsp/admin/users.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
