/*
 * 
 * 2020  01 29
 * 
 * 1. HAPPY B-S
 * 2. 복습
 * 3. 놋북 오라클 연결하기, 이클립스<->퀀텀 연결하기.
 * 4. 짐 선택
 * 
 * 
 * 3월 말까지 3권 완료.
 * 1. 오라클
 * 2. html
 * 3. jsp
 * 4. 네트워크 복습
 * 
 * 
 * 오라클
 * 1. 자바에서 어떻게 데이터를 가져오느냐.어떻게 자료를 쓸 것인가!
 * 2. 명령어, 함수, 자동화처리(트위거...?)
 * 3. sql, mysql...?, query(내가 던지고 던진 결과를 가져옴)
 * 
 * 
 * <데이터유형>
 * 1. 정형화된 데이터 = 테이블, 원하는 데이터를 지정한 장소에 딱딱 넣는 테이블 구조! => 기본 데이터형- 테이블 
 * 2. 반정형화 데이터 = 구분만 되어있는 데이터, html xml json -  선택은 하지만 글자수가 명확하게 지정되어있지 않다.
 * 3. 비정형화 데이터 = 댓글, 트위터, 줄거리.. 등등 raw data. ==>값을 가져와 데이터를 정형화시키는 것=> 빅데이터(통계)! 
 * 
 * 따라서, String 문자열처리 중요!
 * 
 * SQL
 * 0. DQL(데이터 질의언어) ->보내고 값을 받아옴-> 데이터 검색시 사용 - SELECT - 
 * 1. DML(데이터 조작언어) -> 1. 수정 - UPDATE							==> 총 4개 => CURD 
 * 						 2. 추가 - INSERT 
 * 						 3. 삭제 - DELETE
 * 						(4. 선택 - SELECT)
 * 
 * (0~1 프로그래머)
 * 
 * 2. DDL(데이터 정의언어) -> 저장공간 만들때 사용, 클래스(테이블, 가상테이블-VUE, 자동증가-Sequence, 함수-Function, 프로시저, 트리거), 배열 "선언"과 같음
 *  1. Create - 생성
 * 	2. Alter -수정, 추가, 삭제- 
 *  3. Drop - 완전삭제 - 테이블 자체 삭제됨
 *  4. Truncate - 테이블 그대로 있고 데이터만 잘자낼때
 *  5. Rename - 테이블, 컴럼명 변경할때
 * 						
 *
 * 3. DCL(데이터 제어언어) - 권한과 관련
 *   1. Grant
 *   2. Revoke
 *   
 * 4. TCL(트랜젝션) -일괄처리 
 *   1. Commit - DML일 경우만 날림.- 변경된 내용 있을 경우만 날림.. SELECT(자료 가져올시)에는 안씀..
 *   2. Rollback
 * 
 * 
 * 오라클 - 대/소문자 구분 X
 * 
 * 원칙 - 키워드는 대문자가 관례! 키워드와 데이터(소문자) 구분 - 저장된 데이터는 대소문자 구분 --> 저장된 데이터는 저장된 상태로 구분하여 가져와야함.
 * 
 * 오라클 - 저장공간 (Table)
 * 
 * id name sex  ==> 컬럼(클래스)   컬럼명 id + name+ sex ==> 레코드 ==> 레코드 단위로 제어한다. 
 * aa 홍		남   ==> row(테이블 인스턴스 -new 객체) - 튜풀 
 * bb 김        여   ==> row - 튜블 ==> 투플 여러개 카디널리티
 * cc 박		여  ==> row  - 투블
 * 
 * id+ aa+bb+ cc => 도메인
 * 
 * 컬럼 columm +로row => 테이블
 * 
 * 값을 가져올때 row단위로 읽는다.
 * 
 *  SELECT 데이터검색
 *  1. 문법- 무조건 기입 
 *  	 SELECT * ==> 전체를 가져올떄ㅡ ID NAME SEX 모두 가져옴
 *       SELECT * | COLUMM1(ID), COLUMM2(NAME) ==> ID와 NAME 의 값만 가져올때 ==> 해당 테이블의 컬럼명(변수) 확인하기
 * 		 + FROM table 명!
 * 
 *  	DESC table 명--> 테이블 가져오기..
 * 		
 * 		영화장면, 극장, 시간, 좌석, 날짜 => 모두 다른 테이블로 데이터 저장 해놓는다. 
 * 		join -> 테이블을 합쳐서 가져옴 - 필요한 테이블들을 가져올때
 * 
 * 	2. 옵션 (추가쿼리) - ROW가져오기? 홍에 대한 모든 정보 가져올때
 *  	1. WHERE  조건절(연산자, boolean 등등, 자바의 조건절)
 *  	2. GROUP BY sex(성별로 가져오기? 연간,주간,월간 등등, 직책, 입사년도 ) ==> 같은 것 끼리 모아줄때
 *      3. having =>group by 가 있는 경우- 그룹으로 가져오되..추가로 조건을 걸때! 
 *      4. Order by - 정렬 - 
 *      
 *   
 *   1번과 2번의 문법은 항상 순서대로
 *   select from(필수조건) where..
 *   select from(필수조건) order by..(having..)
 *   where vs order by 순서는 where 먼저!
 *   
 *   COLUMM 명을 확인해야하는 이유 데이터형을 알맞게 주기위해.
 *     
 *  
 *  JOIN VS SUBQUERY..
 *  
 *  
 *  
	 
 *  1. 모든 테이블 조회하기
 *  2. 해당 테이블의 모든 칼럼 조회하기
 *  3. 해당 테이블의 해당 칼럼의 모든 데이터 조회하기           
 *      
 */

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
