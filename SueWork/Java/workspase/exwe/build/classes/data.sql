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

UPDATE MEMBER SET mem_point = 369 where MEM_ID ='a001';

commit;

--학생테이블 
CREATE TABLE student (
stu_no VARCHAR2(50), -- 학번 -- 문자열타입(최대)
stu_name VARCHAR2(50), -- 이름
stu_score  Number(10.0), -- 성적
--기본키 설정(테이블 설정시 지정해두면 관리에 용이)
PRIMARY KEY(stu_no)
);

SELECT * FROM student;


--게시판
CREATE TABLE bbs(
bbs_no NUMBER(10,0),--글번호
bbs_title VARCHAR2(100), --글 제목
bbs_content CLOB, -- 글 내용 대량의 데이터를 저장함.문자로 저장된걸 저장할때 CLOB 그 외에 이미지나 영상을 저장하고 싶다 BLOB
bbs_writer VARCHAR2(50), --작성자(아이디)
bbs_reg_date DATE  DEFAULT SYSDATE, --- 글 등록일(작성일)
bbs_count NUMBER(10,0) DEFAULT 0, --조회수
PRIMARY KEY(bbs_no),
FOREIGN KEY(bbs_writer) REFERENCES member (mem_id) --멤버의 아이디를 가져오는 외래키
-- 글 최종 수정일, 작성자 접속IP주소, ...
-- 첨부파일은 1개만 허용할땐 여기 넣어도 되나 여러개를 넣을 수 있게 하려면 별도의 테이블로 빼는 것이좋다
);

--시퀀스 만들기(자동으로 증가하는 숫자를 만드는 것)
CREATE SEQUENCE seq_bbs_no;

select seq_bbs_no.NEXTVAL from dual; -- 시퀀스의 다음값(증가된 값) 가져오기
select seq_bbs_no.CURRVAL from dual; -- 시퀀스의 현재값 가져오기

select * from bbs;

insert into bbs(bbs_no,bbs_title,bbs_content,bbs_writer)
values(seq_bbs_no.NEXTVAL,'제목테스트','내용테스트','a008');

insert into bbs(bbs_no,bbs_title,bbs_content,bbs_writer)
values(seq_bbs_no.NEXTVAL,'제목테스트1','내용테스트1','a008');