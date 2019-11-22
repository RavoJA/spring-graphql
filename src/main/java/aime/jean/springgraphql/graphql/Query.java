package aime.jean.springgraphql.graphql;

import aime.jean.springgraphql.domain.Person;
import aime.jean.springgraphql.domain.Vehicle;
import aime.jean.springgraphql.service.PersonService;
import aime.jean.springgraphql.service.VehicleService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private PersonService personService;

    public List<Vehicle> getVehicles(){
        return vehicleService.fetchAll();
    }

    public Vehicle getVehicle(Integer id) {
        return vehicleService.fetchOne(id);
    }

     public List<Person> getPersons(){
        return personService.fetchAll();
    }

    public Person getPerson(Integer id) {
        return personService.fetchOne(id);
    }
}
