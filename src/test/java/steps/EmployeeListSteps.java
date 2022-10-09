package steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.EmployeeListPage;
import utils.CommonMethods;

public class EmployeeListSteps extends CommonMethods {

	@When("admin user enter noted Employee ID")
	public void admin_user_enter_noted_employee_id() throws InterruptedException {
		sendText(employeeListPage.idEmployee, AddEmployeeSteps.empID);
	}

	@When("admin user clicks on Search button")
	public void admin_user_clicks_on_search_button() {
		click(employeeListPage.searchButton);
	}

	@When("admin user clicks on Employee with noted ID")
	public void admin_user_clicks_on_employee_with_noted_id() {
		for (WebElement row : employeeListPage.EmployeeInfoTable) {
			if (row.getText().contains(AddEmployeeSteps.empID)) {
				click(driver.findElement(By
						.xpath("//table[@id='resultTable']/tbody/tr/td/a[text() = '" + AddEmployeeSteps.empID + "']")));
			}
		}
	}
}
