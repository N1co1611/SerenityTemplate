package com.example.task.clase4;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AddToCart implements Task {
    public static AddToCart firstProduct() {
        return new AddToCart();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Target.the("add to cart button").locatedBy("//button[@class='andes-button andes-spinner__icon-base ui-pdp-action--secondary andes-button--quiet']"))
        );
    }
}
