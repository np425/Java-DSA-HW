import java.util.Collection;
import java.util.List;

public class AnimalLookup {
    public static List<Animal> findAnimals(Collection<Animal> animals, String name) {
        return animals.stream().filter((animal) -> animal.getName().equals(name)).toList();
    }
}
