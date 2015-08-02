package org.xtext.example.generator;

import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.impl.TimeStampImpl;

public class CustomTimeStamp extends TimeStampImpl {
	
	private static final String minTime = "1000-01-01 00:00:00"; //This has to be SQL datetime values
	private static final String maxTime = "9999-12-31 23:59:59"; //This has to be SQL datetime values
	private static final CustomTimeStamp min = new CustomTimeStamp(minTime);
	private static final CustomTimeStamp max = new CustomTimeStamp(maxTime);
	
	private CustomTimeStamp(String value){
		val = value;
	}
	public void setVal(String value){
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
