package com.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AddressBookRepo extends CrudRepository<AddressBook, Long> {
    AddressBook findAddressBookById(long id);

}
