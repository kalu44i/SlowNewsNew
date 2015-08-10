package com.github.kalu44i.slownews.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NickVeremeichyk on 7/19/15.
 */
public class Container {
    List<String> authUsers;
    List<String> registeredUsers;
    static Container container;

    public Container() {
        this.authUsers = new ArrayList<String>();
    }

    static {
        container = new Container();
    }

    public static Container getContainer() {
        return container;
    }

    public List<String> getAuthUsers() {
        return authUsers;
    }

    public void addAuthUser(String user) {
        authUsers.add(user);
    }

    public void deleteAuthUser(String user) {
        authUsers.remove(user);
    }

    public List<String> getRegisteredUsers() {
        return registeredUsers;
    }

    public void addRegisteredUser(String user) {
        registeredUsers.add(user);
    }

}
