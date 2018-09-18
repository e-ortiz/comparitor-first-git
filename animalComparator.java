import java.util.Comparator;

public class animalComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal animal0, Animal animal1) {
        return animal0.getLegs() - animal1.getLegs();
    }

}