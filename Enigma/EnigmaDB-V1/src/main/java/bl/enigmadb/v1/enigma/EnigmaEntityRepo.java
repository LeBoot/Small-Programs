package bl.enigmadb.v1.enigma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnigmaEntityRepo extends JpaRepository<EnigmaEntity, Integer> {}