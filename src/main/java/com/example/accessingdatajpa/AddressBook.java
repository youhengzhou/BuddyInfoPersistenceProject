package com.example.accessingdatajpa;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<BuddyInfo> buddyInfos;

	protected AddressBook() {
		this.buddyInfos = new ArrayList<BuddyInfo>();
	}

	public List<BuddyInfo> getBuddyInfos(){
		return buddyInfos;
	}

	public void addBuddy(BuddyInfo buddyInfo) {
		this.buddyInfos.add(buddyInfo);
	}

	public BuddyInfo getBuddy(int i) {
		return this.buddyInfos.get(i);
	}

	public void removeBuddy(int i) {
		BuddyInfo b = this.buddyInfos.remove(i);
	}

	@Override
	public String toString() {
		return "persistence.AddressBook{" +
				"buddies=" + buddyInfos +
				'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
