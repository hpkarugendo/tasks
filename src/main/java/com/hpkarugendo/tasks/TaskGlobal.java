package com.hpkarugendo.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class TaskGlobal {
	public static List<Integer> codes = new ArrayList<Integer>();

	public static int makeCode() {
		int code = new Random().ints(1001, 10000).findAny().getAsInt();
		if (TaskGlobal.codes.contains(code)) {
			while (TaskGlobal.codes.contains(code)) {
				code = new Random().ints(1001, 10000).findAny().getAsInt();
			}
		}
		codes.add(code);
		return code;
	}
}
