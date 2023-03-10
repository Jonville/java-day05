package java_class;

public class StudentMain {

	public static void main(String[] args) {

		Student student1 = new Student("홍길동", 30, 170.5);
		Student student2 = new Student("김철수", 20, 180.5);

		student2.height = 160.5;

		student1.study();
		
		System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 키 : " + student1.height);
		System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 키 : " + student2.height);

	}

}
