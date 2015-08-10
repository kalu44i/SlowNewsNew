<%@ page import="java.util.List" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: NickVeremeichyk
  Date: 7/13/15
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp"%>
<div class="top_panel_save">
    <div class="menu_save">
        <a class="delete" id ="delete"><span>Delete</span></a>
        <a class="cancel" id="cancel"><span>Cancel</span></a>
    </div>
</div>
<div class="top_panel">

    <div class="menu">
        <a href="index"><span>Home</span></a>
        <a href="archive" ><span>Archive</span></a>
        <%
            String sessionId = request.getSession().getId();
            boolean logined = false;
            String loginLabel = "Login";
            String command = "login";
            if (Container.getContainer().getAuthUsers().contains(sessionId)) {
                logined = true;
            }

            if (logined) {
                loginLabel = "Logout";
                command = "logout";
            }
        %>
        <a href="<%=command%>" class="login"><span><%=loginLabel%></span></a>
    </div>
</div>
<div>
    <div class="news_container">
        <div class="news_list">
            <%--<c:set value="${requestScope.get('users')}" var="users"></c:set>--%>
            <!-- a news -->
            <!--suppress CheckTagEmptyBody -->
            <form method="post" class="saveToArchive" id="saveToArchive">
                <c:forEach items="${achievedItems}" var="item">
                    <a class="news-link" href=${item.getLink()}>
                        <div class="news">
                            <div class="checkbox_container">

                                <input type="checkbox" class="checkbox" id="checkbox${achievedItems.indexOf(item)}" value="${achievedItems.indexOf(item)}" name="news"/>
                                <label for="checkbox${achievedItems.indexOf(item)}"></label>
                            </div>
                            <div class="info_container">
                                <div class="head_container"><c:out value="${item.getTitle()}">Title</c:out></div>
                                <div class="data_container"><c:out value="${item.getPubDate()}">PubDate</c:out></div>
                                <div class="message_container"><c:out value="${item.getDescription()}">Desc</c:out></div>
                            </div>
                        </div>
                    </a>
                </c:forEach>
            </form>
            <!-- end a news -->
        </div>

    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="files/js/1.js"></script>
</body>
</html>
