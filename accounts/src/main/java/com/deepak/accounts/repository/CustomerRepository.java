package com.deepak.accounts.repository;

import com.deepak.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    /**
     *
     * @param mobileNumber
     * @return
     */
    Optional<Customer> findByMobileNumber(String mobileNumber);


}
