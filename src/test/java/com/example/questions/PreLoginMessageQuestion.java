package com.example.questions;

import com.example.UI.PreLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PreLoginMessageQuestion implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PreLoginPage.PRELOGIN_MESSAGE).answeredBy(actor);
    }

    public static Question<String> value() {
        return new PreLoginMessageQuestion();
    }
}
