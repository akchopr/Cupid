package org.xtext.example.generator;

import java.util.HashMap;
import java.util.Map;

public class Column {

  private static final String DELIMITER_REGEX = "[_]";
  private static int counter = 0;	
  private static Map<String,Column> allColumns = new HashMap<String,Column>();

  private String name = "";

  private Column() {
  }
  
  public static Column getColumn(String aName) {
		if (allColumns.containsKey(aName)) {
			return allColumns.get(aName);
		} else {
			Column theColumn = new Column();			
			theColumn.setName(aName);
			allColumns.put(aName, theColumn);
			return theColumn;
		}
	}

	public Column generateColumn () {
		String[] tokens = this.getName().split(Column.DELIMITER_REGEX);
//		int current = ((tokens.length == 1)
//					   ? 0
//					   : Integer.parseInt(tokens[1]));
		
		String coreName = tokens[0];
		String newName = coreName + Column.getIncrementedCounter();
		
		Column theColumn = Column.getColumn(newName); 
		return theColumn;
	}

	private static int getIncrementedCounter() {
		return ++counter;
	}

	String getFullName() {
		return name;
	}

	private String getName() {
		return name;
	}

	private void setName(String n) {
		name = n;
	}
	
	
}
