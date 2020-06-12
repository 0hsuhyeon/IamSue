package kr.ac.kopo.member;

//교수님 주석: 일반적으로 데이터베이스 테이블의 레코드(row) 1개를 저장할 수 있는 VO클래스를 정의
//오수현 주석: 회원테이블의 레코드 하나를 담을 수 있는 객체의 형태여야 함 Vo :: Value Object
public class MemberVo {	
	private String memId;
	private String memPass;
	private String memName;
	private int memPoint;
	
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPass() {
		return memPass;
	}
	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemPoint() {
		return memPoint;
	}
	public void setMemPoint(int memPoint) {
		this.memPoint = memPoint;
	}
	
	
}
