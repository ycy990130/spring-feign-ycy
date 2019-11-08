package com.ycy.mapper;

import com.ycy.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    Long findUserCount();

    List<User> findUserList(@Param("page") int page, @Param("rows")Integer rows);

    @Insert("insert into t_user(account,password) values(#{account},#{password})")
    void saveUser(User user);
}
