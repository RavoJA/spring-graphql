package aime.jean.springgraphql.service.impl;

import aime.jean.springgraphql.domain.Person;
import aime.jean.springgraphql.repository.PersonRepository;
import aime.jean.springgraphql.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> fetchAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> fetchAllWithWehicules() {
        return personRepository.findAllWithVehicules();
    }

    @Override
    public Person fetchOne(Integer id) {
        return personRepository.findById(id).orElse(new Person());
    }

    @Override
    public Person fetchOneWithVehicules(Integer id) {
        return personRepository.findOneWithVehicules(id).orElse(new Person());
    }
}
