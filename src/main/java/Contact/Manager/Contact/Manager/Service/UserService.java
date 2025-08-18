package Contact.Manager.Contact.Manager.Service;

import Contact.Manager.Contact.Manager.Model.User;
import Contact.Manager.Contact.Manager.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {
    @Autowired
    private UserRepository userRepository;
     public void saveUser(User user) {
         userRepository.save(user);
     }
        public User getUserById(String userName) {
            return userRepository.findByUserName(userName);
        }
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }
        public void updateUser(User user) {
            User existingUser = userRepository.findByUserName(user.getUserName());
            if (existingUser != null) {
                existingUser.setUserName(user.getUserName());
                existingUser.setPassword(user.getPassword());
                userRepository.save(existingUser);
            }
            else {
                throw new RuntimeException("User not found with username: " + user.getUserName());
            }
        }
        public void deleteUser(String userName) {
            User user = userRepository.findByUserName(userName);
            if (user != null) {
                userRepository.delete(user);
            }
        }
}

