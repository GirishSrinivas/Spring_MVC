package com.girish.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.girish.business.Activity;

@Repository
public class FitTrackerRepositoryImpl implements FitTrackerRepository {

	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<>();
		
		Activity run = new Activity();
		run.setDesc("run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("bike");
		activities.add(bike);
		
		Activity jog = new Activity();
		jog.setDesc("jog");
		activities.add(jog);
		
		Activity swim = new Activity();
		swim.setDesc("swim");
		activities.add(swim);
		
		Activity play = new Activity();
		play.setDesc("play");
		activities.add(play);
		
		return activities;
	}

}
