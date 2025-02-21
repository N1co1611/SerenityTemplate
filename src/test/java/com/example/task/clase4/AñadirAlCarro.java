package com.example.task.clase4;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AñadirAlCarro implements Task {
    public static AñadirAlCarro AddToCar(){
        return new AñadirAlCarro();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Target.the("Boton de añadir al carrito").locatedBy("//button[@id=':R4piqkckkvm:']"))
        );
    }
}
