package com.github.kalu44i.slownews.servlet;

import com.github.kalu44i.slownews.beans.Container;
import com.github.kalu44i.slownews.jaxbModels.RssType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.ClientBuilder;
import java.io.IOException;

/**
 * Created by NickVeremeichyk on 7/13/15.
 */
public class ArchiveServlet extends HttpServlet {
    String session = null;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        session = req.getSession().getId();


        if (Container.getContainer().getAuthUsers().contains(session)) {

            req.setAttribute("achievedItems", ItemsContainer.getAchievedItems());
            RequestDispatcher requestDispatcher;
            
            requestDispatcher = req.getRequestDispatcher("/archive.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            resp.sendRedirect("/login");
        }
    }
}
