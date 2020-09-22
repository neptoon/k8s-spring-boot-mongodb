package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController(val repo: PersonRepo) {

    @GetMapping
    fun getPeople(): List<Person> {
        return repo.findAll().toList();
    }

}