package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuddyInfoController {
    private final BuddyInfoRepo buddyInfoRepository;
    private final AddressBookRepo addressBookRepository;

    @Autowired
    public BuddyInfoController(BuddyInfoRepo buddyInfoRepository, AddressBookRepo addressBookRepository) {
        this.buddyInfoRepository = buddyInfoRepository;
        this.addressBookRepository = addressBookRepository;
    }

    @RequestMapping(value = "/buddyInfo", method = RequestMethod.GET)
    public BuddyInfo getBuddy(@RequestParam("bookId") Long id, @RequestParam("buddyId") Integer buddyId){
        AddressBook addressBook = addressBookRepository.findAddressBookById(id);
        return addressBook.getBuddy(buddyId);
    }

    @RequestMapping(value = "/buddyInfo", method = RequestMethod.POST)
    public BuddyInfo addBuddy(@RequestBody BuddyInfo buddyInfo, @RequestParam("bookId") Long id){
        AddressBook addressBook = addressBookRepository.findAddressBookById(id);
        addressBook.addBuddy(buddyInfo);
        buddyInfoRepository.save(buddyInfo);
        addressBookRepository.save(addressBook);
        return buddyInfo;
    }

    @RequestMapping(value = "/buddyInfo", method = RequestMethod.DELETE)
    public BuddyInfo removeBuddy(@RequestParam("bookId") Long id, @RequestParam("buddyId") Integer buddyId){
        AddressBook addressBook = addressBookRepository.findAddressBookById(id);
        BuddyInfo buddyInfo = addressBook.getBuddy(buddyId);
        addressBook.removeBuddy(buddyId);
        addressBookRepository.save(addressBook);
        buddyInfoRepository.delete(buddyInfo);
        return buddyInfo;
    }
}
