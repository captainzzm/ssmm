package cn.com.zzm.ssmm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.com.zzm.ssmm.model.SysUser;
import cn.com.zzm.ssmm.service.TestService;

@Controller
@RequestMapping("/test")
public class HelloController {
	
	@Autowired
	private TestService testService;
	
	
	@RequestMapping("/hello")
	public String hello(ModelMap map){
		SysUser sysUser = testService.doService(1l);
		map.put("sysUser", sysUser);
		return "hello";
	}

}
