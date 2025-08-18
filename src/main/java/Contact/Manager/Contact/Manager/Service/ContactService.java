package Contact.Manager.Contact.Manager.Service;

import Contact.Manager.Contact.Manager.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private ContactListRepository contactListRepository;

}
