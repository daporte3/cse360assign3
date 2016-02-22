/**
 * @author Douglas Porter
 * @version 3.0, 2/22/2016
 * @description The calculator class, performs basic calculator operations on numbers
 */

package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	/**
	 * @category constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		
		history = "0";
	}
	
	/**
	 * @param none
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * @return void
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		
		String valString = Integer.toString(value);
		history = history + " + ";
		history = history + valString;
	}
	
	/**
	 * @return void
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		
		String valString = Integer.toString(value);
		history = history + " - ";
		history = history + valString;
	}
	
	/**
	 * @return void
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		
		String valString = Integer.toString(value);
		history = history + " * ";
		history = history + valString;
	}
	
	/**
	 * @return void
	 * @param value
	 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
			
			history = history + " / 0 ";
		}
		else
		{
			total = total / value;
			
			String valString = Integer.toString(value);
			history = history + " / ";
			history = history + valString;
		}
	}
	
	/**
	 * @param none
	 * @return history
	 */
	public String getHistory () {
		return history;
	}
}
