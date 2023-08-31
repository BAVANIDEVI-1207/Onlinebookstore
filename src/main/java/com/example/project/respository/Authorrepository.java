package com.example.project.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Bookauthor;

public interface Authorrepository  extends JpaRepository<Bookauthor, Integer>{

}
