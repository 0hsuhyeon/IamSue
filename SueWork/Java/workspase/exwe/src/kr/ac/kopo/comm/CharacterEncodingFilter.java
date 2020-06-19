package kr.ac.kopo.comm;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class CharacterEncodingFilter implements Filter {

	private String enc;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		enc = filterConfig.getInitParameter("encoding");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("출력");
		request.setCharacterEncoding(enc); // POST방식 한글 파라미터 값을 인코딩

		chain.doFilter(request, response); // 이후 실행될 필터 또는 서블릿 실행
		
	}
		
}
