package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService {

	public Mood getCurrentMood() {
		List<String> moods = new ArrayList<String>();
		moods.add("happy");
		moods.add("angry");
		moods.add("excited");
		moods.add("sad");
		
		Random ran = new Random();
		int random = ran.nextInt(4);
		return new Mood(moods.get(random));
		
	}
	
	public String getExplanation(String mood) {
		
	if (mood.equalsIgnoreCase("happy"))
		return "Got a promotion.";
	else if (mood.equalsIgnoreCase("angry"))
		return "My mobile doesnot work.";
	else if (mood.equalsIgnoreCase("excited"))
			return "I got a new job.";
	else if (mood.equalsIgnoreCase("sad"))
			return "I lost my free time.";
	
	return "I dont know.";
	}
}
