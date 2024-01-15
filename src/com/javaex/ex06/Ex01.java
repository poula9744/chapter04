package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
/*		int[] lottoNoArray = new int[6];
		
		for(int i = 0; i<lottoNoArray.length; i++) {
			//랜덤함수
			lottoNoArray[i] = (int)(Math.random()*45)+1;
			
			//중복이 있을 경우 반복
			for(int j =0; j<i; j++) {
				if(lottoNoArray[i] == lottoNoArray[j]) {
					i--;
					 break;
		} 
*/
		
		
		Set<Integer> lSet = new HashSet<Integer>();
		
		//숫자가 6개 될 때까지 입력
		while(true) {
			if(lSet.size()>=6) {
				int no = (int)(Math.random()*45+1);
				break;
			}
			int no = (int)(Math.random()*45+1);
			lSet.add(no);
		}
		
		
		
		//중복 제거
		for(Integer lotto : lSet) {
			System.out.print(lotto + "\t");
		}
		

	}

}
