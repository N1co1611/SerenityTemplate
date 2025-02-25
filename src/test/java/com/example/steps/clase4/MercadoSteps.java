package com.example.steps.clase4;

import com.example.UI.PreLoginPage;
import com.example.questions.PreLoginMessageQuestion;
import com.example.task.clase4.AddToCart;
import com.example.task.clase4.OpenMercadoLibre;
import com.example.task.clase4.SearchProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MercadoSteps {
    @Given("el Comprador está en la página de inicio de MercadoLibre")
    public void elCompradorEstáEnLaPáginaDeInicioDeMercadoLibre() {
        OnStage.setTheStage(new OnlineCast());

        Actor comprador = OnStage.theActorCalled("Comprador");
        comprador.wasAbleTo(OpenMercadoLibre.onHomePage());
    }

    @When("busca el producto {string}")
    public void buscaElProducto(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchProduct.withName(productName));

//        OnStage.theActorCalled("Comprador").attemptsTo(SearchProduct.withName(productName));
    }

    @Then("añade el primer producto al carrito")
    public void añadeElPrimerProductoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.firstProduct());
    }

    @Then("^valida que el mensaje \"([^\"]*)\" es mostrado$")
    public void validaQueElMensajeEsMostrado(String mensajeEsperado) {
        // Obtiene el mensaje actual desde la interfaz de usuario
//        String mensajeActual = Text.of(PreLoginPage.LOGIN_MESSAGE).answeredBy(OnStage.theActorInTheSpotlight());
        String mensajeActual = OnStage.theActorInTheSpotlight().asksFor(PreLoginMessageQuestion.value());

        // Verifica que el mensaje actual sea igual al mensaje esperado
        assertThat(mensajeActual).isEqualTo(mensajeEsperado);
    }
}
