package com.example.task.clase4;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SearchProduct implements Task {
    private final String productName;

    public SearchProduct(String productName) {
        this.productName = productName;
    }

    public static SearchProduct withName(String productName) {
        return new SearchProduct(productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(productName).into(Target.the("search bar").locatedBy("//form[@action='https://www.mercadolibre.com.co/jm/search']//input")),
                Click.on(Target.the("search button").locatedBy("//input/following-sibling::button[@class='nav-search-btn']")),
                Click.on(Target.the("select product").locatedBy("(//li[@class='ui-search-layout__item shops__layout-item'])[2]"))
        );
    }
}
