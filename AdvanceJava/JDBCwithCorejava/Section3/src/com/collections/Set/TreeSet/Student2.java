package com.collections.Set.TreeSet;

public class Student2 implements Comparable{
	String name;
	int sid;
	public Student2(String name,int sid)
	{
		super();
		this.name = name;
		this.sid = sid;
	}
	public String toString() {
		return sid+" "+name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student2 s = (Student2) o;
		if(this.sid > s.sid)
			return 500;
		else if (this.sid < s.sid)
			return -800;
		
		return 0;
	}

}
