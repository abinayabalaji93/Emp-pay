package com.payroll.service;
import com.payroll.User;
import com.payroll.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class UserService {
    private  final UserRepository userRepository;
    public UserService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    public void saveMyUser(User user)
    {

        userRepository.save(user);
    }

    public List<User> showAllUsers(){
        List<User> users = new ArrayList<User>();
        for(User user:userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }

    public void deleteMyUser(int id) {
        userRepository.deleteById(id);
    }

    public User editUser(String username) {
        return userRepository.findByUsername(username);

    }

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmial(email);
    }
}


