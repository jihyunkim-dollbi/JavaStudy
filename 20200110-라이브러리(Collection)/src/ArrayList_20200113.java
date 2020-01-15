/*
 * ArrayList
 * 
 * 
 * 메모리에 저장 -> 제어
 * 
 * 1. 변수 : 한개저장
 * 2. 배열 : 같은 타입의 데이터 여러개 저장(직렬로 저장됨)
 * 3. 클래스 : 다른 타입의 데이터 여러개 저장(병렬로 저장되어짐) ==> 자료구조로 저장(메모리 저장상태) => arraylist사용함- collection필요됨
 * 
 *   	1) 일률적 순서, 데이터중복 => List(가장 많이 쓰임!)
 *   
 *   	2) 순서x, 데이터중복x => Set
 *   	
 *   	3) key 중복x, 값 중복 ok => Map-> MyBatis, Spring(키를 부여해서 키를 주고 주소를 가져옴 - 싱클톤 방법)
 * 
 *  List -> 
 *  
 *  collection => interface-> 통일화(library)- List(CURD메소드 모두 가지고 있다.)- 하나의 interface로 3개 모두 구현 가능하다. 동일한 코딩 가능.
 *  																	 - ArrayList - 데이터베이스, 웹
 *  											   						 - Vector - 네트워크
 *  											   						 - LinkedList
 *  																		
 *  									    - Set
 *  										- Map
 * 	ArrayList list = new ArrayList(); => add전엔 메모리공간 x
 * 	add후에 가변형으로 변함
 * 
 * 
 * list.add("a") ==> "b"
 * 
 * 0 1 2
 * a b c  ==> 순차적으로 데이터가 생김
 * 
 * 인덱스번호나 값을 가지고 배열 수정 삭제 추가 가능--> 인덱스 번호가 수시로 바뀌게 됨.인덱스 번호 자동 조절! -> 속도가 느려지나 사용이 매우 편리
 * 
 * 
 * 메모리를 어떻게 줄일것인가..
 * 배열은 메모리 조절이 불가능하나  ArrayList는 알아서 메모리를 값만큼만 잡아줘서 메모리조절에 효과적-> 훨씬 많이 사용!
 * 루프가 많이 돌수록 속도가 낮아짐.
 * 따라서 가변형 프로그램이 최적화에 좋다! than 고정형.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class ArrayList_20200113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
