package com.example.project.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project.model.Storemodel;

public interface Storerepository  extends JpaRepository<Storemodel, Integer>{
 @Query(value="select * from Onlinebookstore where id=:s or Title=:tn",nativeQuery=true)
 	public List<Storemodel>Storeinfo(@Param("s")int id,@Param("tn")String Title);
 
 @Query(value="delete from Onlinebookstore where id=:s",nativeQuery = true)
   public int deletestore(@Param("s")int id);
 
 @Query(value="update Onlinebookstore set id=?1 where id=2",nativeQuery = true)
 public int updateinfo(int newid,int oldid);
 
}
