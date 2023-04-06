package com.example.PP312.dao;



import com.example.PP312.entity.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(Long id, User updatedUser);
}
