


/* Collection - 자료구조를 쉽게 사용이 가능하게 - 표준화시켜줌. 
* 
* list - index number - 순서대로, 중복허용 (게시판,공지사항)
* 
* set - 순서 x, 중복허용 x
* 
* map - 두가지 동시 저장 - 클래스 관리자
* 
* ==================================================
* 
* 
* collection- 1. list  
* 			- 2. set  ==> 인터페이스
* 			- 3. map
* 
* <list>
* (CURD)
* 1. 저장 - add()
* 2. 읽기 - get()                                       ==> .size
* 3. 수정 - set()
* 4. 삭제 - remove() - 배열은 불가능(저장,읽기, 수정만 가능)
* 
* 배열형식 -> ArrayList:(안정성높다-쉬움-속도느림-삭제추가시(중간 or끝) 인덱스번호를 정상 유지하기 위함) 
* 					  데이터베이스에서 사용多(웹) - 가변형 ==>thread 비동기화(동시에 저장 가능 - 데이터많을때 사용!)
* Vector-> 네트워크에서 사용 - 접속자 정보 저장할때 사용 多 ==>thread 동기화(모두 저장후 -> 그다음 저장)
* LinkedList-> 속도빠름
*  
* <set>
* <stack> -Lifo - primitive type 변수
* <queue> -Fifo
* <map> 
* <hash table>
* .
* .
* 
* 
* ArrayList list = new ArrayList();
* 
* ArrayList list<String> = new ArrayList<String>();
* 
* list.add("홍길동") index 0
* list.add("심청이") index 1
* list.add("박문수") index 2
* 
* ==>add 할수록 메모리가 늘어남
* 
* =>list.remove(1)
* 
* list.add("홍길동") index 0
* list.add("박문수") index 1
* 
* =========================
* 
* ArrayList -> Object형
* 
* add("심청이") - String
* add(1) -int
* add(10.5) -double
* 
* ==> loop 돌리기 어려움
* ==>데이터형을 통일시켜야 데이터 관리가 쉽다.  ==> 데이터형 통일 기능 : 제네릭스  ==>ArrayList<String> ==> 모든 데이터가 String으로 변환됨.
* 
* ============================
* 
* list.add(1, "apple"); 추가
* list.set(1, "apple"); 수정
* list.remove(1, "apple"); 삭제
* 
* 
* 
* 
* 
* 정적바인딩
*    ====> 메소드 호출
* 동적바인딩
* 
* 
* 
* 
* 
* 
* 	
*/ 
public class 컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
