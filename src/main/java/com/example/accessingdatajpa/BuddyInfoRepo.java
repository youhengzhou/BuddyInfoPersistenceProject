package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BuddyInfoRepo extends CrudRepository<BuddyInfo, Long> {

	List<BuddyInfo> findByLastName(String lastName);

	BuddyInfo findById(long id);
}
