package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(2, 201216);
		Point p02 = new Point(5, 5);
		Point p03 = new Point(12, 22);
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		//{정우성=Point [x=2, y=201216], 박명수=Point [x=12, y=22], 이효리=Point [x=5, y=5]}
		
		System.out.println(pMap.get("정우성").getY());
		
		Point p04 = new Point(100, 100);
		pMap.put("박명수", p04); //key값을 같게
		System.out.println(pMap.toString());
		//{정우성=Point [x=2, y=201216], 박명수=Point [x=100, y=100], 이효리=Point [x=5, y=5]}
		//중복을 허용하지 않음 --> 나중에 온 걸로 수정됨 
		
		//키목록 [정우성, 이효리, 박명수]
		Set<String> keys = pMap.keySet();
		
		//키 전체 출력하기
		for(String name : keys) {
			System.out.print(name + " ");
		} 
		//정우성 박명수 이효리 
		System.out.println();
		
		//전체 출력하기 
		for(String name : keys) {
			System.out.println(pMap.get(name).toString());
		}
		//Point [x=2, y=201216]
		//Point [x=100, y=100]
		//Point [x=5, y=5]

	}

}
