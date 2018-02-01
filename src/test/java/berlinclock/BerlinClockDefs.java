package berlinclock;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class BerlinClockDefs {

    private BerlinClock converter;
    private String lastMinuteRowResult;
    private String fiveMinuteRowResult;

    @Given("^I have started the converter$")
    public void the_converter() throws Throwable {
        converter = new BerlinClock();
    }

    @When("^I enter (.+)$")
    public void computeLastMinutesRow(String time) {
        lastMinuteRowResult = converter.convertLastMinutesRow(time);
        fiveMinuteRowResult = converter.convertFiveMinutesRow(time);

    }

    @Then("^(.*?) is returned for the single minutes row$")
    public void verifyLastMinutesRow(String expectedResult) {
        assertEquals(expectedResult, lastMinuteRowResult);
    }

    @Then("^(.*?) is returned for the five minutes row$")
    public void verifyFiveMinutesRow(String expectedResult) {
        assertEquals(expectedResult, fiveMinuteRowResult);
    }
}
