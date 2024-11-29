package com.example.hotel.management_system.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long  id;

    private String name;

    private String customerId;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

}
