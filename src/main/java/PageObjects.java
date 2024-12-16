import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	public WebDriver driver;
	
	public PageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[contains(@href, 'customer/account/create')]")
	public WebElement CreateAnAccount;
	
	@FindBy(xpath="//a[@class='logo']/img[contains(@src,'images/logo.svg')]")
	public WebElement HomePageLogo;
	
}
