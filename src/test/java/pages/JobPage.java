package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class JobPage extends CommonMethods {
    public JobPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='btnSave' and @value='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//input[@id='btnSave' and @value='Save']")
    public WebElement saveBtn;

    @FindBy(id = "job_job_title")
    public WebElement job_title_DDF;

    @FindBy(id = "job_emp_status")
    public WebElement emp_status_DDF;

    @FindBy(id = "job_eeo_category")
    public WebElement job_category_DDF;

    @FindBy(id = "job_joined_date")
    public WebElement joined_date_Field; // sendKeys in yyyy-mm-dd format

    @FindBy(id = "job_sub_unit")
    public WebElement sub_unit_DDF;

    @FindBy(id = "job_location")
    public WebElement location_DDF;

    // Employment Contract
    @FindBy(id = "job_contract_start_date")
    public WebElement start_date_Field; // sendKeys in yyyy-mm-dd format

    @FindBy(id = "job_contract_end_date")
    public WebElement end_date_Field; // sendKeys in yyyy-mm-dd format

    @FindBy(id = "job_contract_file")
    public WebElement contract_details_Field;

    @FindBy(id = "job_contract_update_3")
    public WebElement ReplaceInfoBtn;

   //Terminate/Activate Employment
    @FindBy(id = "btnTerminateEmployement")
    public WebElement terminateEmployementBtn;

    @FindBy(id = "terminate_reason")
    public WebElement reason_DDF;

    @FindBy(id = "terminate_date")
    public WebElement date_Field;

    @FindBy(xpath = "//textarea[@class='formTxtArea']")
    public WebElement note_Field;

    @FindBy(id = "dialogConfirm")
    public WebElement confirmBtn;

    @FindBy(xpath = "//a[contains(text(),'Terminated on')]")
    public WebElement terminated_on_Stamp;

    @FindBy(xpath = "(//a[text()='Job'])[2]") //added by Olena for Olena's task
    public WebElement JobTab;

    @FindBy(xpath = "(//img[@class='ui-datepicker-trigger'])[1]")//added by Olena to close the calendar
    public WebElement joined_date_Close;

    @FindBy(xpath = "(//img[@class='ui-datepicker-trigger'])[2]")
    public WebElement start_date_Close; //added by Olena to close the calendar

    @FindBy(xpath ="(//img[@class='ui-datepicker-trigger'])[3]" )
    public WebElement end_date_Close;//added by Olena to close the calendar

    @FindBy(xpath = "//div[@class='message success fadable']")
    public WebElement MessageVerification;

}
