package com.mdm.dataimport.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mdm.dataimport.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
	void addOne(User user);

	int addBatch(List<User> userList);
}
