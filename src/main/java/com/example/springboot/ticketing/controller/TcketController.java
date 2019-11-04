package com.example.springboot.ticketing.controller;

import com.example.springboot.ticketing.entity.Ticket;
import com.example.springboot.ticketing.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TcketController {

    @Autowired
    TicketRepository ticketRepository;

    @GetMapping("/tickets")
    public List<Ticket> getTickets() {
        return ticketRepository.findAll();
    }
}
