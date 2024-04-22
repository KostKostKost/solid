import java.util.ArrayList;
import java.util.List;

public class FamilyTreeServiceImpl implements FamilyTreeService {
    private List<Person> familyMembers;

    public FamilyTreeServiceImpl() {
        this.familyMembers = new ArrayList<>();
    }

    @Override
    public void addMember(Person person) {
        familyMembers.add(person);
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
