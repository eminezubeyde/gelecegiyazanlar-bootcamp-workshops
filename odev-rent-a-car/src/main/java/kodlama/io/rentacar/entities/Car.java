package kodlama.io.rentacar.entities;

import jakarta.persistence.*;
import kodlama.io.rentacar.entities.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int modelYear;
    private String plate;
    @Enumerated
    private State state;
    private double dailyPrice;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
    @OneToMany(mappedBy = "car")
    private List<Maintenance> maintenances;
    @OneToMany(mappedBy = "car")
    private List<Rental> rentals;
}
