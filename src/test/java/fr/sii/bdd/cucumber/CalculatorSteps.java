package fr.sii.bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static fr.sii.bdd.cucumber.utils.CucumberUtils.asDouble;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by ptrouillard on 25/05/2015.
 */
public class CalculatorSteps {

    private Calculator calculator = null;

    @Given("^calculator has a count of (\\d+)$")
    public void adder_has_a_count_of(int arg1) throws Throwable {
        calculator = new Calculator(arg1);
    }

    @When("^I add (\\d+) to the calculator$")
    public void I_add_to_the_adder(int arg1) throws Throwable {
        calculator.add(arg1);
    }

    @Then("^the count should be equal to (\\d+)$")
    public void the_count_should_be_equal_to(int arg1) throws Throwable {
        assertThat(calculator.getCountAsInt(), equalTo(arg1));
    }

    @When("^I set (\\d+) to the calculator$")
    public void I_set_to_the_calculator(int arg1) throws Throwable {
        this.calculator.multiplyBy(arg1);
    }

    //
    // Floats
    //

    @Given("^calculator has a count of (\\d+).(\\d+)$")
    public void calculator_has_a_count_of_(int arg1, int arg2) throws Throwable {
        double number = asDouble(arg1, arg2);
        calculator = new Calculator(number);
    }

    @When("^I set (\\d+).(\\d+) to the calculator$")
    public void I_set_to_the_calculator(int arg1, int arg2) throws Throwable {
        double number = asDouble(arg1, arg2);
        this.calculator.multiplyBy(number);
    }

    @Then("^the count should be equal to (\\d+).(\\d+)$")
    public void the_count_should_be_equal_to_(int arg1, int arg2) throws Throwable {
        assertThat(this.calculator.getCount(), equalTo(asDouble(arg1, arg2)));
    }
}
