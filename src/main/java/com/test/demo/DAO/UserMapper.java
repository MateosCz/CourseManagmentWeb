package com.test.demo.DAO;

import com.test.demo.Bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    UserBean getUserByID(@Param("userID") String userID, @Param("password") String password );



}
