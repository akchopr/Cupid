package org.xtext.example.generator;

import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.impl.TimeStampImpl;

public class CustomTimeStamp extends TimeStampImpl {
	
	public void setVal(int value){
		val = value;
	}
	
	public void setEventReference(Event event){
		eventReference = event;
	}
	
	public void setShift(int shiftBy){
		shift = shiftBy;
	}

}
