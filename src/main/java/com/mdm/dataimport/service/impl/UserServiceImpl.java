package com.mdm.dataimport.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mdm.dataimport.entity.User;
import com.mdm.dataimport.mapper.IUserMapper;
import com.mdm.dataimport.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper, User> implements IUserService {
	@Resource
	private IUserMapper userMapper;

	@Override
	public void addOne(User user) {
		if(user!=null&&user.getId()!=null){

//			user.insert();
			userMapper.addOne(user);
		}
		System.out.println("ok");
	}

	@Override
	public int addBatch(List<User> userList) {
		return userMapper.addBatch(userList);
	}
}
