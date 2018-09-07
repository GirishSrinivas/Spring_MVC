package com.girish;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class EventTrackerInitiallizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext context = getContext();
		
		// initialization of DispatcherServlet with Spring's root WebApplicationContext
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		
		// start up and shut down Spring's root WebApplicationContext
		// ties the lifecycle of the ApplicationContext to the lifecycle of the ServletContext
		ContextLoaderListener contextListner = new ContextLoaderListener(context);
		
		// Registering the dispatcher servlet and context listener
		servletContext.addListener(contextListner);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", dispatcherServlet);
		
		// adding url mapping to the dispatcher servlet
		dispatcher.addMapping("/");
		
		// configuring dispatcher servlet to instantiate on startup
		dispatcher.setLoadOnStartup(1);
	}
	
	// getting the Spring's root WebApplicationContext
	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
		// pointing to Spring's root WebApplicationContext class
		context.register(com.girish.WebConfig.class);
		
		return context;
	}

}
