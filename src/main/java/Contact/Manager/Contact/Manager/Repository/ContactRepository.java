package Contact.Manager.Contact.Manager.Repository;

import Contact.Manager.Contact.Manager.Model.ContactList;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<ContactList, ObjectId> {


}
