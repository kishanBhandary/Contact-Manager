package Contact.Manager.Contact.Manager.Service;

import Contact.Manager.Contact.Manager.Model.FinalContact;
import Contact.Manager.Contact.Manager.Model.User;
import Contact.Manager.Contact.Manager.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ContactService {

    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private UserService userService;

    public void addContactNumber(String userName, FinalContact contacts) {
        User user = userService.findByUserName(userName);
        FinalContact save = contactRepository.save(contacts);
        user.getContacts().add(save);
        userService.saveUser(user);
    }

    public void deleteContact(String userName, String contactId) {
        User user = userService.findByUserName(userName);
        FinalContact contact = contactRepository.findById(contactId);
        user.getContacts().remove(contact);
        userService.saveUser(user);
        contactRepository.delete(contact);

    }
}
