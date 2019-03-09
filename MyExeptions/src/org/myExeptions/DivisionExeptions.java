package org.myExeptions;

public class DivisionExeptions {

	public static void main(String[] args) {

		Division division = new Division();
		
		try {
			division.getDivision(1/0);
		} catch (ArithmeticException e) {

			System.err.println("The split to 0 is not correct");
		}
		
		
		
	}

}
