package com.sist.java;
/*
 * 오라클과 데이터 연동해주는 클래스
 * 
 * 1) 드라이버 등록(1번만) ==> 생성자
 * 2) 연결
 * 3) 해제
 * 4) 기능처리
 * 		= 목록읽기
 * 		  리턴형 ===> ArrayList
 * 		 매개변수==> x
 * 		= 수정하기
 * 			리턴형  ===>x
 * 			매개변수===> class(한명의 정보가 여러개 들어올때)
 * 		= 삭제하기 
 * 			리턴형 ===> x
 * 			매개변수 ==> int(중복이 안되는 값을 넣어야함)
 * 		= 추가하기
 * 			리턴형 ==> x
 * 			매개변수 ==> class
 * 		= 상세보기
 * 			리턴형 ==> class
 * 			매개변수 ==> int (no값을 primary key로 준다-중복이 안되게 부여된 값.)
 * 
 * 
 * 
 * 
 * 
 * 
 * 번호마다 매소드화 해서 사용함
 * 
 * 연결 수정 해재
 * 연결 추가 해재
 * 연결 읽기 해재
 * 연결 삭제 해재
 * 
 * ==>항상 열고 닫고 명확히 해야함 
 * 
 * 메소드를 만드는 목적 : 재사용
 * 					반복을 제거할때 
 * 
 * 
 * 
 * 
SQL> select empno,ename,job,hiredate from emp;

     EMPNO ENAME                JOB                HIREDATE
---------- -------------------- ------------------ --------
      7369 SMITH                CLERK              20/01/08
      7499 ALLEN                SALESMAN           20/01/08
      7521 WARD                 SALESMAN           20/01/08
      7566 JONES                MANAGER            20/01/08
      7654 MARTIN               SALESMAN           20/01/08
      7698 BLAKE                MANAGER            20/01/08
      7782 CLARK                MANAGER            20/01/08
      7788 SCOTT                ANALYST            20/01/08
      7839 KING                 PRESIDENT          20/01/08
      7844 TURNER               SALESMAN           20/01/08
      7876 ADAMS                CLERK              20/01/08

     EMPNO ENAME                JOB                HIREDATE
---------- -------------------- ------------------ --------
      7900 JAMES                CLERK              20/01/08
      7902 FORD                 ANALYST            20/01/08
      7934 MILLER               CLERK              20/01/08

 * 
 * 7566을 주었을때 한개만 선택됨 =>primary key
 * 
 * 동적 바인딩 / 정적 바인딩(메소드호출)
 * 
 * 동적 => 상속이 있는 상태에서 
 * 정적 => 자신 안에서 ..
 * 
 * 프로그램의 결합성 낮추려면 new사용 안하고 reflect사용....
 * 
 * 
 * 
 * 
 *  
 */
import java.util.*;
import java.sql.*;

public class BoardDAO {

	
	
	
	
}
