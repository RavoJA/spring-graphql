package aime.jean.springgraphql.service;

import aime.jean.springgraphql.domain.Person;
import aime.jean.springgraphql.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle saveOrUpdate(Vehicle vehicle);

    List<Vehicle> fetchAll();

    Vehicle fetchOne(Integer id);

    List<Vehicle> fetchByPerson(Person person);


}
