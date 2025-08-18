package Contact.Manager.Contact.Manager.Controller;

import Contact.Manager.Contact.Manager.Model.User;
import Contact.Manager.Contact.Manager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok(user);
    }
    @PutMapping("/{userName}")
    public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable String userName) {
        userService.updateUser(user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUser(@RequestParam String userName) {
        userService.deleteUser(userName);
        return ResponseEntity.ok("User deleted successfully");
    }
}
