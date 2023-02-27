package interview;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PurchaseDTO {

    public long id;
    public String category;
    public int quantity;
}

