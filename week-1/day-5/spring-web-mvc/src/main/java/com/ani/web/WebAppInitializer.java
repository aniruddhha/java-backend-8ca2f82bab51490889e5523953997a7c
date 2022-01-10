package com.ani.web;


import com.ani.config.MvcConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        var ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MvcConfig.class);
        ctx.setServletContext(servletContext);
        ctx.scan("com.ani");

        var servlet = servletContext.addServlet(
                "mvc",
                new DispatcherServlet(
                        new GenericWebApplicationContext()
                )
        );
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
