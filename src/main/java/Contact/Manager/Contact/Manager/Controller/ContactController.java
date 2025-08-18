package Contact.Manager.Contact.Manager.Controller;
import Contact.Manager.Contact.Manager.Model.ContactList;
import Contact.Manager.Contact.Manager.Model.User;
import Contact.Manager.Contact.Manager.Service.ContactService;
import Contact.Manager.Contact.Manager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;
    @Autowired
    private UserService userService;

    @PostMapping("/{userName}")
    public ResponseEntity<ContactList> addContact(@RequestBody ContactList contactList, @PathVariable String userName) {
        contactService.addContact(contactList,userName);
        return ResponseEntity.ok(contactList);
    }
    @GetMapping("/{userName}")
    public ResponseEntity<?> getContact(@PathVariable String userName) {
        User user = userService.findByUserName(userName);
        if (user != null) {
            return ResponseEntity.ok(user.getContactLists());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
