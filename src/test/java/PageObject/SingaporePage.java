/*
 * Copyright Ivan Tay 2018
 */

package PageObject;

import org.openqa.selenium.By;

import Config.LOCELEMENT;

public class SingaporePage extends BasePage {

	
	public void scrollPage(){
		
		  IsPresence (By.xpath(LOCELEMENT.TAB_SINGAPORE_XPATH));
		  ClickElement (By.xpath(LOCELEMENT.TAB_SINGAPORE_XPATH));
		  
		  IsPresence (By.xpath(LOCELEMENT.GOTIT_XPATH));
		  ClickElement (By.xpath(LOCELEMENT.GOTIT_XPATH));
		  
		  IsPresence (By.xpath(LOCELEMENT.SINGAPORE_TOPSTORY_XPATH));
		  androidScrollDown(0,0,0,50);
		  androidScrollDown(0,0,0,50);
		  androidScrollDown(0,0,0,50);
		  
	}
	
	public void clickImageArticleAndScroll(){
		
		 IsPresence (By.xpath(LOCELEMENT.IMAGE_TITLE_XPATH));
		  ClickElement (By.xpath(LOCELEMENT.IMAGE_TITLE_XPATH));
		  
		  //Inside Article
		  IsVisible (By.xpath(LOCELEMENT.GOTIT_TEXTSPEECH_XPATH));
		  IsPresence (By.xpath(LOCELEMENT.GOTIT_TEXTSPEECH_XPATH));
		  ClickElement (By.xpath(LOCELEMENT.GOTIT_TEXTSPEECH_XPATH));
		  androidScrollDown(0,0,0,50);
		  androidScrollDown(0,0,0,50);
		  androidScrollDown(0,0,0,50);
		  
	}
}
