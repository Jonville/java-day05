package java_class;

public class Dog extends Animal {
	
	
	int test;
	Dog() {
		
		System.out.println("test");
	}

	Dog(String name){		// 
	
	}
	
	
	Dog(String name, int age){	//생성자 ===> 클래스이름과 같음			// (String name, int age) == 매개변수 (parameter)
		this.name = name;		//this.name 은 현재 가리키고있는 객체의 변수 name , name 은 Dog 의 변수 name.
		this.age = age;			// this <- 본인객체
		System.out.println(age + " 살 " + name + "가 짖는다.");
	}
	
	void speak(String name, int age) {		// 메소드 오버라이딩 (메소드 재정의)
										// 데이터 타입과 순서에 맞게 main 메소드에 적어줘야합니다.
									
		System.out.println(age + " 살 " + name + "가 짖는다."); // main 에있는 값을 받아서 name , age 에 가져온다.
	}

}
