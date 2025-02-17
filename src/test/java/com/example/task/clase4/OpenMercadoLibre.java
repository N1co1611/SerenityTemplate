package com.example.task.clase4;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class OpenMercadoLibre implements Task {
    //Indica que esta clase implementa la interfaz Task, lo que significa que debe definir el método performAs.
    private final String url;

    public OpenMercadoLibre(String url) {
        this.url = url;
    }

    public static OpenMercadoLibre onHomePage() {
        return new OpenMercadoLibre("https://www.mercadolibre.com.co/");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}


