/*
 * 	Copyright (c) 2018 Ivan Tay 
 * 
 * Base Page inheritance 
 * 
 */

package PageObject;

import Config.Util;//Common webdriver shared modules


import org.testng.Assert;



public class BasePage extends Util {
	

	public void validateCompareString(String expectedResult , String actualResult) {
		/*
		 * Compare strings and assert for result
		 */
		
		Assert.assertEquals(expectedResult, actualResult); //Compare actual and expected. Assert if false
		

	}
}
