package fr.sii.bdd.cucumber.utils;

/**
 * Created by ptrouillard on 25/05/2015.
 */
public class CucumberUtils {

    public static double asDouble(int arg1, int arg2) {

        String asString = String.valueOf(arg1) + "." + String.valueOf(arg2);
        return Double.valueOf(asString);
    }
}
