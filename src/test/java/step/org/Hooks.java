package step.org;

import java.util.concurrent.TimeUnit;

import BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void lanch() {
		launch();
		maximize();
		getUrl("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@After
	public void exit() throws InterruptedException {
		//Thread.sleep(2000);
		//driver.quit();
	}
}
