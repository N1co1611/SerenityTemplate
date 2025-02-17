package com.example.UI;

import net.serenitybdd.screenplay.targets.Target;

public class PreLoginPage {
    public static final Target PRELOGIN_MESSAGE = Target.the("mensaje de inicio de sesión")
            .locatedBy("//div[contains(text(), '¡Hola! Para agregar al carrito, ingresa a tu cuenta')]");
}
