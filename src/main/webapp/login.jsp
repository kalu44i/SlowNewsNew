<%--
  Created by IntelliJ IDEA.
  User: NickVeremeichyk
  Date: 7/13/15
  Time: 7:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="files/css/styles.css" rel="stylesheet" type="text/css">
    <link href="files/css/menu.css" rel="stylesheet" type="text/css">
    <link href="files/css/newsContainer.css" rel="stylesheet" type="text/css">
    <link href="files/css/checkbox.css" rel="stylesheet" type="text/css">
    <link href="files/css/styles_login.css" rel="stylesheet" type="text/css">
    <link href="files/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    </head>
<body>
<div class="top_panel"></div>
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="text-center">Login</h1>
            </div>
            <div class="modal-body">
                <form class="form col-md-12 center-block" method="post">
                    <div class="form-group">
                        <input type="text" class="form-control input-lg" placeholder="Email" name="username">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control input-lg" placeholder="Password" name="password">
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary btn-lg btn-block" type="submit">Sign In</button>
                        <span class="pull-right"><a href="/register">Register</a></span><span><a href="#">Need help?</a></span>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
            </div>
        </div>
    </div>
</div>
</body>
