package com.example;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {

    private final CountryCollection countryCollection;
    private int index;

    public CountryIterator(CountryCollection countryCollection){
        this.countryCollection = countryCollection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        var countries = this.countryCollection.getCountries();
        return index < countries.length;
    }

    @Override
    public Country next() {
        // TODO Auto-generated method stub
        if(hasNext()){
            var countries = this.countryCollection.getCountries();
            return countries[index++];
        } else{
            return null;
        }
    }
    
}
