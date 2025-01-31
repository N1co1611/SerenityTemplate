package com.example.steps;

import com.example.task.AddNumbers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class ExampleSteps {

    Actor user = Actor.named("User");

    @Given("I want to add two numbers")
    public void addTwoNumbers(){

    }

    @When("I do {int} plus {int}")
    public void doPlus(Integer a, Integer b){
        user.attemptsTo(AddNumbers.with(a,b));
    }

    @Then("I should get {int}")
    public void response(Integer arg1){
        user.should(seeThat("The add result",actor ->actor.recall("result"),equalTo(arg1)));
    }

}
