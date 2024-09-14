package com.section3.tasks.q4;

import java.util.Comparator;

public class SortingH implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		Double h1 = o1.getHeight();
		Double h2 = o2.getHeight();
		return h1>h2?1:(h1<h2)?-1:0 ;
	}

}
class SortingW implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		Double w1 = o1.getWeight();
		Double w2 = o2.getWeight();
		return w1>w2?1:(w1<w2)?-1:0 ;
	}
	
}