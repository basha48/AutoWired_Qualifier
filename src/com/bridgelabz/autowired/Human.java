package com.bridgelabz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("heartbeat")
	public Heart heart;

	
	public void startPumping() {
		heart.pump();
	}

}
