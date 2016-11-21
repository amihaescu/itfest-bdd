package com.db.gt.itfest.string;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ConcatenationSteps {

    StringConcatenation stringConcatenation;
    String result;

    @Given("I have two character lists:(.*) and (.*)")
    public void setStrings(String firstString, String secondString) {
        stringConcatenation = new StringConcatenation(firstString, secondString);
    }

    @When("I call the concatenation method")
    public void concatenateStrings() {
        result = stringConcatenation.concatenateString();
    }

    @When("I call the alternate method")
    public void alternateStrings() {
        result = stringConcatenation.alternatedString();
    }

    @When("I call the inverted alternate combination method")
    public void invertAlternateString() {
        result = stringConcatenation.invertedAlternate();
    }

    @Then("I expect the result should be (.*)")
    public void getStringResult() {
        assertTrue(stringConcatenation.getConcatenatedString().equals(result));
    }

}
