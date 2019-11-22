package aime.jean.springgraphql.service;

import aime.jean.springgraphql.domain.Person;

import java.util.List;

public interface PersonService {

    Person createPerson(Person person);

    List<Person> fetchAll();

    List<Person> fetchAllWithWehicules();

    Person fetchOne(Integer id);

    Person fetchOneWithVehicules(Integer id);


}
