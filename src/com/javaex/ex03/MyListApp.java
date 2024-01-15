package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		//점 관리
		MyList<Point> pList = new MyList<Point>();
		Point p01 = new Point(2,2);
		Point p02 = new Point(5,5);
		Point p03 = new Point(10,10);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		System.out.println(pList);
		
		
		//원 관리
		MyList<Circle> cList = new MyList<Circle>();
		Circle c01 = new Circle(100);
		Circle c02 = new Circle(200);
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(p03);
		//Circle에는 Circle만 넣고싶은데 point가 들어갈 수도 있음 
		//이를 해결하기 위해 제네릭 사용
		System.out.println(cList);
		
	}

}
