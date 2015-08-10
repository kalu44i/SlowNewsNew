package com.github.kalu44i.slownews.servlet;


import com.github.kalu44i.slownews.beans.Container;
import com.github.kalu44i.slownews.jaxbModels.ItemType;
import com.github.kalu44i.slownews.jaxbModels.RssType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NickVeremeichyk on 7/13/15.
 */
public class IndexServlet extends HttpServlet {
    Client client = null;
    WebTarget target = null;
    String session = null;
    Response response = null;
    RssType rss = null;
    List<ItemType> items = null;
    List<ItemType> achievedItems = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        session = req.getSession().getId();

        if (Container.getContainer().getAuthUsers().contains(session)) {
            ItemsContainer.setItems(getNews("http://www.forbes.com/most-popular/feed/"));
            req.setAttribute("items", ItemsContainer.getItems());

            RequestDispatcher requestDispatcher;
            requestDispatcher = req.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            resp.sendRedirect("/login");
        }

    }
    @Override
    //TODO Save
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        achievedItems = new ArrayList<ItemType>();
        items = ItemsContainer.getItems();

        String[] string = req.getParameterValues("news");
        for (String s : string) {
            achievedItems.add(items.get(Integer.parseInt(s)));
        }
        ItemsContainer.setAchievedItems(achievedItems);

        resp.sendRedirect("/archive");

    }

    /**
     * Get news from URL using Jersey
     * @param url
     * @return
     */
    private List<ItemType> getNews(String url) {
        client = ClientBuilder.newClient();
        target = client.target(url);
        response = target.request().get();
        rss = response.readEntity(RssType.class);
        return rss.getChannel().getItem();
    }
}
