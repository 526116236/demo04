package com.example.demo04.dao;

import com.example.demo04.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUser();

    int addUser(User user);

    int deleteUser(@Param("id") int id);

    int updateUser(User user);
}
