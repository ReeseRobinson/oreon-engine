package org.oreon.core.gl.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GLContext {

	private static ApplicationContext context;
	
	public static void initialize(){
		context = new ClassPathXmlApplicationContext("gl-context.xml");
	}
	
	public static GLRenderContext getRenderContext(){
		
		return context.getBean(GLRenderContext.class);
	}
	
	public static GLCamera getCamera(){
		
		return context.getBean(GLCamera.class);
	}
}
