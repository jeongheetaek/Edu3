package Ch03_start;

public class StringConcatExample {
	public static void main(String[] args) {
		int a = 10;
		int b= 20;
		System.out.println(a+b); //산술연산자

		///////연산은 앞에서부터 이뤄진다. 1번의 str은 문자열로 실행
		
		String str1 = "JDK" + 8 + 8.0;//문자열과 Double 타입이라 서로 타입이 다르다.
		System.out.println(str1);
		
		///////연산은 앞에서부터 이뤄진다. 2번의 str은 int로 실행 후 문자열로 수행
		String str2 = 8 + 8.0+"JDK";//문자열과 Double 타입이라 서로 타입이 다르다. 
		System.out.println(str2);	
		

		String str3 = a + b + "JDK";//문자열과 Double 타입이라 서로 타입이 다르다. 
		System.out.println(str3);	
		

		String str4 = "JDK"+a+b;//문자열과 Double 타입이라 서로 타입이 다르다. 
		System.out.println(str4);
		
		String strr1 = new String("홍길동");
		String strr2 = new String("홍길동");
		System.out.println(strr1);
		System.out.println(strr2);
				
		String strr3 = "홍길동";
		String strr4 = "홍길동";
		System.out.println(strr3);
		System.out.println(strr4);
		
		System.out.println("\n\n비교중");
		System.out.println(strr1 == strr2);  //객체간이 비교에서는 ==를 사용하면 안된다.== 으로 할 땐 수치비교시 사용한다.
		System.out.println(strr1 == strr3);
		System.out.println(strr3 == strr4);
		
		System.out.println("\n\n비교중");
		System.out.println(strr1.equals(strr2));  //객체간이 비교에서는 ==를 사용하면 안된다. equals(): 객체비교, 문자열비교 에 사용한다.
		System.out.println(strr1.equals(strr3));
		System.out.println(strr3.equals(strr4));
		
	}
}
