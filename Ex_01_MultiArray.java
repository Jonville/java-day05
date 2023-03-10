/*
 * 1. 학년마다 평균
 * 
 * 2. 총 평균
 */


package day05_project;

import java.util.Arrays;

public class Ex_01_MultiArray {

	public static void main(String[] args) {

		double score[][] = { { 3.3, 3.4 }, // 1학년 1, 2학기 평점
				{ 3.5, 3.6 }, // 2학년 1, 2학기 평점
				{ 3.7, 4.0, 4.3 }, // 3학년 1, 2학기 평점
				{ 4.1, 4.2 } }; // 4학년 1, 2학기 평점
		
		double allSum = 0;
		
		int cnt = 0;
		

		for (int i = 0; i < score.length; i++) { // score.length = 4
			double sum = 0;
			for (int j = 0; j < score[i].length; j++) {	// score[i].length ==> 2나 3이 될수있음
				System.out.println(score[i][j]); 
				
				sum += score[i][j];
				allSum += score[i][j];
				cnt++;
				
			}
			
			System.out.println(i+1 + "학년 평균 : " + (sum/score[i].length));
			
		}
		System.out.println("전체 학년 평균 : " + (allSum/cnt));


	}

}
