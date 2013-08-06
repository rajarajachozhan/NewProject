package com.o2.test;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 06/08/13
 * Time: 10:50
 * To change this template use File | Settings | File Templates.
 */
public class AdminProject {
    private static AdminProject ourInstance = new AdminProject();

    public static AdminProject getInstance() {
        return ourInstance;
    }

    private AdminProject() {
    }
}
