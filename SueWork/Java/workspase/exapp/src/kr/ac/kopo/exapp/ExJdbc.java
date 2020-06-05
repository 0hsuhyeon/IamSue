package kr.ac.kopo.exapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExJdbc {

	public static void main(String[] args) {
		
		try {// Ctrl + 1로 예외처리하며 try로 감싸라
			
			// 오라클 jdbc드라이버(라이브러리)클래스인 
			// oracle.jdbc.OracleDrive 클래스를 메모리에 로드 
			Class.forName("oracle.jdbc.OracleDriver");//() 에 로드할 클래스 이름을 넣는다 
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";//데이터베이스 주소
		String user ="com"; //데이터베이스 계정 아이디 
		String password ="com01"; //데이터베이스 계정 비밀번호 
			
			{
			String sql ="INSERT INTO MEMBER(mem_id, mem_pass, mem_name, mem_point)" 
						+ "VALUES('a00','1234','도우너', 200 )";//실행할 SQL문을 명령문 객체로 생성(실행준비)
			
			//try()안에 선언된 변수는 try-catch 블럭 실행이 끝난 후 자동으로 달아준다(close)
			try (
				//데이터베이스에 접속(연결,로그인)
				Connection conn = DriverManager.getConnection(url, user, password);//Ctrl +1 하고 첫번째 거 클릭 
				//실행할 SQL문을 명령문 객체로 생성(실행준비)
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				
				// SQL문을 담은 명령문(객체)을 실행
				// 실행 결과로 데이터를 돌려받는 SQL문(SELECT)은 executeQuery()로 실행
				// 실행 결과로 데이터를 돌려받지 않는 SQL문(INSERT, UPDATE,DELETE)은 executeUpdate()로 실행
				int num = pstmt.executeUpdate();// 실행결과 변경된 레코드 수를 반환
				System.out.println(num + "개의 레코드 추가");
				
	
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
			
			{
			String sql ="SELECT mem_id, mem_pass, mem_name, mem_point FROM MEMBER";//실행할 SQL문을 명령문 객체로 생성(실행준비)
			
			//try()안에 선언된 변수는 try-catch 블럭 실행이 끝난 후 자동으로 달아준다(close)
			try (
				//데이터베이스에 접속(연결,로그인)
				Connection conn = DriverManager.getConnection(url, user, password);//Ctrl +1 하고 첫번째 거 클릭 
				//실행할 SQL문을 명령문 객체로 생성(실행준비)
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				
				// SQL문을 담은 명령문(객체)을 실행
				// 실행 결과로 데이터를 돌려받는 SQL문(SELECT)은 executeQuery()로 실행
				// 실행 결과로 데이터를 돌려받지 않는 SQL문(INSERT, UPDATE,DELETE)은 executeUpdate()로 실행
				
				ResultSet rs = pstmt.executeQuery();// 실행결과 레코드를 가리키고 있는 ResultSet 반환
				//처음 ResultSet은 첫 레코드(행) 이전을 가리키고 있는 상태
				
				while(rs.next()){// 다음 레코드로 이동하고, 다음 레코드가 없으면 false가 반환되어 반복 종료
					// 다음과 같이 출력되도록 프로그램을 변경하세요
					// a001 : 1234 : 고길동 : 100
					// a002 : 1234 : 마이콜 : 200
					// a003 : 1234 : 도우너 : 300
					String memId = rs.getString("mem_id"); //현재 rs가 가리키는 레코드에서 "mem_id"컬럼값 가져오기
					String memPass = rs.getString("mem_pass");
					String memName = rs.getString("mem_name");
					int memPoint = rs.getInt("mem_point");
					
					System.out.println(memId +" : "+ memPass +" : "+ memName +" : "+ memPoint);
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
			
			// a001 회원의 포인트를 777로 변경하는 프로그램을 작성하세요
			{
				String sql = "UPDATE MEMBER SET mem_point = 777 where MEM_ID ='a001'";//실행할 SQL문을 명령문 객체로 생성(실행준비)
				
				//try()안에 선언된 변수는 try-catch 블럭 실행이 끝난 후 자동으로 달아준다(close)
				try (
					//데이터베이스에 접속(연결,로그인)
					Connection conn = DriverManager.getConnection(url, user, password);//Ctrl +1 하고 첫번째 거 클릭 
					//실행할 SQL문을 명령문 객체로 생성(실행준비)
					PreparedStatement pstmt = conn.prepareStatement(sql);
				){
					
					// SQL문을 담은 명령문(객체)을 실행
					// 실행 결과로 데이터를 돌려받는 SQL문(SELECT)은 executeQuery()로 실행
					// 실행 결과로 데이터를 돌려받지 않는 SQL문(INSERT, UPDATE,DELETE)은 executeUpdate()로 실행
					int num = pstmt.executeUpdate();// 실행결과 변경된 레코드 수를 반환
					System.out.println(num + "개의 레코드 변경");
					
		
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			// a003 회원을 삭제하는 프로그램을 작성하세요
			
			{
				String sql = "DELETE FROM MEMBER where MEM_ID ='a00'";//실행할 SQL문을 명령문 객체로 생성(실행준비)
				
				//try()안에 선언된 변수는 try-catch 블럭 실행이 끝난 후 자동으로 달아준다(close)
				try (
					//데이터베이스에 접속(연결,로그인)
					Connection conn = DriverManager.getConnection(url, user, password);//Ctrl +1 하고 첫번째 거 클릭 
					//실행할 SQL문을 명령문 객체로 생성(실행준비)
					PreparedStatement pstmt = conn.prepareStatement(sql);
				){
					
					// SQL문을 담은 명령문(객체)을 실행
					// 실행 결과로 데이터를 돌려받는 SQL문(SELECT)은 executeQuery()로 실행
					// 실행 결과로 데이터를 돌려받지 않는 SQL문(INSERT, UPDATE,DELETE)은 executeUpdate()로 실행
					int num = pstmt.executeUpdate();// 실행결과 변경된 레코드 수를 반환
					System.out.println(num + "개의 레코드 삭제");
					
		
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			// 전체 회원 정보를 다시 한번 조회하여 출력하세요 
			
			{
				String sql ="SELECT mem_id, mem_pass, mem_name, mem_point FROM MEMBER";//실행할 SQL문을 명령문 객체로 생성(실행준비)
				
				//try()안에 선언된 변수는 try-catch 블럭 실행이 끝난 후 자동으로 달아준다(close)
				try (
					//데이터베이스에 접속(연결,로그인)
					Connection conn = DriverManager.getConnection(url, user, password);//Ctrl +1 하고 첫번째 거 클릭 
					//실행할 SQL문을 명령문 객체로 생성(실행준비)
					PreparedStatement pstmt = conn.prepareStatement(sql);
				){
					// SQL문을 담은 명령문(객체)을 실행
					// 실행 결과로 데이터를 돌려받는 SQL문(SELECT)은 executeQuery()로 실행
					// 실행 결과로 데이터를 돌려받지 않는 SQL문(INSERT, UPDATE,DELETE)은 executeUpdate()로 실행
					
					ResultSet rs = pstmt.executeQuery();// 실행결과 레코드를 가리키고 있는 ResultSet 반환
					//처음 ResultSet은 첫 레코드(행) 이전을 가리키고 있는 상태
					
					while(rs.next()){// 다음 레코드로 이동하고, 다음 레코드가 없으면 false가 반환되어 반복 종료
					
						String memId = rs.getString("mem_id"); //현재 rs가 가리키는 레코드에서 "mem_id"컬럼값 가져오기
						String memPass = rs.getString("mem_pass");
						String memName = rs.getString("mem_name");
						int memPoint = rs.getInt("mem_point");
						
						System.out.println(memId +" : "+ memPass +" : "+ memName +" : "+ memPoint);
						
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
}
