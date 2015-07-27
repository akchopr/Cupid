package org.xtext.example.generator;

import java.util.HashMap;
import java.util.Map;

import org.xtext.example.generator.EventOperator;

public class EventOperator {

  private String opName;

  private static Map<String,EventOperator> allOperators = new HashMap<String,EventOperator>();

  final static EventOperator ID = EventOperator.instantiateOp("id"); // Base case

public static final EventOperator SINGLETON = new EventOperator("singleton");
  static EventOperator INTERSECTION = new EventOperator("intersect");
  static EventOperator UNION = new EventOperator("union");
  static EventOperator DIFF = new EventOperator("diff");
  static EventOperator NATJOIN = new EventOperator("join");
  static EventOperator CROSS = new EventOperator("cross"); 
  static EventOperator SELECT = new EventOperator("select");
  static EventOperator PROJECT = new EventOperator("project");
  static EventOperator RENAME = new EventOperator("rename");
  static EventOperator THETAJOIN = new EventOperator("join");
  static EventOperator TIMESINGLETON = new EventOperator("timesingleton");
  static EventOperator LEFTOUTERJOIN = new EventOperator("leftouterjoin"); 

  private EventOperator (String _op) {
    opName = _op;
  }

  private static EventOperator instantiateOp (String _op) {
	  EventOperator evOp = new EventOperator(_op);
	  allOperators.put(_op, evOp);
	  return evOp;  
  }
  
  public static EventOperator getOp(String _op) {
	  return allOperators.get(_op);
  }
  
  public String toString() {
	  return opName;
  }
  
}
