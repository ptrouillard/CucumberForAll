package fr.sii.bdd.cucumber.utils;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CucumberUtilsTest {

    @Test
    public void verify_asDoubleReturnsWhatIsExpected() {
        double asDouble = CucumberUtils.asDouble(8, 75);
        assertThat(asDouble, equalTo(8.75));
    }
}
