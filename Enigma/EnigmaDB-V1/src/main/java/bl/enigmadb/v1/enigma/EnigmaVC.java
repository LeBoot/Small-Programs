package bl.enigmadb.v1.enigma;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "myenigmavc")
public class EnigmaVC {
    
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "vc")
    private String vc;
    
}