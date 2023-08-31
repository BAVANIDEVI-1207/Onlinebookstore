package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Storemodel;
import com.example.project.service.Storeservice;

@RestController

public class Storecontroller {
	@Autowired
	Storeservice service;
	@PostMapping("/show")
	public List<Storemodel>print(@RequestBody List<Storemodel> s) {
		return service.print(s);
	}
	@GetMapping("/value")
			public List<Storemodel>get(){
		return service.print();
	   }

	@PutMapping("/disp")
	public Storemodel updateinfo( @RequestBody Storemodel s) {
		return service.dispupdate(s);
	}
	
	@DeleteMapping("/del")
	public void  delinfo(@RequestParam int id) {
		 service.deleteinfo(id); 
	}
	@PostMapping("/addmap")
	public Storemodel addmap(@RequestBody Storemodel B){
		return service.bookStore1(B);
	}
	@GetMapping("/getmap")
	public List<Storemodel>getmap(){
		return service.store();
	}
	@GetMapping("showsort/{Title}")
	public List <Storemodel> storedetails(@PathVariable String Title){
		return service.bookinfo(Title);
	}
	@GetMapping("showpage/{pgno}/{pgsize}/{Title}")
	public List<Storemodel> storeinfo(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String Title ){
		return service.bookinfo(pgno, pgsize,Title);
		}

	@GetMapping("showquery/{id}/{Title}")
	public List<Storemodel> showdetails(@PathVariable int id,@PathVariable String Title){
		return service.Storeinfode(id,Title);
	}
	@DeleteMapping("deletequery/{storeid}")
	public String deleteStore(@PathVariable int id) {
		return service.delete(id)+"DELETED";
	}
	@PutMapping("updatequery/{newid}/{oldid}")
	public String updateStore(@PathVariable int newid,@PathVariable int oldid) {
		return service.updateinfo(newid, oldid)+"UPDATED";
	}
}
