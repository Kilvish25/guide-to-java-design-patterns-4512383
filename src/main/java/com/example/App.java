package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.USD);
        var atm = App.buildChain();
        atm.dispense(request);
    }

    private static ATM buildChain(){
        var usdATM = new UsDollarATM(null);
        var euroATM = new EuroATM(usdATM);
        
        return euroATM;
    }

}
