package kodlama.io.rentacar.business.dto.responses.get.car;


import kodlama.io.rentacar.entities.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetCarResponse {
    private int id;
    private int modelYear;
    private String plate;
    private State state;
    private double dailyPrice;
    private int modelId;
    private int brandId;
    private String modelName;
    private String modelBrandName;
}