package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class EmergencyContactsPage extends CommonMethods {
    public EmergencyContactsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "btnAddContact")
    public WebElement AddBtn;

    @FindBy(id = "btnSaveEContact")
    public WebElement SaveBtn;

    @FindBy(id = "emgcontacts_name")
    public WebElement name_Field;

    @FindBy(id = "emgcontacts_relationship")
    public WebElement relationship_Field;

    @FindBy(id = "emgcontacts_homePhone")
    public WebElement homePhone_Field;

    @FindBy(id = "emgcontacts_mobilePhone")
    public WebElement mobilePhone_Field;

    @FindBy(id = "emgcontacts_workPhone")
    public WebElement workPhone_Field;

    @FindBy(xpath = "//div[@class = 'message success fadable']")
    public WebElement successMessage;

    @FindBy(xpath = "//table[@id ='emgcontact_list']/tbody/tr")
    public List<WebElement> emContactsTable;

}
