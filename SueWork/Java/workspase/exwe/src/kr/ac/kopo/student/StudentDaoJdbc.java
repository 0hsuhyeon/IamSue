package kr.ac.kopo.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO (Data Access Object):
//자바 데이터 (객체) <-> 데이터베이스 데이터(테이블) 사이의 상호변환을 담당
	public class StudentDaoJdbc {
		
		{
			// 초기화 블럭
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user ="com"; 
		String password ="com01"; 
	
	
	
	public ArrayList<StudentVo> selectStudentList() {
		
		ArrayList<StudentVo> list = new ArrayList<StudentVo>();
		String sql ="SELECT stu_no, stu_name, stu_score FROM student";
		try (
			
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				StudentVo vo = new StudentVo();
				vo.setStuNo(rs.getString("stu_no")); 
				vo.setStuName(rs.getString("stu_name")); 
				vo.setStuScore(rs.getInt("stu_score"));
				list.add(vo);
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public int insertStudent(StudentVo vo) {
		int num=0;
		//SQL문에서 변화하는 값은 ?로 표시
		String sql ="INSERT INTO student(stu_no, stu_name, stu_score)" 
					+ "VALUES(?,?,?)";
				
				
		try (
					
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
					
			pstmt.setString(1,vo.getStuNo());
			pstmt.setString(2,vo.getStuName());
			pstmt.setInt(3,vo.getStuScore());
					
			num = pstmt.executeUpdate();
					
		 } catch (SQLException e) {
			e.printStackTrace();
		 	}
		return num;
	}
	
	public StudentVo selectStudent(String no) {
		StudentVo vo = null;
		String sql ="SELECT stu_no, stu_name, stu_score FROM student WHERE stu_no = ?";
			try (
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				
				pstmt.setString(1,no);
				try (ResultSet rs = pstmt.executeQuery();){
					if(rs.next()){
						vo = new StudentVo();
						vo.setStuNo(rs.getString("stu_no")); 						
						vo.setStuName(rs.getString("stu_name"));
						vo.setStuScore(rs.getInt("stu_score"));
						} 
					
				}
	
			}		
			catch (SQLException e) {
				e.printStackTrace();
			}
			return vo;
	}
	public int updateStudent(StudentVo vo) {
		//SQL문에서 변화하는 값은 ?로 표시
		int num =0;
		String sql ="UPDATE student SET stu_name =?, stu_score=? where stu_no = ?" ;
				
				
		try (
					
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
					
			pstmt.setString(3,vo.getStuNo());//pstmt에 들어있는 SQL문의 1번째 ?에 id값을 주입
			pstmt.setString(1,vo.getStuName());
			pstmt.setInt(2,vo.getStuScore());
					
			num = pstmt.executeUpdate();
					
		 } catch (SQLException e) {
			e.printStackTrace();
		 	}
		return num;
	}
	
	public int deleteStudent(String stuNo) {
		int num = 0;
		String sql = "DELETE FROM student where stu_no = ?";//실행할 SQL문을 명령문 객체로 생성(실행준비)
		
		//try()안에 선언된 변수는 try-catch 블럭 실행이 끝난 후 자동으로 달아준다(close)
		try (
			
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1,stuNo);
			num = pstmt.executeUpdate();
			
			

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
}