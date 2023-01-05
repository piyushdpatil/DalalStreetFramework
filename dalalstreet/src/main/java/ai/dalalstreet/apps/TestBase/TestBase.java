package ai.dalalstreet.apps.TestBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ai.dalalstreet.apps.PageLayer.DashboardPage;
import ai.dalalstreet.apps.PageLayer.ExchangePage;
import ai.dalalstreet.apps.PageLayer.LoginPage;
import ai.dalalstreet.apps.PageLayer.PortfolioPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	public LoginPage login;
	
	public DashboardPage dashboard;
	public ExchangePage exchange;
	public  PortfolioPage potfolio;
	

	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("DalalStreet Automation Framework");
		PropertyConfigurator.configure("Log4JInfo.properties");
		
		logger.info("Framework execution started");
	}
	
	@AfterClass
	public void end()
	{
		logger.info("Framework execution stopped");
	}
	
	@BeforeMethod

	public void setup() throws InterruptedException {

		String Browser = "chrome";

		if (Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else if (Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		} else if (Browser.equalsIgnoreCase("safari")) {

			WebDriverManager.safaridriver().setup();

			driver = new SafariDriver();
		} else {
			System.out.println("Please provide valid Browser name!!!");
		}

		driver.manage().window().maximize();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
	//	js.executeScript("document.body.style.zoom = '0.7'");

		driver.manage().deleteAllCookies();
		driver.get("https://apps.dalalstreet.ai/login");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		logger.info("Browser lounch / maximaze window / delete all cookies / lounch URL ");

		 dashboard = new DashboardPage();
		login = new LoginPage();
		 exchange = new ExchangePage();
		 potfolio = new PortfolioPage();
		 
		 logger.info("Object creation");

		login.EnterEmailId("mailforselenium718@gmail.com");
		login.EnterPassword("Piyush@1234");
		login.ClickonLoginBtn();
		Thread.sleep(15000);

		 logger.info("Login into Dalalstreet");
	}

	@AfterMethod

	public void tearDown() {
		 driver.quit();
		 logger.info("Close Browser");
	}

}
