package com.example.steps.clase2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    @Given("el usuario esta previamente registrado y en la pagina de inicio")
    public void paginaDeInicio(){
        System.out.println("El usuario ingresa a la pagina de inicio de sesion");
    }

    @When("el usuarió ingresa su username y contraseña correctamente")
    public void IngresarCredenciasles() {
        System.out.println("El ingreso las credenciales");
    }

    @Then("el usuario es redirigido a pagina principal de la plataforma")
    public void ValidarPaginaPrincipal() {
        System.out.println("Se valido que entro a la pagina principal");
    }

    @When("el usuario ingresa su usarname {string} y la contraseña {string}")
    public void elUsuarioIngresaSuUsarnameYLaContraseña(String arg0, String arg1) {
        System.out.println("El usuario ingreso las credenciales, username: "+arg0+" y la contraseña: "+arg1);
    }

    @Then("la pagina debe mostrar el mensaje {string}")
    public void laPaginaDebeMostrarElMensaje(String mensajeError) {
        System.out.println("Se valida que el mensaje de error sea: "+mensajeError);
    }
}
