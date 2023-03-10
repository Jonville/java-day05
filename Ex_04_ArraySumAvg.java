package day05_project;

import java.util.Arrays;

public class Ex_04_ArraySumAvg {

	public static void main(String[] args) {
		
		int[] score = {90,80,60,100};
		
		int totalScore = 0;
		
		double avgScore = 0;
		
		for(int i = 0 ; i < score.length; i++) {
			
			totalScore += score[i];
		}
		
		avgScore = (double)totalScore/score.length;
		
		System.out.println(Arrays.toString(score));
		
		System.out.println("합계 점수 : " + totalScore);
		System.out.println("합계 점수 : " + avgScore);
	}
	
}
