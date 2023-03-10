package java_class;

public class HumanMain {

	public static void main(String[] args) {

		Human hong = new Human("홍길동");
		
		System.out.println(hong);
		
		Human yu = new Human("유재석" , "인천");
		
		System.out.println(yu);
		
		Human kang = new Human("강호동" , "서울" , "010-1234-5678");
		
		System.out.println(kang);
		
		Human park = new Human("박명수" , "부산" , "010-9876-4321", 50);
		
		System.out.println(park);
		

		
	}

}
