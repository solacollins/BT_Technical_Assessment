package step_definitions;

import page_stepactions.FindMyCardStepActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class FindMyCardStepDefinitions {

    @Steps
    FindMyCardStepActions i;

    @Given("I open the demo application")
    public void i_open_demo_application_in_browser() {
        i
                .openApplication();
    }

    @When("user completes the about you section")
    public void user_completes_the_about_you_section(DataTable table) {
        Map<String, String> userData = table.asMaps().get(0);
        i
                .acceptCookie()
                .selectTitle(userData.get("title"))
                .enterFirstName(userData.get("firstName"))
                .enterLastName(userData.get("lastName"))
                .enterDOBdd(userData.get("day"))
                .enterDOBmm(userData.get("month"))
                .enterDOByyyy(userData.get("year"))
                .enterEmailAddress(userData.get("emailAddress"))
                .enterMobileNo(userData.get("mobileNumber"))
                .enterHomeNo(userData.get("homeNumber"));

    }

    @And("user completes the work and finance section")
    public void user_completes_the_work_and_finance_section(DataTable table) {
        Map<String, String> finData = table.asMaps().get(0);
        i
                .selectEmpStatus(finData.get("employmentStatus"))
                .occupation(finData.get("occupation"))
                .incomeBeforeTax(finData.get("grossIncome"))
                .additionalIncomeOption(finData.get("otherIncome"))
                .dependants(finData.get("noOfDependants"))
                .cashAdvanceOption(finData.get("cashAdvance"));

    }

    @And("user completes the where you live section")
    public void user_completes_the_where_you_live_section(DataTable table) {
        Map<String, String> resData = table.asMaps().get(0);
        i
                .selectResidentialStatus(resData.get("residentialStatus"))
                .rentContribution(resData.get("rentMtgContribution"))
                .yearsAtAddress(resData.get("yearsAtAddress"))
                .postCode(resData.get("postCode"))
                .clickFindMyAddress()
                .selectCurrectAddress(resData.get("myAddress"))
                .clickOnConfirmAddress();

    }

    @And("user submits the application")
    public void user_submits_the_application() {
        i
                .acceptCookie()
                .submitApplication();

    }

    @Then("user will be taken to the results page")
    public void user_will_be_taken_to_the_results_page() {
        i
                .seeResultsPage();

    }

    @And("user clicks on find address button")
    public void user_clicks_on_find_address_button() {
        i
                .clickFindMyAddress();

    }

    @Then("user will see error messages on the mandatory fields")
    public void user_will_see_error_messages_on_the_mandatory_fields() {
        i
                .seeTitleErrorMsg()
                .seeFirstNameErrorMsg()
                .seeLastNameErrorMsg()
                .seeDOBErrorMsg()
                .seeEmailErrorMsg()
                .seePhoneErrorMsg()
                .seeGrossIncomeErrorMsg()
                .seeOtherIncomeErrorMsg()
                .seeDependantsErrorMsg()
                .seeRentMtgErrorMsg()
                .seePostcodeErrorMsg();

    }

}
