package Contact.Manager.Contact.Manager.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumberModel {

    private String numberName;
    private String number;
}
