package com.finishing_school.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.finishing_school.model.Users;

@Service
public class UserService {

	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<Users>();
		users.add(new Users(1, " test", "test@mile.com"));
		users.add(new Users(2, "rupa", "rupa@mile.com"));
		users.add(new Users(3, "radha", "radha@mile.com"));
		users.add(new Users(4, "Kappu", "kappu@gmail.com"));
		return users;
	}

	public List<Users> getById(int id) {
		return getAllUsers().stream().filter(user -> user.getId() == id).collect(Collectors.toList());
	}

	public List<Users> getByName(String name) {
		return getAllUsers().stream().filter(userName -> userName.getName().startsWith(name)).collect(Collectors.toList());
	}
}
