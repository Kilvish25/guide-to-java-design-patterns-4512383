package com.example;

public class App {

    public static void main(String[] args) {

        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        CountryCollection countryCollection = new CountryCollection(india, poland, nigeria, canada, argentina);

        for(Country country: countryCollection){
            System.out.println(country.getName());
        }
    }

}
