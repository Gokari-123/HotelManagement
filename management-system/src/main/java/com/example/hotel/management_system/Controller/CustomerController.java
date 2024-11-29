package com.example.hotel.management_system.Controller;

import com.example.hotel.management_system.Model.Customer;
import com.example.hotel.management_system.Model.Room;
import com.example.hotel.management_system.ServicesImpl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return  customerService.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return  customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return  customerService.getCustomerById(id);
    }
}