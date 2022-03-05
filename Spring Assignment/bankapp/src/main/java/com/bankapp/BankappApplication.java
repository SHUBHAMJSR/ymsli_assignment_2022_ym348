package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.model.persitance.Account;
import com.bankapp.model.service.AccountService;

@SpringBootApplication
public class BankappApplication implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		accountService.addAccount(new Account("shubham", 50000.00, "9281881111", "new delhi", "sks@gmail.com"));
//		accountService.addAccount(new Account("ranjan", 50000.00, "9290020114", "new delhi", "ran@gmail.com"));

		
	}

}
