package java_class;

public class Human {
	
	String name ; 
	int age;
	String address;
	String phoneNum;
	
	Human(String name) {
		this(name, "알수없음");
	}
	
	Human(String name, String address){
		this(name, address, "알수없음");
	}
	
	Human(String name, String address, String phoneNum){
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		
	}
	Human(String name, String address, String phoneNum, int age){
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.age = age;
		
	}
	
	public String toString() {
		return "이름은 " + name + ", 주소는 " + address + ", 핸드폰 번호는 " + phoneNum + " 입니다.";
	}

	
	
}
