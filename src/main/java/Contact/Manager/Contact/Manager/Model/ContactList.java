package Contact.Manager.Contact.Manager.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactList {
    @Id
    public ObjectId id;
      private List<Contacts> contacts;
        private String Gmail;

}
