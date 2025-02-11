package com.example.steps.clase4;

import com.example.task.clase4.OpenMercadoLibre;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class MercadoSteps {
    @Given("el Comprador está en la página de inicio de MercadoLibre")
    public void elCompradorEstáEnLaPáginaDeInicioDeMercadoLibre() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Comprador").wasAbleTo(OpenMercadoLibre.onHomePage());
    }

    @When("busca el producto {string}")
    public void buscaElProducto(String arg0) {
    }

    @Then("añade el primer producto al carrito")
    public void añadeElPrimerProductoAlCarrito() {
    }
}
