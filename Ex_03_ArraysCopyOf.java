package day05_project;

import java.util.Arrays;

public class Ex_03_ArraysCopyOf {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};		// 배열은 객체 변수 -> 주소를 갖고있는다.
		int arr2[];
		
		arr2 = Arrays.copyOf(arr, 3);		// (배열명 , 몇개 복사할건지 범위)
		arr2[0] = 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
