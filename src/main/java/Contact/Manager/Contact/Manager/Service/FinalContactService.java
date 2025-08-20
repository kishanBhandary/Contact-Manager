package Contact.Manager.Contact.Manager.Service;

import Contact.Manager.Contact.Manager.Model.FinalContact;
import Contact.Manager.Contact.Manager.Model.PhoneNumberModel;
import Contact.Manager.Contact.Manager.Model.User;
import Contact.Manager.Contact.Manager.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FinalContactService {

    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private UserService userService;
    public void addPhoneNumber(FinalContact finalContact, String userName, PhoneNumberModel phoneNumberModel) {
        User user = userService.findByUserName(userName);
        if(user != null) {
            finalContact.getPhoneNumbers().add(phoneNumberModel);
            contactRepository.save(finalContact);
        }
        else {
            throw new RuntimeException("User not found with username: " + userName);
        }
    }
}
