package org.pluralsight.model;

import org.hibernate.validator.constraints.Range;

public class Exercise {

	private int minutes;
	private String activity;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	
}
