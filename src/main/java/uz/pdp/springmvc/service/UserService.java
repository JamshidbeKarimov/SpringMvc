package uz.pdp.springmvc.service;

import uz.pdp.springmvc.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    User signUp(User user);

    User signIn(String username, String password);

    User getById(UUID id);

    List<User> getAll();
}
