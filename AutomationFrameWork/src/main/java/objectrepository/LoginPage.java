package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="Email")
	private WebElement emailIdTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;

	@FindBy(linkText="BOOKS")
	private WebElement booksLink;
	
	@FindBy(linkText="COMPUTERS")
	private WebElement ComputersLink;
	
	@FindBy(linkText="ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(linkText="Apparel & Shoes")
	private WebElement shoesLink;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
		
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return ComputersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getShoesLink() {
		return shoesLink;
	}

}
