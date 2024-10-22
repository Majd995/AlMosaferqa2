import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.storage.model.AttributionReportingSourceRegistrationTimeConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mytestcases {

	WebDriver driver = new ChromeDriver();

	String MyWebsiteUrl = "https://global.almosafer.com/en";

	@BeforeTest
	public void mysetup() {

		driver.manage().window().maximize();
		driver.get(MyWebsiteUrl);

		WebElement ButtonforTheCurrancy = driver
				.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));

		ButtonforTheCurrancy.click();
	}

	@Test(priority = 1)
	public void checkTheEnglishLangugeIsDefault() {

		String ActuallLanguge = driver.findElement(By.tagName("html")).getAttribute("lang");
		String ExPeCtedLanguge = "en";
		Assert.assertEquals(ActuallLanguge, ExPeCtedLanguge);
	}

	@Test
	public void ChickTheDefaultCurrancyIsSAR() {

		// button[@data-testid='Header__CurrencySelector']

		String ActualCurrancy = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']"))
				.getText();
		String ExpectedCurrancy = "SAR";

		Assert.assertEquals(ActualCurrancy, ExpectedCurrancy);

	}
	
	
	@Test(priority = 3)
	public void CheckContactNumbers() {
		
		
	 String	ActualNumber   =  driver.findElement(By.cssSelector(".sc-hUfwpO.bWcsTG")).getText();
		
		String ExpectedNumber ="+966554400000";
		
		Assert.assertEquals(ActualNumber, ExpectedNumber);}
		
		
		
		
	@Test (priority = 4)	
		public void CheckiQtafLogoTherInTheFoter() {
		
		
	 boolean ActualResult	= driver.findElement(By.cssSelector(".sc-bdVaJa.bxRSiR.sc-ciodno.lkfeIG")).isDisplayed();
		boolean EexpectedResult = true;
		
		Assert.assertEquals(ActualResult, EexpectedResult);
		
		
		
		
	}
		
	
}
