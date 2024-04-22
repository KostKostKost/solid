import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    private List<Person> people;

    public PersonServiceImpl() {
        this.people = new ArrayList<>();
    }

    @Override
    public void addPerson(Person person) {
        people.add(person);
    }

    @Override
    public List<Person> getChildren(Person person) {
        return null;
    }

    @Override
    public List<Person> getSiblings(Person person) {
        return null;
    }
}
