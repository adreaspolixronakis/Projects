package com.example.project4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Date;

import java.sql.Timestamp;

@SpringBootApplication
public class Project4Application implements CommandLineRunner {

	@Autowired
	private RecordRepository recordRepository;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Project4Application.class, args);
	}

	public void run(String... args) throws Exception{

		String sql="DROP TABLE IF EXISTS users";
		jdbcTemplate.execute(sql);
		System.out.println(sql);

		sql="CREATE TABLE users("+"" +
				"user_id  integer primary key,"+
				"username varchar(50),"+
				"password varchar(64),"+
				"role varchar(50),"+
				"enabled boolean,"+
				"failed_attempt integer,"+
				"account_non_locked boolean,"+
				"lock_time timestamp,"+
				"registration_time timestamp"+
				");";
		System.out.println(sql);
		jdbcTemplate.execute(sql);




		System.out.println("inside run");

		Record user1=new Record(1,"3170106",new PasswordGenerator().getPasswordEncrypted("user"),"USER",true,0,true,null,new Timestamp(new Date().getTime()));
		recordRepository.insert(user1);
		System.out.println(user1.getPassword());
		Record user2=new Record(2,"admin",new PasswordGenerator().getPasswordEncrypted("admin"),"ADMIN",true,0,true,null,new Timestamp(new Date().getTime()));
	     recordRepository.insert(user2);
	     System.out.println(user2.getPassword());
		System.out.println(" RECORDs HAS BEEN INSERTED SUCCESFULLY");


	}

}
