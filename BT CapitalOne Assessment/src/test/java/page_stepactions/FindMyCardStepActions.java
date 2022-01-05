package page_stepactions;

import page_objects.FindMyCard;
import page_objects.Results;
import net.thucydides.core.annotations.Step;


public class FindMyCardStepActions {

    FindMyCard findMyCardPage;
    Results resultsPage;

    @Step
    public void openApplication() {
        findMyCardPage.open();
        findMyCardPage.acceptCookie();
    }

    @Step
    public void seeFindMyCardPage() {
        findMyCardPage.shouldBeDisplayed();
    }

    @Step
    public FindMyCardStepActions selectTitle(String title) {
        findMyCardPage.selectTitle(title);
        return this;
    }

    @Step
    public FindMyCardStepActions enterFirstName(String firstName) {
        findMyCardPage.enterFirstName(firstName);
        return this;
    }

    @Step
    public FindMyCardStepActions enterLastName(String lastName) {
        findMyCardPage.enterLastName(lastName);
        return this;
    }

    @Step
    public FindMyCardStepActions enterDOBdd(String day) {
        findMyCardPage.enterDOBday(day);
        return this;
    }

    @Step
    public FindMyCardStepActions enterDOBmm(String month) {
        findMyCardPage.enterDOBmonth(month);
        return this;
    }

    @Step
    public FindMyCardStepActions enterDOByyyy(String year) {
        findMyCardPage.enterDOByear(year);
        return this;
    }

    @Step
    public FindMyCardStepActions enterEmailAddress(String emailAddy) {
        findMyCardPage.enterEmailAddress(emailAddy);
        return this;
    }

    @Step
    public FindMyCardStepActions enterMobileNo(String mobileNo) {
        findMyCardPage.enterMobileNo(mobileNo);
        return this;
    }

    @Step
    public FindMyCardStepActions enterHomeNo(String homeNo) {
        findMyCardPage.enterHomeNo(homeNo);
        return this;
    }

    @Step
    public FindMyCardStepActions selectEmpStatus(String employmentStatus) {
        findMyCardPage.selectEmploymentStatus(employmentStatus);
        return this;
    }

    @Step
    public FindMyCardStepActions occupation(String occupation) {
        findMyCardPage.enterOccupation(occupation);
        return this;
    }

    @Step
    public FindMyCardStepActions incomeBeforeTax(String grossIncome) {
        findMyCardPage.enterGrossIncome(grossIncome);
        return this;
    }

    @Step
    public FindMyCardStepActions additionalIncomeOption(String otherIncome) {
        findMyCardPage.selectAdditionalIncomeOption(otherIncome);
        return this;
    }

    @Step
    public FindMyCardStepActions dependants(String noOfDependants) {
        findMyCardPage.enterNoOfDependants(noOfDependants);
        return this;
    }

    @Step
    public FindMyCardStepActions cashAdvanceOption(String cashAdvance) {
        findMyCardPage.selectCashAdvanceOption(cashAdvance);
        return this;
    }

    @Step
    public FindMyCardStepActions selectResidentialStatus(String residentialStatus) {
        findMyCardPage.selectResiStatus(residentialStatus);
        return this;
    }

    @Step
    public FindMyCardStepActions rentContribution(String rentMtgContribution) {
        findMyCardPage.enterRentContribution(rentMtgContribution);
        return this;
    }

    @Step
    public FindMyCardStepActions yearsAtAddress(String yearsAtAddress) {
        findMyCardPage.selectYearAtAdd(yearsAtAddress);
        return this;
    }

    @Step
    public FindMyCardStepActions postCode(String postCode) {
        findMyCardPage.enterPostcode(postCode);
        return this;
    }

    @Step
    public FindMyCardStepActions clickFindMyAddress() {
        findMyCardPage.clickOnFindMyAddy();
        return this;
    }

    @Step
    public FindMyCardStepActions selectCurrectAddress(String myAddress) {
        findMyCardPage.selectMyAddy(myAddress);
        return this;
    }

    @Step
    public FindMyCardStepActions clickOnConfirmAddress() {
        findMyCardPage.clickConfirmAddress();
        return this;
    }

    @Step
    public FindMyCardStepActions submitApplication() {
        findMyCardPage.submitApplication();
        return this;
    }

    public FindMyCardStepActions clickOnFindAddressButton() {
        findMyCardPage.clickOnFindMyAddy();
        return this;
    }

    @Step
    public FindMyCardStepActions seeTitleErrorMsg() {
        findMyCardPage.titleErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeFirstNameErrorMsg() {
        findMyCardPage.firstNameErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeLastNameErrorMsg() {
        findMyCardPage.lastNameErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeDOBErrorMsg() {
        findMyCardPage.dobErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeEmailErrorMsg() {
        findMyCardPage.emailErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seePhoneErrorMsg() {
        findMyCardPage.phoneErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeGrossIncomeErrorMsg() {
        findMyCardPage.grossIncomeErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeOtherIncomeErrorMsg() {
        findMyCardPage.otherIncomeErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeDependantsErrorMsg() {
        findMyCardPage.dependantsErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeRentMtgErrorMsg() {
        findMyCardPage.rentMtgErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seePostcodeErrorMsg() {
        findMyCardPage.postcodeErrorMsg();
        return this;
    }

    @Step
    public FindMyCardStepActions seeResultsPage() {
        resultsPage.selectTitle();
        return this;
    }

    public FindMyCardStepActions acceptCookie() {
        findMyCardPage.acceptCookie();
        return this;
    }
}