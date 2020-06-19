package kr.ac.kopo.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO (Data Access Object):
// 자바 데이터 (객체) <-> 데이터베이스 데이터(테이블) 사이의 상호변환을 담당
public class MemberDaoJdbc implements MemberDao {
	
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String user ="com"; 
	String password ="com01"; 
	
		@Override
		public List<MemberVo> selectMemberList() {
			
			
			ArrayList<MemberVo> list = new ArrayList<MemberVo>();
			String sql ="SELECT mem_id, mem_pass, mem_name, mem_point FROM MEMBER";
			try (
				
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				
				
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					MemberVo vo = new MemberVo();
					vo.setMemId(rs.getString("mem_id"));
					vo.setMemPass(rs.getString("mem_pass"));
					vo.setMemName(rs.getString("mem_name"));
					vo.setMemPoint(rs.getInt("mem_point"));
					list.add(vo);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
		
		@Override
		public MemberVo selectMember(String memId) {
			MemberVo vo = null;
			String sql ="SELECT mem_id, mem_pass, mem_name, mem_point FROM MEMBER WHERE mem_id = ?";
			try (
					Connection conn = DriverManager.getConnection(url, user, password);
					PreparedStatement pstmt = conn.prepareStatement(sql);
					){
				
				pstmt.setString(1,memId);
				try (ResultSet rs = pstmt.executeQuery();){
					if(rs.next()){
						vo = new MemberVo();
						vo.setMemId(rs.getString("mem_id"));
						vo.setMemName(rs.getString("mem_name"));
						vo.setMemPoint(rs.getInt("mem_point"));
						
					}
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			return vo;
		}
		
		@Override
		public int insertMember(MemberVo vo) {
				
				//SQL문에서 변화하는 값은 ?로 표시
				int num =0;
				String sql ="INSERT INTO MEMBER(mem_id, mem_pass, mem_name, mem_point)" 
							+ "VALUES(?,?,?,?)";
						
						
				try (
							
					Connection conn = DriverManager.getConnection(url, user, password);
					PreparedStatement pstmt = conn.prepareStatement(sql);
				){
							
					pstmt.setString(1,vo.getMemId());//pstmt에 들어있는 SQL문의 1번째 ?에 id값을 주입
					pstmt.setString(2,vo.getMemPass());
					pstmt.setString(3,vo.getMemName());
					pstmt.setInt(4,vo.getMemPoint());
							
					num = pstmt.executeUpdate();
							
				 } catch (SQLException e) {
					e.printStackTrace();
				 	}
				return num;
		}
	
	
		@Override
		public int updateMember(MemberVo vo) {
			int num =0;
			String sql ="UPDATE MEMBER SET mem_name =?, mem_point=? where mem_id = ?" ;
					
					
			try (
						
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
						
				pstmt.setString(3,vo.getMemId());//pstmt에 들어있는 SQL문의 1번째 ?에 id값을 주입
				pstmt.setString(1,vo.getMemName());
				pstmt.setInt(2,vo.getMemPoint());
						
				num = pstmt.executeUpdate();
						
			 } catch (SQLException e) {
				e.printStackTrace();
			 	}
			return num;
		}
	
		
		@Override
		public int deleteMember(String memId) {
			int num = 0;
			String sql = "DELETE FROM MEMBER where MEM_ID = ?";//실행할 SQL문을 명령문 객체로 생성(실행준비)
			
			//try()안에 선언된 변수는 try-catch 블럭 실행이 끝난 후 자동으로 달아준다(close)
			try (
				
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
				pstmt.setString(1,memId);
				num = pstmt.executeUpdate();
				
				
	
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return num;
		}

		@Override
		public MemberVo selectLoginMember( MemberVo memberVo) {
			MemberVo vo = null;
			String sql ="SELECT mem_id, mem_pass, mem_name, mem_point FROM MEMBER WHERE mem_id = ? and mem_pass = ?";
			try (
					Connection conn = DriverManager.getConnection(url, user, password);
					PreparedStatement pstmt = conn.prepareStatement(sql);
					){
				
				pstmt.setString(1, memberVo.getMemId());
				pstmt.setString(2, memberVo.getMemPass());
				try (ResultSet rs = pstmt.executeQuery();){
					if(rs.next()){
						vo = new MemberVo();
						vo.setMemId(rs.getString("mem_id"));
						vo.setMemPass(rs.getString("mem_pass"));
						vo.setMemName(rs.getString("mem_name"));
						vo.setMemPoint(rs.getInt("mem_point"));
						
					}
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
			return vo;
		}
	
			
}
