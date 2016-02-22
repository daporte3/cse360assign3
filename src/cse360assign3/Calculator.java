/**
 * @author Douglas Porter
 * @version 2.0, 2/22/2016
 * @description The calculator class, performs basic calculator operations on numbers
 */

package cse360assign3;

public class Calculator {

	private int total;
	
	/**
	 * @category constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
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
	}
	
	/**
	 * @return void
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * @return void
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * @return void
	 * @param value
	 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
	}
	
	/**
	 * @param none
	 * @return history
	 */
	public String getHistory () {
		return "";
	}
}
