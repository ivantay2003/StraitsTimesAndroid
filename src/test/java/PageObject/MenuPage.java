/*
 * Copyright Ivan Tay 2018
 */

package PageObject;

import org.openqa.selenium.By;

import Config.LOCELEMENT;

public class MenuPage extends BasePage {
	
	public void navigateBack(){
		
		//Go back
		ClickElement (By.xpath(LOCELEMENT.MENU_BACK_XPATH));
	}

}
