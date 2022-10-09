package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ContactDetailsPage extends CommonMethods {
   public ContactDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='btnSave' and @value='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//input[@id='btnSave' and @value='Save']")
    public WebElement saveBtn;

    @FindBy(id = "contact_street1")
    public WebElement addressStreet1_Field;

    @FindBy(id = "contact_street2")
    public WebElement addressStreet2_Field;

    @FindBy(id = "contact_city")
    public WebElement city_Field;

    @FindBy(id = "contact_province")
    public WebElement state_province_Field;

    @FindBy(id = "contact_emp_zipcode")
    public WebElement zipcode_Field;

    @FindBy(css = "select#contact_country")
    public WebElement country_DDF;

    @FindBy(id = "contact_emp_hm_telephone")
    public WebElement home_telephone_Field;

    @FindBy(id = "contact_emp_mobile")
    public WebElement mobile_Field;

    @FindBy(id = "contact_emp_work_telephone")
    public WebElement work_telephone_Field;

    @FindBy(id = "contact_emp_work_email")
    public WebElement work_email_Field;

    @FindBy(id = "contact_emp_oth_email")
    public WebElement oth_email_Field;

}
