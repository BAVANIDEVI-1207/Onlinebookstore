package com.example.project.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Books;

public interface Booksrepository extends JpaRepository<Books, Integer> {

}
