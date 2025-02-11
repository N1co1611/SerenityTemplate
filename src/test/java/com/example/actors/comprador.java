package com.example.actors;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class comprador extends Actor {
    public comprador(String nombre, WebDriver navegador) {
        super(nombre);
        can(BrowseTheWeb.with(navegador));
    }
}

