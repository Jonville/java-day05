package java_class;

public class Test3 {
	public static void main(String[] args) {
		
		Dog dog = new Dog("뽀삐",5);		// 객체 생성	,  new Dog() 는 생성자를 의미함
									// 객체를 생성할때 Dog() 생성자에있는걸 호출한다. 
		
		Dog dog2 = new Dog("삐뽀",10);
		dog.speak();			// 이렇게 되면 부모클래스의 speak를 호출한다.
		
		System.out.println(dog.name);		// (자식클래스의 메소드 dog . 부모클래스의 변수 name)  <== 이렇게 사용가능
		System.out.println(dog2.name);
	}
	
}
