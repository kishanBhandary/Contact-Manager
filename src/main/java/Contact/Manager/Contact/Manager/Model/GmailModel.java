package Contact.Manager.Contact.Manager.Model;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GmailModel {
    @Email(message = "Invalid email format")
    private String email;
}
