package com.example.steps.clase3;

import com.example.task.clase3.Gato;
import com.example.task.clase3.Perro;
import com.example.task.clase3.Sonido;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class SonidoSteps {

    Sonido claseSonido;

    @Given("un perro")
    public void unPerro() {
        claseSonido = new Perro();
    }

    @When("hace un sonido")
    public void haceUnSonido() {
    }

    @Then("el sonido es {string}")
    public void elSonidoEs(String sonidoEsperado) {
        assertEquals(sonidoEsperado,claseSonido.hacerSonido());
    }

    @Given("un gato")
    public void unGato() {
        claseSonido = new Gato();
    }
}
