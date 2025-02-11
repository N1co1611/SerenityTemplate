package com.example.steps.clase3;

import com.example.task.clase3.Gato;
import com.example.task.clase3.Perro;
import com.example.task.clase3.Sonido;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class SonidoSteps {

    Sonido claseSonido; //Esta línea declara una variable de instancia llamada animal que puede almacenar una referencia a un objeto de tipo Animal

    @Given("un perro")
    public void unPerro() {
        claseSonido = new Perro();
        //Esta parte del código crea un
        // nuevo objeto de la clase Gato
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
