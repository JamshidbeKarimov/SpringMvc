package uz.pdp.springmvc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.springmvc.exception.AlreadyExistsException;
import uz.pdp.springmvc.model.User;
import uz.pdp.springmvc.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final ArrayList<User> users = new ArrayList<>();

    private final UserRepository userRepository;
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public void init() {
        users.add(new User("asdf", 23, "asdf", "asdf"));
    }

    @Override
    public User signUp(User user) {
        checkUsername(user.getUsername());
        userRepository.save(user);
        return user;
    }

    private void checkUsername(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username)) {
                throw new AlreadyExistsException("this username already exists");
            }
        }
    }


    @Override
    public User signIn(String username, String password) {
        User user = userRepository.findByUsername(username);
        if(user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public User getById(UUID id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
