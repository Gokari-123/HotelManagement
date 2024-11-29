package com.example.hotel.management_system.ServicesImpl;

import com.example.hotel.management_system.Model.Customer;
import com.example.hotel.management_system.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Long id){
        return  customerRepository.findById(id).orElse(null);
    }
}
