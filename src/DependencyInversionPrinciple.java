import javax.management.relation.Relation;
import java.util.ArrayList;

// Note: this class is not complete because I could not use Triplet for some reason...

enum Relationship {
    PARENT, CHILD, SIBLING
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}


class Relationships
{
//    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();
//
//    private void addParentAndChild(Person parent, Person child)
//    {
//        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
//        relations.add(new Triplet<>(child, Relationship.CHILD, parent));
//    }
}

class Research
{
    public Research(Relationship relationship)
    {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();

    }
}