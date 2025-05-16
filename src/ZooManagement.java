import java.util.ArrayList;
import java.util.List;

public class ZooManagement {
    public static void main(String[] args) {
        Bird a = new Penguin("Grounded Penguin",5,"black and white");
        Mammal b = new Lion("Hungry Lion", 8, true);
        Reptile c = new Snake("Poisonous Snake", 9,180);

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(a);
        animals.add(b);
        animals.add(c);

        for(Animal animal : animals){
            animal.displayInformation();
            animal.move();
            animal.makeSound();
            if(animal instanceof Bird){
                ((Bird) animal).fly();
            }
            if(animal instanceof Mammal){
                ((Mammal) animal).move();
            }
            if(animal instanceof Reptile){
                ((Reptile) animal).move();
            }
            System.out.println();
        }
    }
}