package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontController {
    private AddressBookRepo addressBookRepository;
    private BuddyInfoRepo buddyInfoRepository;

    @Autowired
    public FrontController(AddressBookRepo addressBookRepository, BuddyInfoRepo buddyInfoRepository) {
        this.addressBookRepository = addressBookRepository;
        this.buddyInfoRepository = buddyInfoRepository;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam("id") long id,Model model){
        AddressBook addressBook = addressBookRepository.findAddressBookById(id);
        model.addAttribute("addressBook",addressBook);
        return "greeting";
    }
}
