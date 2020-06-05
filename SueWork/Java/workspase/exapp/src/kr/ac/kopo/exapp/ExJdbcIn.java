package kr.ac.kopo.exapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class ExJdbcIn {
	//클래스를 실행하면 회원 아이디, 비밀번호, 이름, 포인트를 입력받아서 데이터베이스의 member 테이블에 저장하고
	//전체목록을 조회하여 출력하는 프로그램을 작성하세요
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = "";
		String pw = "";
		String na = "";
		int po = 0;
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user ="com"; 
		String password ="com01";  
		
		
		
		System.out.println("신규 아이디를 입력하세요");
			id = s.nextLine();
		System.out.println("신규 비밀번호를 입력하세요");
			pw = s.nextLine();
		System.out.println("신규 이름을 입력하세요");
			na = s.nextLine();
		System.out.println("신규 포인트를 입력하세요");
			po =  s.nextInt();
		
		try {
				Class.forName("oracle.jdbc.OracleDriver");
				
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
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
				
		
	}
}
