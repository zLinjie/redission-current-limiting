package com.zvhs.currentlimiting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 通过 redis 和 lua 脚本实现限流
 */
@SpringBootApplication
public class CurrentLimitingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrentLimitingApplication.class, args);
	}

}
