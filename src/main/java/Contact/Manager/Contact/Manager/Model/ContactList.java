package Contact.Manager.Contact.Manager.Model;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("contactLists")
public class ContactList {
    @Id
    public ObjectId id;
    private String ContactName;
    private String ContactNumber;
      @Email(message = "Invalid email format")
        private String Gmail;

}
