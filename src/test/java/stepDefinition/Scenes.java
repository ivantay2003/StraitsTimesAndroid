/*
 * Copyright Ivan Tay 2018
 */

package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import cucumber.api.java.en.Then;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;


import Config.DriverManager;
import PageObject.PageManager;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class Scenes extends PageManager {



	


	
	public void setup (){
		

		DriverManager.getInstance();
		
		setInitializePageObjects();
		
		

		
	}
	  
	

	  @Given("^I have installed Straits Times mobile app$") 
	  public void installAPK() { 
		  
		  setup();
		  
		  

	  } 
	  
	  @And("^I have passed through the registration$") 
	  public void registration() { 
		  
		  //Swipe all the 5 pages at the beginning
		  registerPage.SwipeAllPages();
		  
		  

	  }
	  
	  @When("^I have skip the advertisement and scroll down the home$") 
	  public void homeTab() { 
		  
		  //Homepage - wait for "Get Started with advertisement" to close
		  homePage.getStartedWith();
		  
	  }
	  
	  
	  @And("^I click on Singapore tab and scroll down to select an article$") 
	  public void singaporeTab() { 
		  
		  
		  
		  //Singapore page
		  singaporePage.scrollPage(); //scroll the main Singapore page
		  singaporePage.clickImageArticleAndScroll(); //Click an image article and scroll 
		  
		  

	  }
	  
	  @Then("^I click back and see Singapore page$") 
	  public void singaporeHomeTab() { 
		  
		  //Go back
		  menuPage.navigateBack();
		  

	  }
	
	
}
