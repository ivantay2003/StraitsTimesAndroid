/*
 * Copyright Ivan Tay 2018
 */

package PageObject;

import org.openqa.selenium.By;

import Config.DIRECTION;
import Config.LOCELEMENT;

public class RegisterPage extends BasePage {
	

	public RegisterPage (){
		

		
	}
	
	public void SwipeAllPages (){
		
		  ClickElement (By.xpath(LOCELEMENT.AGREE_BTN_XPATH));
		  
		  IsPresence (By.xpath(LOCELEMENT.WELCOME_XPATH));
		  swipe(DIRECTION.RIGHT, 1000);
		  //AndroidSwipe(0,0,850,0,1000);
		  //AndroidSwipe(0,0,150,0,1000);
		  IsPresence (By.xpath(LOCELEMENT.WELCOME_HOMEPAGE_XPATH));
		  swipe(DIRECTION.RIGHT, 1000);
//		  AndroidSwipe(0,0,100,0,1000);
//		  AndroidSwipe(0,0,150,0,1000);
		  IsPresence (By.xpath(LOCELEMENT.WELCOME_PREMIUM_XPATH));
		  swipe(DIRECTION.RIGHT, 1000);
//		  AndroidSwipe(0,0,100,0,1000);
//		  AndroidSwipe(0,0,150,0,1000);
		  IsPresence (By.xpath(LOCELEMENT.WELCOME_HOMEPAGE_XPATH));
		  swipe(DIRECTION.RIGHT, 1000);
//		  AndroidSwipe(0,0,150,0,1000);
//		  AndroidSwipe(0,0,150,0,1000);
		  IsPresence (By.xpath(LOCELEMENT.WELCOME_PREMIUM_XPATH));
		  swipe(DIRECTION.RIGHT, 1000);
//		  AndroidSwipe(0,0,150,0,1000);
//		  AndroidSwipe(0,0,150,0,1000);
		  IsPresence (By.xpath(LOCELEMENT.WELCOME_PREMIUM_XPATH));
		  swipe(DIRECTION.RIGHT, 1000);
//		  AndroidSwipe(0,0,150,0,1000);
//		  AndroidSwipe(0,0,150,0,1000);
	//
//		  
		
	}

}
