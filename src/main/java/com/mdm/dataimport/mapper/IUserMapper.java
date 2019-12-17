package com.mdm.dataimport.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mdm.dataimport.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMapper extends BaseMapper<User> {
	int addOne(User user);
	int addBatch(@Param("list") List<User> list);
}
