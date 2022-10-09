package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

	public AddEmployeePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "middleName")
	public WebElement middleName;

	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(id = "photofile")
	public WebElement photograph;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;

	@FindBy(id = "employeeId")
	public WebElement empID;

}
