package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        // TODO: show the registration form
        try {
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");


        // TODO: ensure the submitted information is valid
        boolean inputError = username.isEmpty() || email.isEmpty() || password.isEmpty() || (!password.equals(passwordConfirmation));

        if (inputError) {
            response.sendRedirect("/register");
        } else {
        // TODO: create a new user based off of the submitted information
            User user = new User(0, username, email, password);
            Long id = DaoFactory.getUsersDao().insert(user);
            user.setId(id);

        // TODO: if a user was successfully created, send them to their profile
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
    }
    }
}