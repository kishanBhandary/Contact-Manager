package Contact.Manager.Contact.Manager.Repository;

import Contact.Manager.Contact.Manager.Model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
}
