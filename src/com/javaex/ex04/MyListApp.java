package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		//add(), size(), get(), remove()
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(2, 10);
		Point p02 = new Point(2, 3);
		Point p03 = new Point(3, 3);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		pList.add(p01); //중복 저장 가능
		
		System.out.println("size= " + pList.size()); //4
		
		//방법 1: 변수로 y값
		System.out.println(p01.getY());
		
		//방법 2: 리스트를 통해서 y값
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		
		//방법 3: 리스트를 통해서 y값
		Point var01 = pList.get(0);
		System.out.println(var01.getY());
		
		System.out.println("---------------------------");
		
		//전체 출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("---------------------------");
		
		//__번째 방 지우기
		pList.remove(0); 
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("---------------------------");
		
		pList.remove(p02);
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("---------------------------");
		
		System.out.println(pList.toString());
		
		
		/////////////////////////////////////////////////////
		
		List<Integer> iList = new ArrayList<Integer>();
		
		Integer i01 = 3; //자동 박싱
		Integer i02 = 6;
		
		iList.add(i01);
		iList.add(i02);
		
		System.out.println(iList.toString());
		
		iList.get(0).parseInt(null);
		
	}

}
