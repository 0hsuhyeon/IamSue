package kr.ac.kopo.exapp;

import java.util.ArrayList;

public class MemberObject {

	public static void main(String[] args) {
		// 한 회원의 아이디, 이름, 포인트를 저장할 수 있는 Member라는 데이터타입(클래스)을 정의
		// 여러명의 회원 정보를 저장할 수 있는 목록을 생성
		//아이디 a001 이름 고길동 포인트 100 정보를 목록에 저장
		//아이디 a002 이름 마이콜 포인트 200 정보를 목록에 저장
		//아이디 a003 이름 도우너 포인트 300 정보를 목록에 저장
		// 회원 목록에 저장된 전체 회원의 아이디, 이름, 포인트를 출력
		
		
		ArrayList<Member> memList = new ArrayList<Member>();
		
		Member m1 = new Member();
		m1.setId("a001");
		m1.setName("홍길동");
		m1.setPoint(100);
		memList.add(m1);
		
		Member m2 = new Member();
		m2.setId("a002");
		m2.setName("마이콜");
		m2.setPoint(200);
		memList.add(m2);
		
		Member m3 = new Member();
		m3.setId("a003");
		m3.setName("도우너");
		m3.setPoint(300);
		memList.add(m3);
		
		
		for(int i=0; i<memList.size(); i++) {
			Member m = memList.get(i);
			System.out.println(i +". "+m.getId() +" : " + m.getName() +" : " + m.getPoint());
		}
		
	}
}
