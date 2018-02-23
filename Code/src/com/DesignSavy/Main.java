package com.DesignSavy;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String URL = "/myiaps/entitlement/new.html";

        String input = "dsfjsdkfj";
        String localeId = String.join("-", input.split("_"));
        Locale locale = Locale.forLanguageTag(localeId);
        System.out.print("Hello" + locale.toString());
    }
}
