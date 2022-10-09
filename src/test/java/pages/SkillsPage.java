package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class SkillsPage extends CommonMethods {
    public SkillsPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "btnAdd")
    public WebElement addButton;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    @FindBy(id = "btnDel")
    public WebElement deleteButton;

    @FindBy(id = "skill_name")
    public WebElement skillName;

    @FindBy(id = "skill_description")
    public WebElement skillDescription;

    @FindBy(xpath = "//table[@id ='recordsListTable']/tbody/tr")
    public List<WebElement> skillTable;

    @FindBy(xpath = "//div[@class = 'message success fadable']")
    public WebElement successMessage;



}
