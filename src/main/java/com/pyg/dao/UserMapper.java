package com.pyg.dao;

import com.pyg.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}