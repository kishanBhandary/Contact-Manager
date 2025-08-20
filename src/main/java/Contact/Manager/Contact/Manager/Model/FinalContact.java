package Contact.Manager.Contact.Manager.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("contacts")
public class FinalContact {
    @Id
    private ObjectId id;
    private List<PhoneNumberModel> phoneNumbers = new ArrayList<>();
    private List<GmailModel> gmail = new ArrayList<>();
    private List<AddressModel> addresses = new ArrayList<>();

}

