package bl.enigmadb.v1.enigma;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "myenigmaentity")
class EnigmaEntity {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "pass")
    private String password;
    
    @Column(name = "passkey")
    private String passkey;

    public EnigmaEntity(String password, String passkey) {
        this.password = password;
        this.passkey = passkey;
    }
    
}