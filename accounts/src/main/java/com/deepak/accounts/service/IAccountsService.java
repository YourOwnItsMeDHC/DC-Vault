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

    /**
     *
     * @param customerDto- Input mobile number
     * @return boolean indicating whether the update of Account is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);
}
