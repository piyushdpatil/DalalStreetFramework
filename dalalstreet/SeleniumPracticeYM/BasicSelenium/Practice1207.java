package com.BasicSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice1207 {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20new%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-298831213137%26loc_physical_ms%3D9301021%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAkMGcBhCSARIsAIW6d0ADpdW52L9nSaJOHYzfTaT2GSp4diZ3WDhPXILqNH0Yoa0MEujTFPoaAkAOEALw_wcB");
		Thread.sleep(5000);
		
		
	}


}
