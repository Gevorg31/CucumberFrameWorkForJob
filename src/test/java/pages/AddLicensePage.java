package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddLicensePage extends CommonMethods {

    public AddLicensePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "btnAdd")
    public WebElement addLicenceButton;

    @FindBy(id = "license_name")
    public WebElement licenseNameField;

    @FindBy(id = "btnSave")
    public  WebElement saveBtn;

    @FindBy(xpath = "//div[@class = 'message success fadable']")
    public WebElement successMessage;

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr")
    public List<WebElement> licenseTable;

    @FindBy(id = "btnDel")
    public WebElement deleteBtn;
}
