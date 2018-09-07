package com.girish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girish.business.Activity;
import com.girish.repository.FitTrackerRepository;

@Service
public class FitTrackerServiceImpl implements FitTrackerService {

	@Autowired
	FitTrackerRepository fitTrackerRepo;
	
	@Override
	public List<Activity> findAllActivities() {
		return fitTrackerRepo.findAllActivities();
	}

}
