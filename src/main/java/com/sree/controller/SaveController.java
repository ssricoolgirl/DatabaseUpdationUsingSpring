package com.sree.controller;

import com.sree.dao.*;
import com.sree.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveController {
    @Autowired
    private SaveService saveService;

    @Autowired
    private CustomerData customerData;

    private int i=0,count=0;

    @RequestMapping(value = "/contactus", method = RequestMethod.POST)
    ResponseEntity<?> save(@RequestBody SaveRequest saveRequest) {
        Customer customer=new Customer();
        customer.setName(saveRequest.getName());
        customer.setYourPhone(saveRequest.getYourPhone());
        customer.setYourEmail(saveRequest.getYourEmail());
      //  customer.setMessage(saveRequest.getMessage());
        customer.setSubject(saveRequest.getSubject());

        try {
           int count= saveRequest.getMessage().length();
            if(count >=20 && count <=1000){
                customer.setMessage(saveRequest.getMessage());
                saveService.save(customer);
            }
            else if(count<20){
                System.out.println("Message is too short");
            }
            else if(count>=1000){
                System.out.println("Message accepts only 1000 characters!");
            }

        } catch (Exception e) {
            System.out.println("printing exception"+e);

            return new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<> (HttpStatus.OK);
    }
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
   public String getContact() {
        return "Hello world";
    }

}
