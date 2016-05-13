package org.pluralsight.model;

import org.hibernate.validator.constraints.Range;

public class Exercise {

	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
