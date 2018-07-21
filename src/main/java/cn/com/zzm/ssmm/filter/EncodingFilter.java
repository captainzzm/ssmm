package cn.com.zzm.ssmm.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;


/**编码过滤器
 * @author zzm
 *
 */
@WebFilter(filterName = "encodingFilter", 
		urlPatterns="/*",
		dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD},
		initParams={@WebInitParam(name="encode",value="utf-8")})

public class EncodingFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String encode = request.getServletContext().getInitParameter("encode");
		request.setCharacterEncoding(encode);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
