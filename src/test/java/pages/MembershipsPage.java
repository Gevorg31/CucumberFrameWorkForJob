package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class MembershipsPage extends CommonMethods {
	public MembershipsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "btnAddMembershipDetail")
	public WebElement addMembershipButton;

	@FindBy(id = "membership_membership")
	public WebElement membership;

	@FindBy(id = "membership_subscriptionPaidBy")
	public WebElement membershipPaidBy;

	@FindBy(id = "membership_subscriptionAmount")
	public WebElement membershipAmount;

	@FindBy(id = "membership_currency")
	public WebElement membershipCurrency;

	@FindBy(id = "membership_subscriptionCommenceDate")
	public WebElement membershipCommenceDate;

	@FindBy(id = "membership_subscriptionRenewalDate")
	public WebElement membershipRenewalDate;

	@FindBy(id = "btnSaveMembership")
	public WebElement btnSaveMembership;

	@FindBy(xpath = "//table[@class ='table hover']/tbody/tr")
	public List<WebElement> membershipTable;

	@FindBy(xpath = "//div[@class = 'message success fadable']")
	public WebElement successMessage;

	@FindBy(id = "btnDelete")
	public WebElement deleteButton;

	@FindBy(id = "dialogDeleteBtn")
	public WebElement confirmDeleteButton;

	@FindBy(id = "btnAdd")
	public WebElement addMembershipBtn;

	@FindBy(id = "membership_name")
	public WebElement MembershipNameField;
}
