import java.util.List;

public interface PersonService {
    void addPerson(Person person);
    List<Person> getChildren(Person person);
    List<Person> getSiblings(Person person);
}
