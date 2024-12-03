package com.example;

public class Mediator {
    private Ticket ticket;
    private Board board;
    private Assignee assignee;

    public Mediator(Ticket ticket, Board board, Assignee assignee){
        this.ticket = ticket;
        this.board = board;
        this.assignee = assignee;
    }

    public void pickUpTicket(){
        assignee.pickUpTicket(ticket);
        ticket.setAssignee(assignee);
        ticket.setStatus(Ticket.Status.IN_PROGRESS);
        board.addTicketToInProgressTickets(ticket);
    }

    public void resolveTicket(){
        ticket.setStatus(Ticket.Status.DONE);
        board.addTicketToDoneTickets(ticket);
        assignee.resolveTicket(ticket);
    }
}
