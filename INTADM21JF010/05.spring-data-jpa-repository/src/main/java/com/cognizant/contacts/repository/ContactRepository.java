package com.cognizant.contacts.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.contacts.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

	List<Contact> findByOrderByContactNameAsc();
}
