package com.exam.service;

import java.util.Set;


import com.exam.dto.UserDTO;
import com.exam.exception.UserAlreadyExistsException;
import com.exam.exception.UserNotFoundException;
import com.exam.modal.User;
import com.exam.modal.UserRole;


public interface UserService {
public User createUser(User user , Set<UserRole> userRole) throws UserAlreadyExistsException ;
//get user by username
//public UserDTO getUserByName(String username) throws UserNotFoundException ;
//del user by by 
public void deleteUser(long userId) ;
//updating user

//public void updateUser(long userId, String email, String first, String last, String profile);

public UserDTO getUserById(long id) throws UserNotFoundException;
public void updateUser(Long userId, String email)throws UserNotFoundException;
public Set<User> getUsers();







}

