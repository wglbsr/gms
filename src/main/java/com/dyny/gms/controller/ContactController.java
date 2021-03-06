package com.dyny.gms.controller;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.pojo.Contact;
import com.dyny.gms.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController extends BaseController {


    @Autowired
    ContactService contactService;


    @RequestMapping(value = "/getContact", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getContact(@RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
                             @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
                             @RequestParam(name = "searchContent", required = false, defaultValue = "") String searchContent,
                             @RequestParam(name = "orderBy", required = false, defaultValue = "") String orderBy,
                             @RequestParam(name = "customerNo", required = true) String customerNo) {
        Contact contact = new Contact();
        contact.setCustomerNo(customerNo);
        return contactService.getContact(contact, searchContent, pageNum, pageSize, orderBy);
    }


    @RequestMapping(value = "/getContactByUnitId", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getContactByUnitId(
            @RequestParam(name = "pageNum", required = false, defaultValue = "0") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "0") int pageSize,
            @RequestParam(name = "orderBy", required = false, defaultValue = "") String orderBy,
            @RequestParam(name = "unitId", required = true) int unitId) {
        return contactService.getContactByUnitId(unitId, null, pageNum, pageSize, orderBy);
    }


    @RequestMapping(value = "/getContactByContactId", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getContactByContactId(
            @RequestParam(name = "contactId", required = true) int contactId) {
        return super.getSuccessResult(contactService.getContactByUnitId(contactId));
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


    @RequestMapping(value = "/deleteContactByIdList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String deleteContactByIdList(@RequestBody List<Integer> contactIdList) {
        return super.getSuccessResult(contactService.deleteContactByIdList(contactIdList));
    }


    @RequestMapping(value = "/insertContact", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String insertContact(@RequestBody Contact contact) {
        return super.getSuccessResult(contactService.addContact(contact));
    }
}
