package com.example.project4;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,String> {


    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);


    @Query("UPDATE User u SET u.failedAttempt=?1 WHERE u.username=?2")
    @Modifying
    public void updateFailedAttempts(int failedAttempt,String username);



}
