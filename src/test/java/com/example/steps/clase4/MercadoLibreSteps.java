package com.example.steps.clase4;

import com.example.task.clase4.AñadirAlCarro;
import com.example.task.clase4.OpenMercadoLibre;
import com.example.task.clase4.SearchProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class MercadoLibreSteps {
    @Given("el comprador esta en la pagina de inicio de MercadoLibre")
    public void elCompradorEstaEnLaPaginaDeInicioDeMercadoLibre() {
        OnStage.setTheStage(new OnlineCast());
        Actor comprador = OnStage.theActorCalled("comprador");
        comprador.wasAbleTo(OpenMercadoLibre.onHomePage());
    }

    @When("busca el producto {string}")
    public void buscaElProducto(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchProduct.withThisName(item));
    }

    @Then("añade el segundo producto al carrito, debe aparecer un mensaje {string}")
    public void añadeElSegundoProductoAlCarritoDebeAparecerUnMensaje(String arg0) {
        OnStage.theActorInTheSpotlight().attemptsTo(AñadirAlCarro.AddToCar());
    }
}
