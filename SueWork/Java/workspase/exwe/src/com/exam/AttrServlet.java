package com.exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

@WebServlet("/attr.do")
public class AttrServlet extends HttpServlet {

	// 자바 웹 애플리케이션에서 데이터를 저장할 수 있는 공간(객체)
	// 1. 요청객체 (HttpServletRequest) : 요청마다 1개씩 새로 생성, 요청처리(응답전송)가 끝나면 소멸
	// 2. 세션객체 (HttpSession) : 사용자(클라이언트, 웹브라우저)마다 1개씩 생성, 웹애플리케이션 실행 중 계속 유지
	//						- 일정 시간동안 접속(요청전송)이 없는 사용자의 세션 객체는 소멸가능
	// 3. 서블릿컨텍스트객체 (ServletContext) : 웹애플리케이션 전체에 1개만 생성, 웹애플리케이션 실행 중 계속 유지하다 톰캣을 종료할때 사라짐 
	// 						- 모든 사용자가 공유
	// (4) pageContext 객체 : JSP파일 1개마다 1개씩 새로 생성, 해당 JSP 실행이 끝나면 소멸
	// 						- 서블릿이 아닌 JSP에서 전송
	// (5) 쿠키 : 사용자의 웹브라우저에 저장시키고, 요청 전송시마다 자동으로 표함시켜 전송
	// 						- 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청객체에 "reqCnt"라는 이름으로 저장된 값을 가져오기
		AtomicInteger rcnt = (AtomicInteger) req.getAttribute("reqCnt");
		if (rcnt==null) {// 요청객체에 "reqCnt"라는 이름으로 값을 저장한 적이 없는 경우
			rcnt = new AtomicInteger(0); //0값을 가진 정수 객체 생성 // 아토믹인티저: 스레드에 안전한 정수객체
		}
		rcnt.incrementAndGet(); // 정수값을 1 증가
		req.setAttribute("reqCnt", rcnt); //요청객체에 "reqCnt"라는 이름으로 rcnt 값을 저장
		
		
		HttpSession session = req.getSession();
		// 세션객체에 "sesCnt"라는 이름으로 저장된 값을 가져오기
				AtomicInteger scnt = (AtomicInteger) session.getAttribute("sesCnt");
				if (scnt==null) {// 요청객체에 "sesCnt"라는 이름으로 값을 저장한 적이 없는 경우
					scnt = new AtomicInteger(0); //0값을 가진 정수 객체 생성 // 아토믹인티저: 스레드에 안전한 정수객체
				}
				scnt.incrementAndGet(); // 정수값을 1 증가
				session.setAttribute("sesCnt", scnt); //요청객체에 "sesCnt"라는 이름으로 scnt 값을 저장
		
				
				
		// 현재 웹 애플리케이션의 서블릿 컨텍스트 객체 가져오기
		ServletContext context = req.getServletContext();
//		ServletContext se = this.getServletContext();
		// 서블릿 컨텍스트 객체에 "conCnt"라는 이름으로 저장된 값을 가져오기
				AtomicInteger ccnt = (AtomicInteger) context.getAttribute("conCnt");
				if (ccnt==null) {
					ccnt = new AtomicInteger(0);
				}
				ccnt.incrementAndGet();
				context.setAttribute("conCnt",ccnt);
				
				
				
				
		PrintWriter out = resp.getWriter();
		out.print("reqCnt :" + rcnt ); 
		out.print("\nsesCnt :" + scnt );
		out.print("\nconCnt :" + ccnt );
	}
	
}
