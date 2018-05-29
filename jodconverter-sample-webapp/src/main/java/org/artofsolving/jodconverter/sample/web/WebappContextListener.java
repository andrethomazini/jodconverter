package org.artofsolving.jodconverter.sample.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebappContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
        try {
            WebappContext.init(event.getServletContext());
        } catch (Exception e) {}
	}

	public void contextDestroyed(ServletContextEvent event) {
		WebappContext.destroy(event.getServletContext());
	}

}
