package com.girish.business;

import org.hibernate.validator.constraints.Range;

public class Goal {
	
	@Range(min = 1, max = 120)
	private int minutes;

	public Goal() {
		super();
	}

	public Goal(int minutes) {
		super();
		this.minutes = minutes;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + minutes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goal other = (Goal) obj;
		if (minutes != other.minutes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Goal [minutes=" + minutes + "]";
	}
}
