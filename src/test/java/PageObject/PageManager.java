/*
 * Copyright Ivan Tay 2018
 */

package PageObject;

import Config.DriverManager;
import Config.Util;

public class PageManager {

	//Page objects
	public static Util cmon ;
	public static HomePage homePage = new HomePage() ;
	public static MenuPage menuPage = new MenuPage();
	public static RegisterPage registerPage = new RegisterPage() ;
	public static SingaporePage singaporePage = new SingaporePage();
	
	public static void setInitializePageObjects (){
		/*
		 * Create an instance of page objects , 
		 * Initialize all pages with configuration 
		 * Get the web drivers for common
		 */
		
		cmon = new Util();
		Util.AddAndroidDriver(DriverManager.androiddriver);
		
	
	}
	
	
	
	
}
