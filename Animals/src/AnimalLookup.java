import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalLookup {
    public static List<Animal> findAnimal(Collection<Animal> animals, String name) {
        return animals.stream().filter((animal) -> animal.getName().equals(name)).collect(Collectors.toList());
    }
}
