package br.com.alvescake.configuracao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;


public class InicializadorAplicacao implements WebApplicationInitializer {

    final Logger logger = LoggerFactory.getLogger(InicializadorAplicacao.class);

    
    public void onStartup(ServletContext servletContext) {
        //AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        //rootContext.register(ConfiguracaoAplicacao.class);
        //servletContext.addListener(new ContextLoaderListener(rootContext));
        //servletContext.addListener(RequestContextListener.class);
      
        //AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        //ServletRegistration.Dynamic dispatcher=servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
        //dispatcher.setLoadOnStartup(1);
        //dispatcher.addMapping("/*");
    }
    
    

}
