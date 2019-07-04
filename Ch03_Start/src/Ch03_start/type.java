package Ch03_start;

public class type {

	public static void main(String[] args) {
		
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
	
	}

}
