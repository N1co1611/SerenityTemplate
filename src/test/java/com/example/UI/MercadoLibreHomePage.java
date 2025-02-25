package com.example.UI;

import net.serenitybdd.screenplay.targets.Target;

public class MercadoLibreHomePage {
    public static final Target SEARCH_BAR = Target.the("search bar").locatedBy("//input[@class='nav-search-input']");
    public static final Target SEARCH_BUTTON = Target.the("search button").locatedBy("//button[@class='nav-search-btn']");
}
