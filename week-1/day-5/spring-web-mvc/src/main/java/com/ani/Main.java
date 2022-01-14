package com.ani;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import java.io.File;

public class Main {

    public static void main(String[] args) throws LifecycleException, ServletException {

        String webAppDirLocation = "target/";
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8081);

        StandardContext ctx = (StandardContext) tomcat.addWebapp(
                "/springmvc",
                new File(webAppDirLocation).getAbsolutePath()
        );

        tomcat.start();
        tomcat.getServer().await();
    }
}
