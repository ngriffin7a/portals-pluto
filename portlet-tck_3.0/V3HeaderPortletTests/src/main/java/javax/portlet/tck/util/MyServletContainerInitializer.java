package javax.portlet.tck.util;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

public class MyServletContainerInitializer implements
	ServletContainerInitializer {

	@Override
	public void onStartup(
		Set<Class<?>> set, ServletContext servletContext)
		throws ServletException {

		System.err.println("!@#$ MyServletContainerInitializer: adding listener");
		servletContext.addListener(new MyServletContextListener());
	}
}
