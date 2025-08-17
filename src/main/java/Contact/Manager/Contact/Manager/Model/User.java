package Contact.Manager.Contact.Manager.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("users")
public class User {
    @Id
    private ObjectId objectId;
    @NonNull
    private String username;
    private String password;
    @DBRef
    private List<ContactList> contactLists= new ArrayList<>();
}
