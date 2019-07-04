package Ch03_start;

public class Start_Two{
	
	//전역변수 == field , 초기화를 할 필요가 없다. 
	int a=9; //인스턴스 변수 //하나의 변수를 저장할 수 있는 변수
	static int b=3; //static 변수
	
	public static void main(String[] args) { // 호출이된 파라미터 (String [] 문자열 배열로 되어있는 데이터를 받아오겠다.
		// 지역변수 : 메소드안에 존재, 반드시 초기화를 해야한다.
		int c=0; //기본형 변수 -- 실제값을 가지고있다.
		
		Start_Two be = new Start_Two(); //객체생성 //be 같은 변수를 참조변수라고 한다. (be는 Start_Two 클래스 안의 내용만 가지고있다.) -- 주소값을 가지고있다. 그럼 Start_Two 은 참조타입
		System.out.println(be.a);

		System.out.println(b);
		System.out.println(Start_Two.b);
		
		System.out.println(c);
		
		be.add(); //아래 void를 호출하기 위해서 (출력을 위해 실행)
		multyply();
		System.out.println("나누기 = "+be.divide(10, 2)); //10, 2같은 건 argument(인수)에 해당한다.
		System.out.println(be.kk);
		
	}
	long kk;
	//아래 메소드들은 인스턴스 메소드 / static은 static 메소드
	int divide(int a, int b) { //메소드 안에 들어있는 a,b를 parameter 변수 (매개변수)
		
		kk=10;
		int result = a/b;
		return result;
		
	}
	//인스턴스 메소드 (생성한 함수)
	void add() { 
		System.out.println("합 = "+a+b);
		
	}
	//static 메소드
	static void multyply() {
		Start_Two next = new Start_Two();
		System.out.println("곱 = "+next.a*b);
	}

}


// boolean - 참거짓, char - 문자 1개, byte - +-8(1byte) , short -3만(4byte), int +-21억(8byte), long >+-21억, float, double - 소수점 