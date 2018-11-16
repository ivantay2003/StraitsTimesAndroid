/*
 * Copyright Ivan Tay 2018
 */

package ST;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.DIRECTION;
import Config.DriverManager;
import Config.LOCELEMENT;
import Config.Util;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import PageObject.HomePage;
import PageObject.MenuPage;
import PageObject.PageManager;
import PageObject.RegisterPage;
import PageObject.SingaporePage;



public class TestScenario extends PageManager {

	
	
	
	@BeforeTest
	public void setup (){
		

		DriverManager.getInstance();
		
		setInitializePageObjects();
		
		

		
	}


	
	
	
  @Test
  public void f() {
	  
	  

	  //Swipe all the 5 pages at the beginning
	  registerPage.SwipeAllPages();
	  
	  //Homepage - wait for "Get Started with advertisement" to close
	  homePage.getStartedWith();
	  
	  //Singapore page
	  singaporePage.scrollPage(); //scroll the main Singapore page
	  singaporePage.clickImageArticleAndScroll(); //Click an image article and scroll 

	  //Go back
	  menuPage.navigateBack();
	  
  }
}
