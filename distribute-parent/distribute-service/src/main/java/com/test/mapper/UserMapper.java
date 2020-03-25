package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> selectAllUser();
}
