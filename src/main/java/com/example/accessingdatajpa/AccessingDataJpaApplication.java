package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}

	@Bean
	public CommandLineRunner demo(BuddyInfoRepo repository1, AddressBookRepo repository2) {
		return (args) -> {
//			// save a few buddyInfos
//			BuddyInfo buddyInfo1 = new BuddyInfo("Jack", "Bauer");
//			BuddyInfo buddyInfo2 = new BuddyInfo("Chloe", "O'Brian");
//			BuddyInfo buddyInfo3 = new BuddyInfo("Kim", "Bauer");
//			BuddyInfo buddyInfo4 = new BuddyInfo("David", "Palmer");
//			BuddyInfo buddyInfo5 = new BuddyInfo("Michelle", "Dessler");
//
////			repository1.save(buddyInfo1);
////			repository1.save(buddyInfo2);
////			repository1.save(buddyInfo3);
////			repository1.save(buddyInfo4);
////			repository1.save(buddyInfo5);
//
////			repository1.save(new BuddyInfo("Jack", "Bauer"));
////			repository1.save(new BuddyInfo("Chloe", "O'Brian"));
////			repository1.save(new BuddyInfo("Kim", "Bauer"));
////			repository1.save(new BuddyInfo("David", "Palmer"));
////			repository1.save(new BuddyInfo("Michelle", "Dessler"));
//
//			AddressBook addressBook = new AddressBook();
//			addressBook.addBuddy(buddyInfo1);
//			addressBook.addBuddy(buddyInfo2);
//			addressBook.addBuddy(buddyInfo3);
//			addressBook.addBuddy(buddyInfo4);
//			addressBook.addBuddy(buddyInfo5);
//
//			repository2.save(addressBook);
//
//			// fetch all BuddyInfo
//			log.info("BuddyInfo found with findAll():");
//			log.info("-------------------------------");
//			for (BuddyInfo bi : repository1.findAll()) {
//				log.info(bi.toString());
//			}
//			log.info("");
//
//			// fetch an individual buddyInfo by ID
//			BuddyInfo bi = repository1.findById(1L);
//			log.info("BuddyInfo found with findById(1L):");
//			log.info("--------------------------------");
//			log.info(bi.toString());
//			log.info("");
//
//			// fetch buddyInfos by last name
//			log.info("BuddyInfo found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository1.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//
//			log.info("BuddyInfo found with findByLastName('Bauer') again:");
//			log.info("--------------------------------------------");
//			for (BuddyInfo bauer : repository1.findByLastName("Bauer")) {
//				log.info(bauer.toString());
//			}
//			log.info("");
//
//			// fetch all AddressBooks
//			log.info("AddressBook found with findAll():");
//			log.info("-------------------------------");
//			for (AddressBook ab : repository2.findAll()) {
//				log.info(ab.toString());
//			}
//			log.info("");
		};
	}

}
