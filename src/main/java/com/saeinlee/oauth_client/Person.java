package com.saeinlee.oauth_client;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Builder;
import lombok.Getter;

@Getter
@RedisHash(value = "people", timeToLive = 30)
public class Person {

	@Id
    private String id;
    private String name;
    private Integer age;
    private LocalDateTime createdAt;

    @Builder
    public Person(String id, String name, Integer age) {
    	this.id = id;
        this.name = name;
        this.age = age;
        this.createdAt = LocalDateTime.now();
    }
	
}
