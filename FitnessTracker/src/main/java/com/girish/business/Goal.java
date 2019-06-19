package com.girish.business;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Range;

@Entity
public class Goal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Range(min = 1, max = 120)
	private int minutes;

	public Goal() {
		super();
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		if (id != other.id)
			return false;
		if (minutes != other.minutes)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Goal [id=" + id + ", minutes=" + minutes + "]";
	}
}
