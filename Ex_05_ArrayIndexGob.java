package day05_project;

import java.util.Arrays;

public class Ex_05_ArrayIndexGob {

	public static void main(String[] args) {

		int num1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num2[] = new int[10];

		for (int i = 0; i < num1.length; i++) {

//			num2[i] = num1[i] * num1[i];
			num2[i] = (int) Math.pow(num1[i], 2);		//Math.pow(제곱할수 , 몇 제곱 할건지);
		}

		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
	}

}
