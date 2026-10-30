package com.deepak.accounts.service;

import com.deepak.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return Account details based on a given mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);
}
