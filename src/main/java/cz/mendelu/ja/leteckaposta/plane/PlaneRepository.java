package cz.mendelu.ja.leteckaposta.plane;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Character> {
    @Query("SELECT p FROM planes p WHERE p.code = ?1")
    Optional<Plane> findPlaneByCode(String code);
}
