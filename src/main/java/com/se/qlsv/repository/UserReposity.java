package com.se.qlsv.repository;


import com.se.qlsv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public interface UserReposity extends JpaRepository<User, Long> {


}
