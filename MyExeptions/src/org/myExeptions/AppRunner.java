package org.myExeptions;

import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		int num = 1234;
		int div = 0;

		try {
			Integer result = getDivResult(num, div);
		} catch (MyCustomExceptiom e) {
			logger.severe(e.getMessage());
			e.printStackTrace();
		}
		
	}

	private static Integer getDivResult(int num, int div) throws MyCustomExceptiom{
		Integer result = null;

		try {
			result = num / div;
		} catch (Exception e) {
			throw new MyCustomExceptiom("Something wrong!!!");
		}

		return result;
	}
}