import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new LinkedList<>();

        Fish fishA = new Fish("Nemo");
        fishA.setFinAmount(3);

        Hamster hamsterA = new Hamster("dog");
        hamsterA.setTailLength(10);
        hamsterA.setColor("Purple");

        Fish fishB = new Fish("FishB");
        fishB.setFinAmount(1);

        Hamster hamsterB = new Hamster("cat");
        hamsterB.setTailLength(15);
        hamsterB.setColor("Red");

        Hamster hamsterC = new Hamster("FishB");
        hamsterC.setTailLength(15);
        hamsterC.setColor("Red");

        animals.add(fishA);
        animals.add(fishB);
        animals.add(hamsterA);
        animals.add(hamsterB);
        animals.add(hamsterC);

        Collections.sort(animals);

        animals.forEach(System.out::println);

        System.out.println("------------------------");


        AnimalLookup.findAnimals(animals, "FishB").forEach(System.out::println);
    }
}