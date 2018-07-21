package cn.com.zzm.ssmm.listener;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.util.ResourceUtils;

/**FlagListener 控制台输出监听器
 * @author zzm
 *
 */
@WebListener
public class FlagServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			InputStream is = new FileInputStream(ResourceUtils.getFile("classpath*:flag.txt"));
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			while(s!=null){
				System.out.println(s);
				s=br.readLine();
			}
			br.close();
			isr.close();
			is.close();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
