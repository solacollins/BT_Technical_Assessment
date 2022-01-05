package page_objects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.junit.Assert;

@DefaultUrl("/creditcards/secure/find-my-card.jsf")
public class FindMyCard extends PageObject {

    @WhenPageOpens
    public void onOpen() {
        $("//div").waitUntilVisible();
    }

    public void selectTitle(String title) {
        $("//select[@id='capitalone:smart-search-app:personal:cc_title']").selectByValue(title);
    }

    public void enterFirstName(String firstName) {
        $("//input[@id='capitalone:smart-search-app:personal:cc_fname']").type(firstName);
    }

    public void enterLastName(String lastName) {
        $("//input[@id='capitalone:smart-search-app:personal:cc_sname']").type(lastName);
    }

    public void enterDOBday(String DOBday) {
        $("//input[@id='capitalone:smart-search-app:personal:cc_dob_day']").type(DOBday);
    }

    public void enterDOBmonth(String DOBmonth) {
        $("//input[@id='capitalone:smart-search-app:personal:cc_dob_month']").type(DOBmonth);
    }

    public void enterDOByear(String DOByear) {
        $("//input[@id='capitalone:smart-search-app:personal:cc_dob_year']").type(DOByear);
    }

    public void enterEmailAddress(String emailAddress) {
        $("//input[@id='capitalone:smart-search-app:personal:cc_email_address']").type(emailAddress);
    }

    public void enterMobileNo(String mobileNo) {
        $("//input[@id='capitalone:smart-search-app:personal:cc_mobile_no']").type(mobileNo);
    }

    public void enterHomeNo(String homeNo) {
        $("//input[@id='capitalone:smart-search-app:personal:cc_home_phone_number']").type(homeNo);
    }

    public void selectEmploymentStatus(String empStatus) {
        $("//select[@id='capitalone:smart-search-app:employment-info:cc_empstatus']").selectByVisibleText(empStatus);
    }

    public void enterOccupation(String occupation) {
        $("//input[@id='capitalone:smart-search-app:employment-info:cc_occupation']").type(occupation);
    }

    public void enterGrossIncome(String grossIncome) {
        $("//input[@id='capitalone:smart-search-app:employment-info:cc_grossincome']").type(grossIncome);
    }

    public void selectAdditionalIncomeOption(String otherIncome) {
        $("//legend[contains(.,'household?')]/following-sibling::table//label[contains(text(),'{0}')]", otherIncome).click();
    }

    public void enterNoOfDependants(String noOfDependants) {
        $("//*[@id='capitalone:smart-search-app:employment-info:cc_dependants']").selectByValue(noOfDependants);
    }

    public void selectCashAdvanceOption(String cashAdvance) {
        $("//legend[contains(.,'advance')]/following-sibling::table//label[contains(text(),'{0}')]", cashAdvance).click();
    }

    public void selectResiStatus(String residentialStatus) {
        $("//select[@id='capitalone:smart-search-app:residential02:cc_residential_status']").selectByVisibleText(residentialStatus);
    }

    public void enterRentContribution(String rentMtgContribution) {
        $("//input[@id='capitalone:smart-search-app:residential02:cc_rentmortgage']").type(rentMtgContribution);
    }

    public void selectYearAtAdd(String yearsAtAddress) {
        $("//select[@id='capitalone:smart-search-app:residential02:cc_curr_addr_years']").selectByValue(yearsAtAddress);
    }

    public void enterPostcode(String postCode) {
        $("//*[@id='capitalone:smart-search-app:AddressSearch:as_postcode']").type(postCode);
    }

    public void clickOnFindMyAddy() {
        $("//*[@class='qc-form-row button-row']").click();
    }

    public void selectMyAddy(String myAddress) {
        $("//*[@id='capitalone:smart-search-app:addressPick:as_pick']").selectByVisibleText(myAddress);
    }

    public void clickConfirmAddress() {
//        $("//*[@id='capitalone:smart-search-app:addressPick:asBeanselect']").click();
        $("//*[@class='address-confirm-button oui-button progressive']").click();
    }

    public void submitApplication() {
        $("//*[@class='oui-button action submitQC']").click();
    }

    public void titleErrorMsg() {
        String Actual = $("//*[@id='error_title']").getText();
        Assert.assertEquals("Please select an option for Title", Actual);
    }

    public void firstNameErrorMsg() {
        String Actual = $("//*[@id='error_fname']").getText();
        Assert.assertEquals("First name is required", Actual);
    }

    public void lastNameErrorMsg() {
        String Actual = $("//*[@id='error_sname']").getText();
        Assert.assertEquals("Last name is required", Actual);
    }

    public void dobErrorMsg() {
        String Actual = $("//*[@id='error_dob']").getText();
        Assert.assertEquals("Please enter a valid day value (01-31)", Actual);
    }

    public void emailErrorMsg() {
        String Actual = $("//*[@id='error_email_address']").getText();
        Assert.assertEquals("Email address is required", Actual);
    }

    public void phoneErrorMsg() {
        String Actual = $("//*[@class='phone-error-message error-message']").getText();
        Assert.assertEquals("Please enter at least one contact number.", Actual);
    }

    public void grossIncomeErrorMsg() {
        String Actual = $("//*[@id='error_grossincome']").getText();
        Assert.assertEquals("This is not a valid Yearly income, before tax", Actual);
    }

    public void otherIncomeErrorMsg() {
        String Actual = $("//*[@id='error_otherincome']").getText();
        Assert.assertEquals("Please select an option for other sources of income", Actual);
    }

    public void dependantsErrorMsg() {
        String Actual = $("//*[@id='error_dependants']").getText();
        Assert.assertEquals("Please select number of dependants", Actual);
    }

    public void rentMtgErrorMsg() {
        String Actual = $("//*[@id='error_rentmortgage']").getText();
        Assert.assertEquals("Please enter your personal monthly rent/mortgage contribution", Actual);
    }

    public void postcodeErrorMsg() {
        String Actual = $("//*[@id='error-message-postcode']").getText();
        Assert.assertEquals("Postcode is required", Actual);
    }

    public void acceptCookie() {
        if ($("//*[@id='truste-consent-button']").isDisplayed()) {
            $("//*[@id='truste-consent-button']").click();
        }
    }
}