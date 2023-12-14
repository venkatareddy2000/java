package com.java.collection.framework.comparable.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {

	@Override
	public int compare(Students students1, Students students2) {
		if (students1.getAge() == students2.getAge())
			return 0;
		else if (students1.getAge() > students2.getAge())
			return 1;
		else
			return -1;

	}

}
