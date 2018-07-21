package cn.com.zzm.ssmm.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;


 

/**log4j 监听器
 * @author zzm
 *
 */
@WebListener
@WebInitParam(name="log4jConfigLocation",value="classpath*:log4j.properties")
public class Log4jServletContextListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();
    	String log4jConfigLocation = servletContext.getInitParameter("log4jConfigLocation");
    	 if (log4jConfigLocation == null) {  
             System.err.println("*** 没有 log4jConfigLocation 初始化的文件 ");  
             BasicConfigurator.configure();  
         }else{
        	 System.out.println("使用: " + log4jConfigLocation+"初始化日志设置信息");  
             PropertyConfigurator.configure(sce.getServletContext().getRealPath("/")+log4jConfigLocation);  
             
         }
		
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
