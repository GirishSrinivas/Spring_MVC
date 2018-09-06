package com.girish.business;

public class Exercise {
	private String exercise;
	private int minutes;
	
	public Exercise() {
		super();
	}

	public Exercise(String exercise, int minutes) {
		super();
		this.exercise = exercise;
		this.minutes = minutes;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
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
		result = prime * result + ((exercise == null) ? 0 : exercise.hashCode());
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
		Exercise other = (Exercise) obj;
		if (exercise == null) {
			if (other.exercise != null)
				return false;
		} else if (!exercise.equals(other.exercise))
			return false;
		if (minutes != other.minutes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exercise [exercise=" + exercise + ", minutes=" + minutes + "]";
	}
	
	
}
