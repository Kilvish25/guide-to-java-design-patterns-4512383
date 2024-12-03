package com.example;

public class EuroATM extends ATM {

    public EuroATM(ATM nexATM){
        super(nexATM);
    }
    @Override
    public void dispense(WithdrawalRequest request) {
        if(request.getCurrency() == WithdrawalRequest.Currency.EUR){
            System.out.println("Dispensing €" + request.getAmount());
        } else if(this.nextATM != null){
            nextATM.dispense(request);
        }
    }
}
