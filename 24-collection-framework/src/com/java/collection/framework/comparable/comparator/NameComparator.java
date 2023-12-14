package com.java.collection.framework.comparable.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Students> {

	@Override

	public int compare(Students students1, Students students2) {
		if (students1.getName().length() == students2.getName().length())
			return 0;
		else if (students1.getName().length() < students2.getName().length())
			return 1;
		else
			return -1;
	}

}
