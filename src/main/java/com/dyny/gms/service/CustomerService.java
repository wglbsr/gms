package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Customer;

import java.util.List;

public interface CustomerService {

    int deleteCustomer(String customerNo);

    int updateCustomer(Customer customer);

    String getAllCustomer(String orderBy,int pageNum,int pageSize,String searchContent);

    List getCustomerByCustomerNo(String customerNo);

    int insertCustomer(Customer customer);
}
