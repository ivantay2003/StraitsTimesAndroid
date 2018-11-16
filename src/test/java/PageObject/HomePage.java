/*
 * Copyright Ivan Tay 2018
 */

package PageObject;

import org.openqa.selenium.By;

import Config.LOCELEMENT;
import Config.Util;

public class HomePage extends Util {
	
	public void getStartedWith (){
	//Clear advertisement 	
		  
		  IsPresence (By.xpath(LOCELEMENT.GETSTARTED_XPATH));
		  ClickElement (By.xpath(LOCELEMENT.GETSTARTED_XPATH));
		  
		  //IsPresence (By.xpath(LOCELEMENT.HOME_TITLE_XPATH));
		  
//		  try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		  closeAdvertisement();
		
	}
	
	private void closeAdvertisement(){
		
		IsPresence (By.xpath(LOCELEMENT.AD_CLOSE_XPATH));
		ClickElement (By.xpath(LOCELEMENT.AD_CLOSE_XPATH));
	}

}
