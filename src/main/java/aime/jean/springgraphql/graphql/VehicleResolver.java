package aime.jean.springgraphql.graphql;

import aime.jean.springgraphql.domain.Person;
import aime.jean.springgraphql.domain.Vehicle;
import aime.jean.springgraphql.service.PersonService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

@Component
@Slf4j
public class VehicleResolver implements GraphQLResolver<Vehicle> {

    public Person person(Vehicle vehicle){

       return  vehicle.getPerson();
    }
}
