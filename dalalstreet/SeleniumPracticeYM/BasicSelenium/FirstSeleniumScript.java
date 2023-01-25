package com.BasicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {				
	public static void main(String []args) throws InterruptedException {
		// System = Class, setProperty = method, key of browser = webdriver.chrome.driver
		//Path of browser exe = value
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe"); // while passing key letters are in lower case
		
		//upcasting 			//class 
		WebDriver driver = new ChromeDriver();
		//Interface //obj ref variable
		
		driver.manage().window().maximize(); // for maximizing browser window
		//driver - obj reference variable
		//manage() - method of option interface\
		//window() - Interface of driver class
		//maximize - method. 
		
		//as a best practice we should clear all cookies so broswer do not confuse in the different cookies at the time of execution
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().minimize(); // for maximizing browser window
		// driver - obj reference variable
			//manage() - method of option interface\
			//window() - Interface of driver class
			//minimize - method. 
		
		//driver.manage().window().fullscreen(); //For making full screen
		
		//particular URL will run on browser
		driver.get("https://www.facebook.com/");
		
		//Wait for some specific time
		Thread.sleep(2000); //Thread = Class and sleep = method 
		//Interrupted exception need to be declared in main method for declaring thread.sleep
		
		//driver.get("https://www.amazon.in/");
		
		//launc URL without laoding page 
		driver.navigate().to("https://www.facebook.com/");
		
		// for getting title of the page
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		//browser window closing
		driver.close();
		
	
	}

}
