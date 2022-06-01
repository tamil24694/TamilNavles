package step.org;

import org.openqa.selenium.interactions.Actions;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.org.POMAxis;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Stepdefnition extends BaseClass {

	POMAxis axis = new POMAxis();

	@Given("User enter the url")
	public void user_enter_the_url() {

	}

	@When("User enter the searchbox")
	public void user_enter_the_searchbox() {
		axis.getGoogleText().sendKeys("axis bank");
	}

	@When("User click the text from suggestion")
	public void user_click_the_text_from_suggestion() {
		axis.getClicktext().click();
	}

	@When("User click the first Link")
	public void user_click_the_first_Link() {
		axis.getFirstLink().click();
	}

	@When("user click the close X")
	public void user_click_the_close_X() throws AWTException, InterruptedException {
Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		axis.getClosepage().click();
	}

	@When("User mouseover to login Button")
	public void user_mouseover_to_login_Button() {
		Actions actions = new Actions(driver);
		actions.moveToElement(axis.getMouseoverLogin()).perform();

	}

	@When("User click the personal login")
	public void user_click_the_personal_login() {
		axis.getLoginbutton().click();

	}

	@When("User enter the invalid username")
	public void user_enter_the_invalid_username() {
		axis.getUsername().sendKeys("tamil24694");
	}

	@When("User enter the invalid password")
	public void user_enter_the_invalid_password() {
		axis.getPassword().sendKeys("tamil24694");

	}

	@When("click the logn button")
	public void click_the_logn_button() {
		axis.getLopinbuttonLast().click();
	}

	@Then("User validate the invalid text")
	public void user_validate_the_invalid_text() {
		System.out.println(axis.getInvalidtext().getText());
	}

}
