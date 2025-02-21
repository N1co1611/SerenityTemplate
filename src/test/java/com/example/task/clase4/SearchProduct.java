package com.example.task.clase4;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class SearchProduct implements Task {

    private final String item;

    public SearchProduct(String item) {
        this.item = item;
    }

    public static SearchProduct withThisName(String productName){
        return new SearchProduct(productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(item).into(Target.the("barra de busqueda").locatedBy("//input[@id='cb1-edit']")),
                Hit.the(Keys.ENTER).into(Target.the("barra de busqueda").locatedBy("//input[@id='cb1-edit']")),
                Click.on(Target.the("seleccionar producto").locatedBy("(//li[@class='ui-search-layout__item shops__layout-item'])[2]"))
        );
    }
}
