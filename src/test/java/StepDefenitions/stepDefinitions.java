package StepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stepDefinitions {
private String today;
private String actualAnswer;

    @Given("today is {string}")
    public void today_is_sunday(String today) {
       this.today = today;
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = getActualAnswer(today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string , actualAnswer);
    }

    private String getActualAnswer(String today) {
        return "Friday".equals(today)? "Yes" : "Nope";

    }

    @Test()
    public void getActualDays(){

    }
}
