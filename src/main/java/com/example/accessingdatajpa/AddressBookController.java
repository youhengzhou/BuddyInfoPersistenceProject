package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AddressBookController {
    private AddressBookRepo addressBookRepo;

    @Autowired
    public AddressBookController(AddressBookRepo addressBookRepository) {
        this.addressBookRepo = addressBookRepository;
    }

    @RequestMapping("/addressBook")
    public AddressBook createAddressBook(){
        AddressBook addressBook = new AddressBook();
        addressBookRepo.save(addressBook);
        return addressBook;
    }

    @RequestMapping(value = "/addressBook", method = RequestMethod.GET)
    public AddressBook getAddressBook(@RequestParam("id") Long id){
        return addressBookRepo.findAddressBookById(id);
    }
}