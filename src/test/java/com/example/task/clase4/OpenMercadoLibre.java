package com.example.task.clase4;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenMercadoLibre implements Task {

    private final String url;

    public OpenMercadoLibre(String url) {
        this.url = url;
    }

    public static OpenMercadoLibre onHomePage() {
        return new OpenMercadoLibre("https://www.mercadolibre.com");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
