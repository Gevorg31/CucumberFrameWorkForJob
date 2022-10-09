package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class QualificationsPage extends CommonMethods {
    public QualificationsPage() {
        PageFactory.initElements(driver, this);
    }

    // Add work experience
    @FindBy(id = "addWorkExperience")
    public WebElement addWorkExperienceBtn;

    @FindBy(id = "experience_employer")
    public WebElement company_Field;

    @FindBy(id = "experience_jobtitle")
    public WebElement experience_jobtitle_Field;

    @FindBy(id = "experience_from_date")
    public WebElement from_Field;

    @FindBy(id = "experience_to_date")
    public WebElement to_Field;

    @FindBy(id = "experience_comments")
    public WebElement experience_comments_Field;

    @FindBy(id = "btnWorkExpSave")
    public WebElement workExpSaveBtn;

    //Add skill
    @FindBy(id = "addSkill")
    public WebElement addSkillBtn;

    @FindBy(id = "skill_code")
    public WebElement sskill_DDF;

    @FindBy(id = "skill_years_of_exp")
    public WebElement skillYearsExperience;

    @FindBy(id = "skill_comments")
    public WebElement skill_comments_Field;

    @FindBy(id = "btnSkillSave")
    public WebElement skillSaveBtn;

    @FindBy(xpath = "//div[@class = 'message success fadable']")
    public WebElement successMessage;

    @FindBy(xpath = "//h1[text() = 'Skills']/parent::div/following-sibling::div/form/table/tbody/tr")
    public List<WebElement> skillTable;

    //Add licence
    @FindBy(id = "addLicense")
    public WebElement addLicenseBtn;

    @FindBy(id = "license_code")
    public WebElement license_type_DDF;

    @FindBy(id = "license_license_no")
    public WebElement license_number_Field;

    @FindBy(id = "license_date")
    public WebElement issue_date_Field;  //sendKey as yyyy-mm-dd format

    @FindBy(id = "license_renewal_date")  //sendKey as yyyy-mm-dd format
    public WebElement expiry_date_Field;

    @FindBy(id = "btnLicenseSave")
    public WebElement licenseSaveBtn;

    @FindBy(xpath = "(//img[@class='ui-datepicker-trigger'])[1]")
    public WebElement from_date_Close;  //added by Elena to close the calendar "From"

    @FindBy(xpath = "(//img[@class='ui-datepicker-trigger'])[2]")
    public WebElement to_date_Close; //added by Elena to close the calendar "To"

    //Add language
    @FindBy(id = "addLanguage")
    public WebElement addLanguageBtn;

    @FindBy(id = "language_code")
    public WebElement language_DDF;

    @FindBy(id = "language_lang_type")
    public WebElement fluency_DDF;

    @FindBy(id = "language_competency")
    public WebElement competency_DDF;

    @FindBy(id = "language_comments")
    public WebElement language_comments_Field;

    @FindBy(id = "btnLanguageSave")
    public WebElement languageSaveBtn;

    @FindBy(xpath = "//table[@id='lang_data_table']/tbody/tr/td/following-sibling::td")
    public List<WebElement> lang_data_table_Cells;
}
