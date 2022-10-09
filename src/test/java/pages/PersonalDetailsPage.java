package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class PersonalDetailsPage extends CommonMethods {
    public PersonalDetailsPage(){PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//a[text()='Personal Details']")
    public WebElement personalDetailsBtn;

    @FindBy(xpath = "//a[text()='Contact Details']")
    public WebElement contactDetailsBtn;

    @FindBy(xpath = "//a[text()='Emergency Contacts']")
    public WebElement emergencyContactsBtn;

    @FindBy(xpath = "//a[text()='Dependents']")
    public WebElement dependentsBtn;

    @FindBy(xpath = "//ul[@id='sidenav']/li[10]//a")
    public WebElement qualificationsBtn;

    @FindBy(id = "personal_txtEmployeeId")
    public WebElement actual_employeeID;

    @FindBy(xpath = "//ul[@id='sidenav']/li[11]//a")
    public WebElement membershipsBtn;


}
