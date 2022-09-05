package com.springautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	private FortuneService fortuneservice;
	
  @Autowired
	public TennisCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}


	@Override
	public String getDailyWorkout() {
		return " Practise Cricket match 30minutes";
	}


	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune();
	}

}
