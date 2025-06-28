package com.codeLine.library_management_system.Controller;

import java.io.IOException;

import com.codeLine.library_management_system.entity.User;
import com.codeLine.library_management_system.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;
	 
    private UserService userService = new UserService();

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	String action = request.getParameter("action");

        if ("register".equalsIgnoreCase(action)) {
            handleRegistration(request, response);
        } else if ("login".equalsIgnoreCase(action)) {
            handleLogin(request, response);
        } else {
            response.sendRedirect("error.jsp");
        }
    }

    private void handleRegistration(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phno = request.getParameter("phno");
        String password = request.getParameter("password");
        String address = request.getParameter("address");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPhno(phno);
        user.setPassword(password);
        user.setAdress(address);

        User registeredUser = userService.registerUserService(user);

        if (registeredUser != null) {
            response.sendRedirect("login.jsp");
        } else {
            request.setAttribute("error", "Registration failed. Please try again.");
            request.getRequestDispatcher("registration.jsp").forward(request, response);
        }
    }

    private void handleLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = userService.loginUserService(email, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", user);
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("error", "Invalid email or password.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
