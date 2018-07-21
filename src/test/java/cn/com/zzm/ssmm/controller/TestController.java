package cn.com.zzm.ssmm.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;






import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/test/resources")
@ContextConfiguration(locations={"classpath*:spring-controller-test.xml"})
//注解在类上,用来声明加载的ApplicationContex 是一个WebApplicationContext ,
//它的属性指定的是Web资源的位置,默认为 src/main/webapp ,自定义修改为 resource

public class TestController {
	
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	//通过上下文构建
	private MockMvc mocMvc;
	@Autowired
	private WebApplicationContext wac;
	@Autowired
	private MockHttpSession session;
	@Autowired
	private MockHttpServletRequest request;
	
	@Before
	public void setup(){
		//根据上下文构建MocMVC环境
		this.mocMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	
	/**静态引入
	 * import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;  
	 * import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
	 * @throws Exception
	 */
	@Test
	public void doTest() throws Exception{
		mocMvc.perform(MockMvcRequestBuilders.get("/test/hello"))
		.andExpect(status().isOk())
		.andExpect(view().name("hello"))
		.andDo(MockMvcResultHandlers.print())  
        .andReturn(); 
		/*.andExpect(forwardedUrl("/WEB-INF/classes/views/hello.jsp"))*/
		 
		
	}

}
