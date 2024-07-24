package StepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefForAugust {

    public String month;
    public String isIndepenceDay;

    @Given("this month is {string}")
    public void this_month_is(String string) {
        this.month = string;
    }
    @When("I check if it has an Independence Day")
    public void i_check_if_it_has_an_independence_day() {
        isIndepenceDay = month.equals("August")?"Yes":"No" ;
    }
    @Then("I should be shown {string}")
    public void i_should_be_shown(String string) {
        assertEquals(string,isIndepenceDay);
    }
}
