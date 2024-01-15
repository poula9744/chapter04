package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>(); //Set은 인터페이스 --> HashSet을 통해 객체 생성 
		
		//int a = 3 --> 3이 들어감 
		//Integer b = 3; --? new Integer(3);  --> 주소가 들어감 
		//제네릭은 항상 주소를 줘야 함 
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(6);
		Integer i03 = new Integer(9);
		Integer i04 = new Integer(6);
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);
		
		System.out.println(iSet.size());
		System.out.println(iSet.toString());
		
		
		System.out.println("-----------------------");
		/*
		for(int i=0; i<iSet.size(); i++) {
			iSet.get(i); --> set은 방번호가 없음 
		}*/
		
		//향상된 for문: 끝까지 돔 
		for(Integer num : iSet) {
			System.out.println(num.toString());
		}
		
	}

}
