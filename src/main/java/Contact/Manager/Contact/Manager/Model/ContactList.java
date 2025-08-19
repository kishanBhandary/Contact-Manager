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
    public  String userName;
    private List<String> contactNames;
    private List<String> contactNumbers;
    @Email(message = "Invalid email format")
  private List<String> contactEmails;
    public ContactList(List<String> contactNames, List<String> contactNumbers, List<String> contactEmails, String userId) {
        this.contactNames = contactNames;
        this.contactNumbers = contactNumbers;
        this.contactEmails = contactEmails;
    }

}
