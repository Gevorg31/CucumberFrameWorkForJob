package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;
import utils.PageInitializer;

public class Hooks {

	/**
	 * this method opens browser and navigates to url
	 */
	@Before
	public void start() {
		CommonMethods.openBrowser();
	}

	/**
	 * this method takes screenshot result of test and close browser
	 * 
	 * @param scenario - which scenario is executed
	 */
	@After
	public void end(Scenario scenario) {
		byte[] pic;
		if (scenario.isFailed()) {
			pic = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		} else {
			pic = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}
		scenario.attach(pic, "image/png", scenario.getName());
		CommonMethods.closeBrowser();
	}
}
