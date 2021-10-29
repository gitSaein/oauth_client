package com.saeinlee.oauth_client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OauthClientApplicationTests {
	
	@Autowired
	private PersonRepository repository;

    @Test
    void contextLoads() {
    	Person p = Person.builder()
    			.age(12)
    			.id("test").name("name").build();
    	repository.save(p);

    	Optional<Person> ps = repository.findById(p.getId());
    	assertEquals(ps.get().getId(), p.getId());
    	repository.deleteById(p.getId());
    			
    }

}
