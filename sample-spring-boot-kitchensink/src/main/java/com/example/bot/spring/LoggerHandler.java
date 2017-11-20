package com.example.bot.spring;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoggerHandler implements EventHandler {

	private StorageEngine database = new PSQLDatabaseEngine();
	@Autowired
	private LineCommunicator lineCom;
	
	@Override
	public String handleEvent(ArrayList<String> inputArray) {
		database.logQuestion(inputArray.get(1));
		lineCom.pushCustomerNotification(new ArrayList<String>(Arrays.asList("U6c377e75e1d6c2b1f0805c82ebb880f9")), "Someone is asking: " + inputArray.get(1));
		return MessageHandler.DEFAULTANSWER;
	}

}
