package com.example.hotel.management_system.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int room;

    private String type;

    private  boolean occupied =false;

    @OneToOne(mappedBy="room")
    private Customer customer;
}
