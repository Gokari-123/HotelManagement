package com.example.hotel.management_system.Repository;

import com.example.hotel.management_system.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
