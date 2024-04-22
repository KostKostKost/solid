import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree {
    private List<Person> familyMembers;

    public FamilyTree() {
        this.familyMembers = new ArrayList<>();
    }

    public void addMember(Person person) {
        familyMembers.add(person);
    }

    public List<Person> getChildren(Person person) {
        List<Person> children = new ArrayList<>();
        return children;
    }

    public List<Person> getSiblings(Person person) {
        List<Person> siblings = new ArrayList<>();
        return siblings;
    }

    public Iterator<Person> iterator() {
        return familyMembers.iterator();
    }
}
