package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.model.Storemodel;

import com.example.project.respository.Storerepository;
@Service
public class Storeservice {
	@Autowired
	Storerepository  repository;
	public List<Storemodel> print(){
		return repository.findAll();
	}
	public List<Storemodel> print(List<Storemodel> s) {
		return (List<Storemodel>)repository.saveAll(s);
	}
	public Storemodel dispupdate(Storemodel s) {
		return repository.saveAndFlush(s);
		
	}
	public void deleteinfo(int s){
		    repository.deleteById(s);
	}
	public  List<Storemodel> Storeinfode(int id,String s){
		return repository.Storeinfo(id,s);
	}
	public int delete(int id) {
		return repository.deletestore(id);
	}
	public int updateinfo(int id,int id1){
		return repository.updateinfo(id, id1);
	}
	public Storemodel  bookStore1(Storemodel s){
		return repository.save(s);
	}
	
	public List<Storemodel> store(){
		return repository.findAll();
	}
	public List<Storemodel> bookinfo(String S){
		return repository.findAll(Sort.by(Sort.Direction.DESC,S));
	}
	public List<Storemodel> bookinfo(int pgno,int pgsize,String s){
		Page<Storemodel> p=repository.findAll(PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.DESC,s)));
		return p.getContent();
	}
}

