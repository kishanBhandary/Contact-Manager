package Contact.Manager.Contact.Manager.Repository;

import Contact.Manager.Contact.Manager.Model.ContactList;
import Contact.Manager.Contact.Manager.Model.Contacts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactListRepository extends MongoRepository<Contacts,String> {
}
