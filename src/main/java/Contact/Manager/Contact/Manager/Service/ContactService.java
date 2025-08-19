package Contact.Manager.Contact.Manager.Service;

import Contact.Manager.Contact.Manager.Model.ContactList;
import Contact.Manager.Contact.Manager.Model.User;
import Contact.Manager.Contact.Manager.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private UserService userService;


    public void addContact(ContactList contactList,String userName) {
        User byUserName = userService.findByUserName(userName);
        ContactList save = contactRepository.save(contactList);
        byUserName.getContactLists().add(save);
        userService.saveUser(byUserName);
    }


    public ContactList getContactById(String id) {
        return contactRepository.findById(id);
    }

    public void updateContact(ContactList contactList) {
        ContactList existingContact = contactRepository.findById(String.valueOf(contactList.getId()));
        if (existingContact != null) {
            existingContact.setContactNames(contactList.getContactNames());
            existingContact.setContactNumbers(contactList.getContactNumbers());
            existingContact.setContactEmails(contactList.getContactEmails());
            contactRepository.save(existingContact);
        } else {
            throw new RuntimeException("Contact not found with id: " + contactList.getId());
        }
    }

//    public void deleteContact(ContactList contactList) {
//        User user = userService.findByUserName(contactList.getUserName());
//        if (user != null && user.getContactLists().removeIf(c -> c.getId().equals(contactList.getId()))) {
//            contactRepository.delete(contactList);
//            userService.saveUser(user);
//        } else {
//            throw new RuntimeException("Contact not found for user: " + contactList.getUserName());
//        }
//    }

}