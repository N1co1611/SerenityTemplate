package com.example.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResultsPage {
    public static final Target FIRST_ADD_TO_CART_BUTTON = Target.the("first add to cart button").locatedBy("(//button[contains(@class, 'add-to-cart')])[1]");
}
