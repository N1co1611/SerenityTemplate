package com.example.UI;

import net.serenitybdd.screenplay.targets.Target;

public class MercadoLibreHomePage {
    public static final Target SEARCH_BAR = Target.the("search bar").locatedBy("#search-bar");
    public static final Target SEARCH_BUTTON = Target.the("search button").locatedBy("#search-button");
}
