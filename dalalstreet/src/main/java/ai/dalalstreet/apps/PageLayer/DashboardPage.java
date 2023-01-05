package ai.dalalstreet.apps.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.dalalstreet.apps.TestBase.TestBase;

public class DashboardPage extends TestBase{
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement search_box;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement select_company;
	
	
	public void enterInSearchBox(String companyName) {
		search_box.sendKeys(companyName);
	}
	public void clickSelectCompany() {
		select_company.click();
	}
}
