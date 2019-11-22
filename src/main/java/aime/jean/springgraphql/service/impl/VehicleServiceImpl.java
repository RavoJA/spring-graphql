package aime.jean.springgraphql.service.impl;

import aime.jean.springgraphql.domain.Person;
import aime.jean.springgraphql.domain.Vehicle;
import aime.jean.springgraphql.repository.VehicleRepoistory;
import aime.jean.springgraphql.service.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepoistory vehicleRepoistory;

    public VehicleServiceImpl(VehicleRepoistory vehicleRepoistory) {
        this.vehicleRepoistory = vehicleRepoistory;
    }

    @Override
    public Vehicle saveOrUpdate(Vehicle vehicle) {
        return vehicleRepoistory.save(vehicle);
    }

    @Override
    public List<Vehicle> fetchAll() {
       return vehicleRepoistory.findAllWithPerson();
    }

    @Override
    public Vehicle fetchOne(Integer id) {
        return vehicleRepoistory.findById(id).orElse(new Vehicle());
    }

    @Override
    public List<Vehicle> fetchByPerson(Person person) {
        return vehicleRepoistory.findAllByPerson(person);
    }


}
