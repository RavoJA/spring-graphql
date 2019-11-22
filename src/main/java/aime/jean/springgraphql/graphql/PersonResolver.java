package aime.jean.springgraphql.graphql;

import aime.jean.springgraphql.domain.Person;
import aime.jean.springgraphql.domain.Vehicle;
import aime.jean.springgraphql.service.VehicleService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class PersonResolver implements GraphQLResolver<Person> {

    private final VehicleService vehicleService;

    public PersonResolver(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public List<Vehicle> vehicles(Person person) {
        log.info("fetching vehicules");
        return vehicleService.fetchByPerson(person);
    }
}
