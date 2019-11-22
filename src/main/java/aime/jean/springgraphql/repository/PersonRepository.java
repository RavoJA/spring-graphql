package aime.jean.springgraphql.repository;

import aime.jean.springgraphql.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query("select p from Person  p left join  fetch p.vehicles")
    List<Person> findAllWithVehicules();

    @Query("select p from Person  p left join  fetch p.vehicles where p.id =:id")
    Optional<Person> findOneWithVehicules(@Param("id") Integer id);
}
