package javax.portlet.tck.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {

		ServletContext servletContext = servletContextEvent.getServletContext();

		String role = servletContext.getInitParameter("javax.portlet.portal.SECURITY_ROLE");

		System.err.println("!@#$ MyServletContextListener javax.portlet.portal.SECURITY_ROLE=" + role);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

	}
}
