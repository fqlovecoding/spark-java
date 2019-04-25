package com.ymdd.sj.user;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;

public class UserController {
	public static void run() {
		post("/users", (req, res) -> UserService.insert(req, res));
		delete("/users/:id", (req, res) -> UserService.delete(req, res));
		put("/users", (req, res) -> UserService.update(req, res));
		get("/users", (req, res) -> UserService.list(req, res));
		get("/users/:name", (req, res) -> UserService.listByName(req, res));
	}
}
