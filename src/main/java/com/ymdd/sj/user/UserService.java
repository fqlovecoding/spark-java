package com.ymdd.sj.user;

import java.util.List;

import spark.Request;
import spark.Response;

public class UserService {
	
	private UserMapper userMapper = new UserMapper();
	
	// 查询所有用户列表
	public static List<User> list(Request req, Response res) {
		return null;
	}

	// 根据用户姓名查询用户列表
	public static List<User> listByName(Request req, Response res) {
		return null;
	}

	// 新增用户
	public static boolean insert(Request req, Response res) {
		return true;
	}

	// 删除用户
	public static boolean delete(Request req, Response res) {
		return true;
	}

	// 编辑用户
	public static boolean update(Request req, Response res) {
		return true;
	}
}
