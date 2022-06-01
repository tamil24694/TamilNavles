package pom.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class POMAxis extends BaseClass {
	public POMAxis() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@class='gLFyf gsfi']")
	private WebElement googleText;

	@FindBy(xpath = "//span[contains(text(),'Axis Bank')]")
	private WebElement clicktext;

	@FindBy(xpath = "//h3[contains(text(),'Axis Bank: P')]")
	private WebElement firstLink;

	@FindBy(xpath = "//div[@class='close_button']//span[contains(text(),'X')]")
	private WebElement closepage;

	@FindBy(xpath = "//div[@class='loginClk jsloginClk']")
	private WebElement mouseoverLogin;

	@FindBy(xpath = "//div[@class='logLinks']//a[@class='hidden-xs']")
	private WebElement loginbutton;

	@FindBy(xpath = "//input[@name='FORM_LOGINID']")
	private WebElement username;

	@FindBy(xpath = "//div[@class='input-cont pwd']//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@onclick='return validatenewPassword()']")
	private WebElement lopinbuttonLast;

	@FindBy(xpath = "//div[@class='error-text']")
	private WebElement invalidtext;

	public WebElement getGoogleText() {
		return googleText;
	}

	public WebElement getClicktext() {
		return clicktext;
	}

	public WebElement getFirstLink() {
		return firstLink;
	}

	public WebElement getClosepage() {
		return closepage;
	}

	public WebElement getMouseoverLogin() {
		return mouseoverLogin;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLopinbuttonLast() {
		return lopinbuttonLast;
	}

	public WebElement getInvalidtext() {
		return invalidtext;
	}

}
