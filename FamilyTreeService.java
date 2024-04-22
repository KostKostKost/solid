import java.util.List;

public interface FamilyTreeService {
    void addMember(Person person);
    List<Person> getChildren(Person person);
    List<Person> getSiblings(Person person);
}
