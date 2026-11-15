package com.deepak.accounts.repository;

import com.deepak.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional
    @Modifying
    // The above two combined annotations are saying that,
    // these method is going to modify the data in the database so please provide the atomicity for the same
    void deleteByCustomerId(Long customerId);
}
