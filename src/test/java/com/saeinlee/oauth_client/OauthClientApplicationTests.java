package com.saeinlee.oauth_client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OauthClientApplicationTests {
	
	@Autowired
	private PersonRepository repository;

    @Test
    void contextLoads() {
    	Iterable<Person> ps = repository.findAll();
    	repository.save(Person.builder()
    			.age(12)
    			.id("test").name("name").build());
    }

}
