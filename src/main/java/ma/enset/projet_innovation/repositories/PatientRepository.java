package ma.enset.projet_innovation.repositories;



import ma.enset.projet_innovation.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface PatientRepository extends JpaRepository<Patient,Long> {

    Page<Patient> findByNomContains(String nom, Pageable pageable);

}
