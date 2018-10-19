package com.example.demo2.repository;

import com.example.demo2.pojo.Userin;
import com.example.demo2.pojo.Userinfo;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserinRepository extends JpaRepository<Userin, Long> {
    Userin findUserinByUnameAndUpwd(String uname, String upwd);
    @Query("from Userin where userid = :userid")
    Userin getone(@Param("userid") Long userid);

    @Query("from Userinfo ui join fetch ui.userins")
    public List<Userinfo> getAll();

    Userin findByUnameOrUpwd(@Param(value = "uname") String username,@Param(value = "upwd") String upwd);

}
