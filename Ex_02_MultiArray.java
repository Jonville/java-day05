package day05_project;

import java.util.Arrays;

public class Ex_02_MultiArray {

	public static void main(String[] args) {

		
		int arr[] = {1,2,3,4,5};		// 배열은 객체 변수 -> 주소를 갖고있는다.

		int arr2[];
		
		int newArr[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			newArr[i] = arr[i];
			
		}
		
		
		arr2 = arr;		// arr의 저장 주소와 arr2 의 저장 주소가 같다. (공유 주소 관계) 주소!! 위치!!
		
		arr2[0] = 100;
		
		newArr[0] = 200;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr2));


		
	}

}
