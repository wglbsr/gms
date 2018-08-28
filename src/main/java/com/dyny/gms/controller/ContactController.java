package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Contact;
import com.dyny.gms.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController extends BaseController {


    @Autowired
    ContactService contactService;


    @RequestMapping(value = "/getContact", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getContact(@RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                             @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
                             @RequestParam(name = "unitId", required = false, defaultValue = "-1") int unitId,
                             @RequestParam(name = "customerNo", required = true) String customerNo) {
        Contact contact = new Contact();
        contact.setCustomerNo(customerNo);
        if (unitId >= 0) {
            contact.setUnitId(unitId);
        }
        return contactService.getContact(contact, pageNum, pageSize);
    }


    @RequestMapping(value = "/updateContact", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateContact(@RequestBody Contact contact) {
        return super.getSuccessResult(contactService.updateContact(contact));
    }


    @RequestMapping(value = "/deleteContact", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteContact(@RequestBody Contact contact) {
        return super.getSuccessResult(contactService.deleteContact(contact));
    }


    @RequestMapping(value = "/insertContact", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String insertContact(@RequestBody Contact contact) {
        return super.getSuccessResult(contactService.addContact(contact));
    }
}
