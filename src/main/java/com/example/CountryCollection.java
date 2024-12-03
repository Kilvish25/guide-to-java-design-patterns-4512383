package com.example;

import java.util.Iterator;

public class CountryCollection implements Iterable<Country> {

    private final Country countries [];

    public CountryCollection (Country... countries){
        this.countries = countries;
    }

    public Country[] getCountries(){
        return this.countries;
    }

    @Override
    public Iterator<Country> iterator() {
        // TODO Auto-generated method stub
        return new CountryIterator(this);
    }
}
