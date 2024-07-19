
package com.groupeisi.companies.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.groupeisi.companies.dao.AccountUserDao;
import com.groupeisi.companies.dto.AccountUserDto;
import com.groupeisi.companies.entities.AccountUserEntity;
import com.groupeisi.companies.service.AccountUserService;
import com.groupeisi.companies.service.IAccountUserService;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet(name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IAccountUserService accountUserService = new AccountUserService();

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

		Optional<List<AccountUserDto>> users = accountUserService.findAll();
		if (users.isPresent()) {
			request.setAttribute("userList", users.get());
		} else {
			request.setAttribute("userList", new ArrayList<AccountUserEntity>());
		}

		request.getRequestDispatcher("WEB-INF/jsp/admin/users.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean etat = Boolean.valueOf(request.getParameter("etat"));

		AccountUserDto accountUserDto = new AccountUserDto();

		accountUserDto.setEmail(email);
		accountUserDto.setState(etat);
		accountUserDto.setPassword(password);
		try {
			accountUserService.save(accountUserDto);
		} catch (Exception e) {

		}

		doGet(request, response);
	}

}
