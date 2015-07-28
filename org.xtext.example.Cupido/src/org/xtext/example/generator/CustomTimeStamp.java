package org.xtext.example.generator;

import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.impl.TimeStampImpl;

public class CustomTimeStamp extends TimeStampImpl {
	
	private static final CustomTimeStamp min = new CustomTimeStamp();
	private static final CustomTimeStamp max = new CustomTimeStamp();
	
	public void setVal(int value){
		val = value;
	}
	
	public void setEventReference(Event event){
		eventReference = event;
	}
	
	public void setShift(int shiftBy){
		shift = shiftBy;
	}
		
	public static CustomTimeStamp getMinTimeStamp(){
		min.setVal(0);
		return min;
	}

	public static CustomTimeStamp getMaxTimeStamp(){
		max.setVal(50000);
		return max;
	}
}
