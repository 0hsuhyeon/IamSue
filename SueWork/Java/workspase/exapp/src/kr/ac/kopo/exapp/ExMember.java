package kr.ac.kopo.exapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExMember {

//	1. 회원목록 2. 회원추가 3. 회원삭제 4. 종료 라고 메뉴를 출력
//	번호를 입력받는다
//	1 을 입력한 경우 데이터베이스에 존재하는 모든 회원 목록을 출력
//	2 를 입력한 경우 회원 아이디 비밀번호 이름 포인트를 입력 받아서 데이터베이스의 member 테이블에 저장
//	3 을 입력한 경우 삭제할 회원의 아이디를 입력하세요 라고 출력하고 입력한 아이디의 회원을 데이터베이스에서 삭제
//	4 를 입력할 경우 프로그램을 종료
//	이 작업을 무한 반복
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = "";
		String pw = "";
		String na = "";
		int po = 0;
		
		boolean flag = true;
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user ="com"; 
		String password ="com01";  
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		
		do{
			System.out.println("1. 회원목록	2. 회원추가	3. 회원삭제	4.종료");
			String menu = s.nextLine();
			
			switch (menu) {
			case "1": 
				System.out.println("회원목록을 불러옵니다\n");
				{
					String sql ="SELECT mem_id, mem_pass, mem_name, mem_point FROM MEMBER";
					try (
						
						Connection conn = DriverManager.getConnection(url, user, password);
						PreparedStatement pstmt = conn.prepareStatement(sql);
					){
						
						
						ResultSet rs = pstmt.executeQuery();
						while(rs.next()){
							String memId = rs.getString("mem_id"); 
							String memPass = rs.getString("mem_pass");
							String memName = rs.getString("mem_name");
							int memPoint = rs.getInt("mem_point");
							
							System.out.println(memId +" : "+ memPass +" : "+ memName +" : "+ memPoint);
							
						}
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
	
			case "2": System.out.println("신규 회원을 추가합니다\n");
					
				
				System.out.println("신규 아이디를 입력하세요");
					id = s.nextLine();
				System.out.println("신규 비밀번호를 입력하세요");
					pw = s.nextLine();
				System.out.println("신규 이름을 입력하세요");
					na = s.nextLine();
				System.out.println("신규 포인트를 입력하세요");
					po =  s.nextInt();
				{
					//SQL문에서 변화하는 값은 ?로 표시
					String sql ="INSERT INTO MEMBER(mem_id, mem_pass, mem_name, mem_point)" 
								+ "VALUES(?,?,?,?)";
							
							
					try (
								
						Connection conn = DriverManager.getConnection(url, user, password);
						PreparedStatement pstmt = conn.prepareStatement(sql);
					){
								
						pstmt.setString(1,id);//pstmt에 들어있는 SQL문의 1번째 ?에 id값을 주입
						pstmt.setString(2,pw);
						pstmt.setString(3,na);
						pstmt.setInt(4,po);
								
						int num = pstmt.executeUpdate();
						System.out.println(num + "개의 레코드 추가");
								
					 } catch (SQLException e) {
						e.printStackTrace();
					 	}
				}
				break;
			case "3": System.out.println("기존 회원을 삭제합니다\n");
				System.out.println("삭제할 회원의 아이디를 입력해주세요\n");
				String delid= s.nextLine();
				{
					String sql = "DELETE FROM MEMBER where MEM_ID = ?";//실행할 SQL문을 명령문 객체로 생성(실행준비)
					
					//try()안에 선언된 변수는 try-catch 블럭 실행이 끝난 후 자동으로 달아준다(close)
					try (
						
						Connection conn = DriverManager.getConnection(url, user, password);
						PreparedStatement pstmt = conn.prepareStatement(sql);
					){
						pstmt.setString(1,delid);
						int num = pstmt.executeUpdate();
						System.out.println(num + "명의 회원 삭제");
						System.out.println(delid +"님의 정보를 삭제합니다");
						
			
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case "4": System.out.println("프로그램을 종료합니다\n");
				flag = false;
				break;
			default: System.out.println("유효하지 않은 접근입니다. 다시 입력해주십시오\n");
				break;
				
			}
			
		}while(flag);
		
				
		
	}
}
