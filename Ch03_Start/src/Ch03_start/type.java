package Ch03_start;

public class type {

	static final int KK = 100; //상수 고정된 값 변화하지않는다.
	
	public static void main(String[] args) {
		
		System.out.println(type.KK);
		
		
		byte by1 = 127; //-128~127
		System.out.println(by1);
		
		short sh1 = 32767;
		System.out.println(sh1);
		
		int in1 = 1000000000; // default : 정수형의 기본타임
		System.out.println(in1);
		
		int in2 = by1; //자동 형 변환 (promotion)
		System.out.println(in2);
		
		//short sh2 = in1; //강제 형 변환이 필요하다. (Casting) 아래로 변형 (4byte => 2byte)에 저장
		short sh2 = (short) in1; //마우스 올려서 (short)를 추가
		System.out.println(sh2);
		
		long lo = 10000000000L;
		System.out.println(lo);
				
		float flo=23.45F; //4byte
		System.out.println(flo);
		
		double dou = 23.45; //8byte
		System.out.println(dou);
		
		double dou2 = 23.45D;
		System.out.println(dou2);
		
		boolean b= true;
		System.out.println(b);
		
		char c = 't';
		System.out.println(c);
		
		int ch_in = c; //작은타입에서 큰타입으로 변환하는 것은 자동형변환
		System.out.println(ch_in);
		
		String c1 = "dfdfd";
		System.out.println(c1);
		
		int i_go = (int) 128l;
		i_go = 128;
		
		if(i_go < Byte.MIN_VALUE || i_go > Byte.MAX_VALUE) {
			System.out.println("바이트 타입으로 변환할 수 없습니다.");
		}
		else {
			byte bb = (byte) i_go;
			System.out.println(bb);
			
		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.parseInt("200"));
		//int ab = Integer.parseInt("1925837893748923471298347298567213894");
		int ab = Integer.parseInt("33");
		System.out.println(ab);
		
		
		int intValue = 10;
		double doubleValue = 5.5;
		
		double result = intValue + doubleValue;
		
		System.out.println(result);
		
		
	}

	
	
	
}
