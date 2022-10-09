package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LanguagesPage extends CommonMethods {
    public LanguagesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "btnAdd")
    public WebElement AddBtn;

    @FindBy(id = "language_name")
    public WebElement LanguageNameTextBox;

    @FindBy(xpath = "//input[@id='btnSave' and @value='Save']")
    public WebElement SaveBtn;

    @FindBy(id = "btnDel")
    public WebElement deleteButton;

    @FindBy(xpath = "//table[@id ='recordsListTable']/tbody/tr")
    public List<WebElement> languageTable;

    @FindBy(xpath = "(//div[@class='head'])[2]")
    public WebElement LanguageTabVerification;

    @FindBy(xpath = "//div[@class='message success fadable']")
    public WebElement MessageVerification;

}
