package com.ani.web;


import com.ani.config.MvcConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        var ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MvcConfig.class);
        ctx.refresh();
        ctx.setServletContext(servletContext);

        servletContext.addListener(new ContextLoaderListener(ctx));

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
