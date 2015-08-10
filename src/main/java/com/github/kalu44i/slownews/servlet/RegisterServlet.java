package com.github.kalu44i.slownews.servlet;

import com.github.kalu44i.slownews.Entities.User;
import com.github.kalu44i.slownews.beans.Container;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by NickVeremeichyk on 8/2/15.
 */
public class RegisterServlet extends HttpServlet {
    private EntityManager entityManager = Persistence.createEntityManagerFactory("entityManager").createEntityManager();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        addNewUser(username, password);
        Container.getContainer().getAuthUsers().add(req.getSession().getId());
        resp.sendRedirect("/login");
    }


    /**
     * Add new user to Database with the username and password
     * @param usernameNew
     * @param passwordNew
     */
    private void addNewUser(String usernameNew, String passwordNew) {
        entityManager.getTransaction().begin();
        entityManager.persist(new User(usernameNew, passwordNew));
        entityManager.getTransaction().commit();
    }

}
