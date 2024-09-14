package com.collectionclass.searchoperations;

import java.util.Comparator;

public class UserSorting implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
//		Integer i1 = (Integer) o1, i2 = (Integer) o2;
		return i1>i2 ? -1 :(i1<i2?1:0);
	}
	
	
}
