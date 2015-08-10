package com.github.kalu44i.slownews.servlet;

import com.github.kalu44i.slownews.beans.Container;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by NickVeremeichyk on 7/26/15.
 */
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sessionId = req.getSession().getId();
        Container.getContainer().getAuthUsers().remove(sessionId);

        resp.sendRedirect("/login");

    }
}
