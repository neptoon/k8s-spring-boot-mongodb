package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {

	@Bean
	fun init(repository: PersonRepo) = CommandLineRunner {

		val p = Person().apply {
			firstName = "Hans"
			lastName = "Muster"
		}

		repository.save(p)
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
