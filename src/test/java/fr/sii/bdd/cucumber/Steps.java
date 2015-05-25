package fr.sii.bdd.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by ptrouillard on 25/05/2015.
 */
public class Steps {

    private Adder adder = null;

    @Given("^adder has a count of (\\d+)$")
    public void adder_has_a_count_of(int arg1) throws Throwable {
        adder = new Adder(arg1);
    }

    @When("^I add (\\d+) to the adder$")
    public void I_add_to_the_adder(int arg1) throws Throwable {
        adder.add(arg1);
    }

    @Then("^the count should be equal to (\\d+)$")
    public void the_count_should_be_equal_to(int arg1) throws Throwable {
        assertThat(adder.getCount(), equalTo(arg1));
    }

}
