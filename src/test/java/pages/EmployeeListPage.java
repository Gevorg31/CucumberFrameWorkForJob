package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmployeeListPage extends CommonMethods {
    public EmployeeListPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "empsearch_id")
    public WebElement idEmployee;

    @FindBy(id = "searchBtn")
    public WebElement searchButton;

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement employeeNameField;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr") // added elements for Olena's task
    public List<WebElement> EmployeeInfoTable;

    @FindBy(xpath = "(//table[@id='resultTable']/tbody/tr/td[2])[1]/a")// added elements for Olena's task
    public WebElement IdInTable;
}
