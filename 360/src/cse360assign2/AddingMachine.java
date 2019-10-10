package cse360assign2;

/**
 * Represents a calculator that can add and subtract numbers
 * then prints the final value
 */
public class AddingMachine{
	/**
	 * Holds the final value for the operations done with the calculator
	 */
	private int total;
	
	/**
	 * Holds the order of operations and values passed into the calculator
	 */
	private String calchistory;
	
	/**
	 * creates a new AddingMachine with the final value initialized to 0
	 */
	public AddingMachine(){
		total = 0; //not needed - included for clarity
		calchistory = "0";
	}
	
	/**
	 * gets the total value after all operations
	 * @return total - this is the running total of all calculations
	 */
	public int getTotal(){
		return total;
	}
	
	/**
	 * adds some value to the running total
	 * adds to the record of calculations
	 * @param value - value to be added to the running total
	 */
	public void add(int value){
		total += value;
		calchistory += " + " + value;
	}
	
	/**
	 * subtracts some value from the running total
	 * adds to the record of calculations
	 * @param value - value to be subtracted from the running total
	 */
	public void subtract(int value) {
		total -= value;
		calchistory += " - " + value;
	}
	
	/**
	 * organizes the operations and numbers used in the calculations
	 * of the running total
	 * @return calchistory - this will contain the operations and values in order
	 * 				for the calculations to the running total
	 */
	public String toString() {
		return calchistory;
	}
	
	/**
	 * resets all variables within the class to there initial values
	 */
	public void clear() {
		total = 0;
		calchistory = "0";
	}
	
}
