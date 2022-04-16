package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author zhao ding
 * @date 2022/4/16 - 下午10:31
 */
@Repository
public interface UserMapper {

    @Insert("insert into user (name, phone) values(#{name}, #{phone})")
    public int save(User user);
}
