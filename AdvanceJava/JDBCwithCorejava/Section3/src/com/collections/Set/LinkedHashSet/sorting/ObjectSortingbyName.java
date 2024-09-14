package com.collections.Set.LinkedHashSet.sorting;

import java.util.Comparator;

public class ObjectSortingbyName implements Comparator<CustomObject> {

	@Override
	public int compare(CustomObject o1, CustomObject o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
