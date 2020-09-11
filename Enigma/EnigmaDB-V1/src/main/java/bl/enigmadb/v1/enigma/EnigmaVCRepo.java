package bl.enigmadb.v1.enigma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EnigmaVCRepo extends JpaRepository<EnigmaVC, Integer>{
    
    @Query(value = "SELECT COUNT(*) FROM myenigmavc", nativeQuery = true)
    int getCount();
    
}