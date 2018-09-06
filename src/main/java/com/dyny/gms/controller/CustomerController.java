package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Customer;
import com.dyny.gms.db.pojo.User;
import com.dyny.gms.service.CustomerService;
import com.dyny.gms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController extends BaseController {
    @Autowired
    CustomerService customerService;


    @RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String changePassword(@RequestParam(value = "customerNo", required = true) String customerNo) {
        return super.getSuccessResult(customerService.deleteCustomer(customerNo));
    }


    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateCustomer(@RequestBody Customer customer) {
        return super.getSuccessResult(customerService.updateCustomer(customer));
    }


    @RequestMapping(value = "/getAllCustomer", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getAllCustomer(@RequestParam(value = "orderBy", required = false, defaultValue = "id") String orderBy,
                                 @RequestParam(value = "searchContent", required = false, defaultValue = "") String searchContent,
                                 @RequestParam(value = "pageNum", required = false, defaultValue = "0") int pageNum,
                                 @RequestParam(value = "pageSize", required = false, defaultValue = "0") int pageSize) {
        return customerService.getAllCustomer(orderBy, pageNum, pageSize, searchContent);
    }


    @RequestMapping(value = "/getCustomerByCustomerNo", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getCustomerByCustomerNo(@RequestParam(value = "customerNo", required = true) String customerNo) {
        return super.getSuccessResult(customerService.getCustomerByCustomerNo(customerNo));
    }


    @RequestMapping(value = "/insertCustomer", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String insertCustomer(@RequestBody Customer customer) {
        return super.getSuccessResult(customerService.insertCustomer(customer));
    }

}
