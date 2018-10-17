package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.CustomerMapper;
import com.dyny.gms.db.pojo.Customer;
import com.dyny.gms.db.pojo.CustomerExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.CustomerService;
import com.dyny.gms.utils.CommonUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl extends BaseService implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;


    /**
     * 逻辑删除
     *
     * @param customerNo
     * @return
     */
    @Override
    public int deleteCustomer(String customerNo) {
        Customer customer = new Customer();
        CustomerExample example = new CustomerExample();
        customer.setDeleted(true);
        customer.setModifyTime(new Date());
        example.or().andCustomerNoEqualTo(customerNo);
        return customerMapper.updateByExampleSelective(customer, example);
    }

    @Override
    public List getCustomerByCustomerNo(String customerNo) {
        CustomerExample example = new CustomerExample();
        example.or().andCustomerNoEqualTo(customerNo).andDeletedEqualTo(false);
        return customerMapper.selectByExample(example);
    }

    @Override
    public int updateCustomer(Customer customer) {
        CustomerExample example = new CustomerExample();
        String customerNo = customer.getCustomerNo();
        example.or().andDeletedEqualTo(false).andCustomerNoEqualTo(customerNo);
        customer.setCustomerNo(null);
        return customerMapper.updateByExampleSelective(customer, example);
    }

    @Override
    public String getAllCustomer(String orderBy, int pageNum, int pageSize, String searchContent) {
        CustomerExample example = new CustomerExample();
        if (CommonUtil.String.validStr(searchContent)) {
            example.or().andDeletedEqualTo(false).andCustomerNameLike(super.appendLike(searchContent));
            example.or().andDeletedEqualTo(false).andCustomerNoLike(super.appendLike(searchContent));
        } else {
            example.or().andDeletedEqualTo(false);
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = customerMapper.selectByExample(example);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int insertCustomer(Customer customer) {
        customer.setDeleted(false);
        customer.setCreateTime(new Date());
        return customerMapper.insert(customer);
    }
}
