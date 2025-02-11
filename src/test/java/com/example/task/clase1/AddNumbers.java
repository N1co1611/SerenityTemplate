package com.example.task.clase1;

import com.example.App;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class AddNumbers implements Task {
    private final int a;
    private final int b;

    public AddNumbers(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static Performable with(int a, int b){
        return new AddNumbers(a,b);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        int result = new App().sumador(a,b);
        actor.remember("result",result);
    }

}
