package Contact.Manager.Contact.Manager.Service;

import Contact.Manager.Contact.Manager.Model.*;
import Contact.Manager.Contact.Manager.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;

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


    private void addGmail(FinalContact finalContact, String userName, GmailModel gmailModel){
        User user = userService.findByUserName(userName);
        if(user != null) {
            finalContact.getGmail().add(gmailModel);
            contactRepository.save(finalContact);
        }
        else {
            throw new RuntimeException("User not found with username: " + userName);
        }


    }

    private void addAddress(FinalContact finalContact, String userName, AddressModel addressModel) {
        User user = userService.findByUserName(userName);
        if(user != null) {
            finalContact.getAddresses().add(addressModel);
            contactRepository.save(finalContact);
        }
        else {
            throw new RuntimeException("User not found with username: " + userName);
        }
    }

    private void saveFinalContact(FinalContact finalContact) {
        contactRepository.save(finalContact);
    }
}
