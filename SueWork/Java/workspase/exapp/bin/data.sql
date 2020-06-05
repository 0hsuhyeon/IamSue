-- 회원정보(member) 저장을 위한 테이블 생성
-- 회원 아이디 mem_id 문자열(최대50바이트)
-- 회원 비밀번호 mem_pass 문자열(최대50바이트)
-- 회원 이름 mem_name 문자열(최대50바이트)
-- 회원 포인트 mem_point 숫자(최대 10자리 정수)


CREATE TABLE member (
mem_id VARCHAR2(50), -- 문자열타입(최대)
mem_pass VARCHAR2(50),
mem_name  VARCHAR2(50),
mem_point Number(10,0), --(자릿수, 소숫점자리수)
--기본키 설정(테이블 설정시 지정해두면 관리에 용이)
PRIMARY KEY(mem_id)
);

select * from member;

--자료를 집어넣을 때 
INSERT INTO MEMBER(mem_id, mem_pass, mem_name, mem_point)VALUES('a001','1234','고길동', 100 );

commit;

select * from member;
select * from member;

UPDATE MEMBER SET mem_point = 369 where MEM_ID ='a001';

commit;


CREATE TABLE student (
stu_no VARCHAR2(50), -- 학번 -- 문자열타입(최대)
stu_name VARCHAR2(50), -- 이름
stu_score  Number(10.0), -- 성적
--기본키 설정(테이블 설정시 지정해두면 관리에 용이)
PRIMARY KEY(stu_no)
);

SELECT * FROM student;