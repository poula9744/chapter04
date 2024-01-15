package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		/*
		Point[] pArray = new Point[100]; //배열은 갯수를 확정해야한다
		Point p01 = new Point(2, 2);
		Point p02 = new Point(12, 13);
		Point p03 = new Point(22, 23);
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		*/
		PointList pList = new PointList();
		
		Point p01 = new Point(2, 2);
		Point p02 = new Point(12, 13);
		Point p03 = new Point(22, 23);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		int count = pList.size();
		System.out.println(count);
		
		Point p = pList.get(0);
		System.out.println(p.getX());
		
		System.out.println(pList.toString());
		
		//원 관리
		CircleList cList = new CircleList();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.toString());
		
	}

}
