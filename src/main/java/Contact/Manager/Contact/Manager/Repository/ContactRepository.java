package Contact.Manager.Contact.Manager.Repository;

import Contact.Manager.Contact.Manager.Model.FinalContact;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<FinalContact, ObjectId> {

    FinalContact findById(String contactId);

}
