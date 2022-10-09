package steps;

import io.cucumber.java.en.When;
import pages.DashboardPage;
import utils.CommonMethods;

public class DashBoardSteps extends CommonMethods {
    
	
	@When("admin user clicks on PIM button")
    public void admin_user_clicks_on_pim_button() {
        click(dash.pimOption);
    }

    @When("admin user clicks on Add Employee button")
    public void admin_user_clicks_on_add_employee_button() {
        click(dash.addEmployeeBtn);
    }
    @When("admin user move cursor to first level Dashboard Tab Admin")
    public void admin_user_move_cursor_to_first_level_dashboard_tab_admin() {
        moveCursor(dash.adminOption);
    }
    @When("admin user move cursor to second level Dashboard Tab Qualifications")
    public void admin_user_move_cursor_to_second_level_dashboard_tab_qualifications() {
        moveCursor(dash.qualificationsOption);
    }
    @When("admin user clicks on Skills option in dropdown")
    public void admin_user_clicks_on_skills_option_in_dropdown() {
        click(dash.skillsOption);
    }
    @When("admin user clicks on Employee List button")
    public void admin_user_clicks_on_employee_list_button() throws InterruptedException {
        click(dash.employeeListOption);
    }
}
