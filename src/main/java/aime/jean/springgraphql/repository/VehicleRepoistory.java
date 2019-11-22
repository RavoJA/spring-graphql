package aime.jean.springgraphql.repository;

import aime.jean.springgraphql.domain.Person;
import aime.jean.springgraphql.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepoistory extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findAllByPerson(Person person);

    @Query("select v from Vehicle v join fetch v.person")
    List<Vehicle> findAllWithPerson();
}
