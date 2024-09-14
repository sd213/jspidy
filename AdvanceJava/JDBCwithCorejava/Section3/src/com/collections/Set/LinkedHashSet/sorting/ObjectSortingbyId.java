package com.collections.Set.LinkedHashSet.sorting;

import java.util.Comparator;

public class ObjectSortingbyId implements Comparator<CustomObject>{

	@Override
	public int compare(CustomObject o1, CustomObject o2) {
		
		
		return (o1.getId()>o2.getId())? 1:((o1.getId()<o2.getId())? -1:  0);
	}
}
