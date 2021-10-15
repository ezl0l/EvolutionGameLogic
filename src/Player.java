import java.util.ArrayList;

public class Player {
    private String name;
    private int food;
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal createAnimal(){
        Animal newAnimal = new Animal(animals.size());
        animals.add(newAnimal);
        return newAnimal;
    }

    public Animal getAnimal(int animalID){
        return animals.get(animalID);
    }

    public int getFood() {
        return food;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
