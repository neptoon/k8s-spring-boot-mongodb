package com.example.demo

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepo: PagingAndSortingRepository<Person, String> {

}