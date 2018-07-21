package cn.com.zzm.ssmm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.com.zzm.ssmm.annotation.Auth;


/**权限拦截器
 * @author zzm
 *
 */
public class AuthInterceptor extends HandlerInterceptorAdapter{
	private final static Logger log= Logger.getLogger(AuthInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HandlerMethod method = (HandlerMethod)handler;
		Auth  auth = method.getMethod().getAnnotation(Auth.class);
	    //验证登陆超时问题  auth = null，默认验证 
		if( auth == null || auth.verifyLogin()){
			String baseUri = request.getContextPath();
			String path = request.getServletPath();
			 //session user 判断未完成
			//@TODO
		}
		//验证URL权限
		if( auth == null || auth.verifyURL()){		
			//判断是否超级管理员
			//@TODO
		}
		
		
		return super.preHandle(request, response, handler);
	}
}
