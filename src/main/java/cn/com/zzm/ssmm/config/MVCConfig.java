package cn.com.zzm.ssmm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**mvc注解配置
 * @author zzm
 *
 */
/*@Component
@EnableWebMvc
@ComponentScan(basePackages="cn.com.zzm.ssmm.controller")*/
public class MVCConfig extends WebMvcConfigurerAdapter {
		
	 //@Bean
	 public InternalResourceViewResolver viewResolver(){
		 InternalResourceViewResolver  viewResolver  = new InternalResourceViewResolver();
		 viewResolver.setPrefix("/WEB-INF/classes/views/");
		 viewResolver.setSuffix(".jsp");
		 viewResolver.setViewClass(JstlView.class);
		 return viewResolver;
	 }
	 
	 @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/resources/");
		registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");
		super.addResourceHandlers(registry);
	}

}
