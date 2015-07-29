package org.xtext.example.generator;

import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.impl.TimeStampImpl;

public class CustomTimeStamp extends TimeStampImpl {
	
	private static final int minTime = 0; //This has to be SQL datetime values
	private static final int maxTime = 1000000; //This has to be SQL datetime values
	private static final CustomTimeStamp min = new CustomTimeStamp(minTime);
	private static final CustomTimeStamp max = new CustomTimeStamp(maxTime);
	
	private CustomTimeStamp(int value){
		val = value;
	}
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
		return min;
	}

	public static CustomTimeStamp getMaxTimeStamp(){
		return max;
	}
}
