package com.example.demo

import org.springframework.data.mongodb.core.mapping.MongoId

class Person {
        @MongoId
        var id: String? = null
        var firstName: String? = null
        var lastName: String? = null
}