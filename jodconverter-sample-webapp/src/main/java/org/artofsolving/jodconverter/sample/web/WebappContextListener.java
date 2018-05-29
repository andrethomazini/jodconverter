package org.artofsolving.jodconverter.sample.web;

import com.sun.star.lang.*;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebappContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
        try {
            WebappContext.init(event.getServletContext());
        } catch(com.sun.star.lang.IllegalArgumentException e) {}

	}

	public void contextDestroyed(ServletContextEvent event) {
		WebappContext.destroy(event.getServletContext());
	}

}
