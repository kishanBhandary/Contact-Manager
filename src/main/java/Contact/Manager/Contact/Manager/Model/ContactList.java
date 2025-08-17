package Contact.Manager.Contact.Manager.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactList {
      private List<Contacts> contacts;
        private String Gmail;

}
