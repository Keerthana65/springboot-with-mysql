package com.keerthi.defect.application.services;

import java.util.List;



import com.keerthi.defect.application.entities.User;

public interface UserService {
	void saveUser( User user);
	List<User> getAllUser();
	void updateUser(User user);
	void deleteUserById(int moduleid);
}
