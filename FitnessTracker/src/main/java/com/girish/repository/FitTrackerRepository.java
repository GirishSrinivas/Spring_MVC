package com.girish.repository;

import java.util.List;

import com.girish.business.Activity;

public interface FitTrackerRepository {
	public List<Activity> findAllActivities();
}
