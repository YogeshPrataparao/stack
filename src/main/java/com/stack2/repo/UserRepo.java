package com.stack2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stack2.model.User;
@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
	
	@Query(value="select * from StackUsers where uname=?1 and password=?2",nativeQuery=true)
	
	User getUser(String userName,String password);
	
	
	

}
