package kodlama.io.rentacar.business.dto.responses.get.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {
    private int id;
    private int brandId;
    private String name;
    private String brandName;
}
