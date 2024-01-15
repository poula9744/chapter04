package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

//한 번에 import = ctrl + shift + o 


public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(5, 10);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet.toString()); 
		//[Point [x=3, y=6], Point [x=1, y=2], Point [x=5, y=10]]
		
		//설정을 해두지 않으면 어떤 것이 같은 건지 모름
		Point p04 = new Point(3, 6);
		pSet.add(p04);
		
		System.out.println(pSet.toString());
		//[Point [x=3, y=6], Point [x=1, y=2], Point [x=3, y=6], Point [x=5, y=10]]
		
		//같은 객체는 hashCode값을 가짐 
		System.out.println(p01.hashCode()); //3
		System.out.println(p02.hashCode()); //9
		System.out.println(p03.hashCode()); //15
		System.out.println(p04.hashCode()); //9
		
		//hashCode로 비교 후
		//[Point [x=1, y=2], Point [x=3, y=6], Point [x=5, y=10]]
		
	}

}
