package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DependantsPage extends CommonMethods {
   public DependantsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "btnAddDependent")
    public WebElement addBtn;

    @FindBy(id = "btnSaveDependent")
    public WebElement saveBtn;

    @FindBy(id = "dependent_name")
    public WebElement name_Field;

    @FindBy(id = "dependent_relationshipType")
    public WebElement relationship_DDF;

    @FindBy(id = "dependent_dateOfBirth")
    public WebElement dateOfBirth_Field;

    @FindBy(id = "dependent_list")
    public List<WebElement> dependent_list;

    @FindBy(xpath = "//div[@class = 'message success fadable']")
    public WebElement successMessage;
}
