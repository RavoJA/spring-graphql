package aime.jean.springgraphql.graphql;

import aime.jean.springgraphql.domain.Person;
import aime.jean.springgraphql.domain.Vehicle;
import aime.jean.springgraphql.service.PersonService;
import aime.jean.springgraphql.service.VehicleService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private PersonService personService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName) {
        Vehicle vVehicle = new Vehicle();
        vVehicle.setBrandName(brandName);
        vVehicle.setModelCode(modelCode);
        vVehicle.setType(type);
        vVehicle.setLaunchDate(LocalDate.now());
        return this.vehicleService.saveOrUpdate(vVehicle);
    }

    public Person createPerson( final String name, final String adresse) {
        Person person = new Person();
        person.setName(name);
        person.setAdresse(adresse);
        return this.personService.createPerson(person);
    }

}
