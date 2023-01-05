package ai.dalalstreet.apps.Utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import ai.dalalstreet.apps.TestBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass() {
		PageFactory.initElements(driver, this);
	}
	
	public static  void takeScreenShot(String filename) {
		String path = "F:\\eclipse project\\dalalstreet\\ScreenShot\\";
		try {
			TakesScreenshot tss= (TakesScreenshot)driver;
			File src = tss.getScreenshotAs(OutputType.FILE);
			File dest =new  File(path+filename+".png" );
			FileHandler.copy(src,dest);
		} catch (IOException e) {	
			e.printStackTrace();
			System.out.println("Provide correct path");
		}
	}	
}
