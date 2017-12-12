package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Account;

@Component
public class AccountService {

	
	@PersistenceContext	
	  EntityManager entityManager;
	
	public void getData() {
		List<Account> accounts= entityManager.createQuery(
				"Select a from Account a" , Account.class).getResultList();
		for (Account account: accounts) {
		 System.out.println(" account --------------------" + account);
		 System.out.println(" account ---------------------------  -    " + account.getName());
		}
	}
}
