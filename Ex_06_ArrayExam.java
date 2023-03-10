package day05_project;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_06_ArrayExam {

	public static void main(String[] args) {
		// 1-1번
//		Scanner 클래스를 통해 6개의 공간을 가지는 int형 배열에 값을 입력한다.
//		(단, 0이하의 숫자를 입력할 경우 저장하지 않고 1이상의 숫자를 입력하라는 안내문구를 띄운다)
//		 ex) {10, 5, 3, 8, 20, 15}
		Scanner s = new Scanner(System.in);
		int array[] = new int[6];
		System.out.println("숫자 6개 입력해주세요. (양수)");
		for (int i = 0; i < array.length; i++) {
			int num = s.nextInt();
			if (num <= 0) {
				System.out.println("1이상의 숫자를 입력해 주세요.");
				i--;
			} else {
				array[i] = num;
			}
		}
		System.out.println(Arrays.toString(array));

//		1-2. 입력받은 배열의 숫자에 순차적으로 접근하여 홀수일 경우 음수로 바꿔준다.
//		 ex) {10, -5, -3, 8, 20, -15}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				array[i] = -array[i];
			}
		}
		System.out.println(Arrays.toString(array));

//		1-3. 배열내 양수의 평균을 구한다.(소수점까지) 
//		1-4. 배열내 음수의 개수를 구한다. 

//		int sum = 0;
//		int cnt = 0;
//		for(int i=0; i<array.length; i++) {
//			if(array[i] > 0) {
//				sum += array[i];
//				cnt++;
//			}
//		}
//		System.out.println((double)sum/cnt);
//		System.out.println(array.length - cnt); // 음수 갯수

		// 5번
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if ((array[j] > 0 && array[j - 1] < 0) && j % 2 == 1) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

		// 5번-2
		int pArray[] = new int[array.length];
		int mArray[] = new int[array.length];
		int index = 0;
		int index2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				pArray[index] = array[i];
				index++;
			}

			if (array[i] < 0) {
				mArray[index2] = array[i];
				index2++;
			}
		}

		int newArray[] = new int[array.length];
		index = 0;
		for (int i = 0; i < array.length; i++) {
			if (pArray[i] != 0) {
				newArray[index++] = pArray[i];
			}
			if (mArray[i] != 0) {
				newArray[index++] = mArray[i];
			}
		}
		System.out.println(Arrays.toString(newArray));

		// 6번
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.abs(array[i]);
		}
		Arrays.sort(array);
		System.out.println(array[array.length - 1] - array[0]);
		System.out.println("(" + array[array.length - 1] + "," + array[0] + ")");

	}

}
