package com.example.springboot.ticketing.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
public class Ticket {

    @Id
    private Long ticketNumber;

    private String createdBy;

    private String assignedTo;
}
