package Contact.Manager.Contact.Manager.Repository;

import Contact.Manager.Contact.Manager.Model.Contact;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.lang.ScopedValue;

public interface ContactRepository extends MongoRepository<Contact, ObjectId> {

    Contact findById(String contactId);

}
