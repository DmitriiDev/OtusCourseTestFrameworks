package com.example.otustestframworks;

import com.example.otustestframworks.MathFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class TestsForPlusFuncCucumber {
    MathFunctions mathFuncProvider = new MathFunctions();
    double result;

    @Given("I have a variable <num{int}>")
    public void iHaveAVariableNum(int arg0) {
        result = arg0;
    }

    @When("I get {int} , {int}, {operator}")
    public void iGetNumNumOp(Integer int1, Integer int2, Character operator) {
        result = mathFuncProvider.plusFunc(int1,int2,operator);
        System.out.println(result);
    }

    @Then("I will get {double} as a reuslt")
    public void iWillGetSumAsAReuslt(Double dobleNum) {
        assertTrue(result == dobleNum);
    }

}
