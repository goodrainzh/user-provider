package com.goodrain.demo.user.provider;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.goodrain.demo.vote.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	private Map<Integer, String> userRegisterDB = new HashMap<Integer, String>();
	private int id = 0;

	public Integer registerUser(String name) {
		userRegisterDB.put(++id, name);
		logger.info("register new user [{}] with id [{}]", name, id);
		return id;
	}

	public String getUser(Integer id) {
		String name = userRegisterDB.get(id);
		logger.info("get user [{}] with name [{}]", name, id);
		return name;
	}
}
