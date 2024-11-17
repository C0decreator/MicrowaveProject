import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "microwave_programs")
public class MicrowaveProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int power;
    private int durationSeconds;
    private boolean isCustom; // True для пользовательских программ

    // Геттеры и сеттеры
}