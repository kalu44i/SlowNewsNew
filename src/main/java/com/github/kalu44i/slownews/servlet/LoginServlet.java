package com.github.kalu44i.slownews.servlet;

import com.github.kalu44i.slownews.beans.Container;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by NickVeremeichyk on 7/13/15.
 */
public class LoginServlet extends HttpServlet {
    private EntityManager entityManager = Persistence.createEntityManagerFactory("entityManager").createEntityManager();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sessionId = req.getSession().getId();
        if (Container.getContainer().getAuthUsers() != null && Container.getContainer().getAuthUsers().contains(sessionId)) {
            resp.sendRedirect("/index");
        } else {
            RequestDispatcher requestDispatcher;
            requestDispatcher = req.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (isRegisteredUser(username, password)) {
            String sessionId = req.getSession().getId();
            Container.getContainer().addAuthUser(sessionId);
            resp.sendRedirect("/index");
        } else {
            resp.sendRedirect("/register");
        }

    }

    /**
     * Check if loggining user is a registered user
     * @param username
     * @return
     */
    private boolean isRegisteredUser(String username, String password) {
        Query query = entityManager.createQuery("select id from User where username='" + username +"'");
        if (query.getResultList().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

}
