package com.example;

public class App {

    public static void main(String[] args) {

        var board = new Board();
        var ticket = new Ticket();
        var assignee = new Assignee();

        Mediator mediator = new Mediator(ticket, board, assignee);
        mediator.pickUpTicket();
        System.out.println();
        mediator.resolveTicket();

    }

}
