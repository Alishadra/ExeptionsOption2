package org.myExeptions;

public class Division {
	
	private int number;
	
	public void getDivision(int number) {
		
		int div = number/number;
		
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) throws Exception {
		
		if (number <= 0) {
			throw new Exception();
		}
		this.number = number;
	}
	
	

}
